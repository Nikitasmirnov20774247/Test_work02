import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileOper
{
    public static void inputToFile(Toy toy)
    {
        String text = toy.toString();
        try
        {
            FileWriter writer = new FileWriter("Task2.2/L_Toys.txt", true);
            writer.write(text);
            writer.append('\n');
            writer.close();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Toy> readFile()
    {
        ArrayList<Toy> toyArr = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("Task2.2/L_Toys.txt"));
            String line = br.readLine();
            while (line != null)
            {
                String[] toy = line.split(" ");
                String name = toy[0];
                double weight = Double.parseDouble(toy[1]);
                Toy toyNew = new Toy(name, weight);
                toyArr.add(toyNew);
                line = br.readLine();
            }
            br.close();
        }
        catch (IOException ex)
        {
            System.out.println("!! Файл пуст либо отсутствует !!");
        }
        return toyArr;
    }

    public static void watchToysList(ArrayList<Toy> toys)
    {
        for (Toy toy : toys)
        {
            String[] t = toy.toString().split(" ");
            System.out.println("\nИмя игрушки: " + t[0] + " | Вес игрушки(шанс выпадения) = " + t[1]);
        }
    }
}