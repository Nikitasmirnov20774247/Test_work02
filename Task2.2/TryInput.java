import java.util.Scanner;


public class TryInput
{
    public static Toy newToy(Scanner iScanner)
    {
        String name = inputName(iScanner);
        double weight = 0;
        boolean isTrue = false;
        while (!isTrue) {
            weight = inputWeight(iScanner);
            if (weight > 0 && weight <= 100)
            {
                isTrue = true;
            }
            else
            {
                System.out.println("!! Введено некорректное значение, попробуйте снова !!");
            }
        }
        Toy toy = new Toy();
        toy.setName(name);
        toy.setWeight(weight);
        return toy;
    }

    public static String inputName(Scanner iScanner)
    {
        System.out.print("\n(Данные вводить на английском)\nВведите название игрушки: ");
        String name = iScanner.next().replace(" ", "");
        return name;
    }

    public static double inputWeight(Scanner iScanner)
    {
        while (true)
        {
            try
            {
                System.out.print("Введите вес (значение от 1 до 100): ");
                Double t = Double.parseDouble(iScanner.next());
                return t;
            }
            catch (NumberFormatException ne)
            {
                System.out.println("!! Введено некорректное значение, попробуйте снова !!");
            }
        }
    }
}