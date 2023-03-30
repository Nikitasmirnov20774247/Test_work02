import java.util.Scanner;

public class Menu
{
    public void menu_run(Scanner iScanner)
    {
        String choice = "";

        while (!choice.equals("5"))
        {
            System.out.print("\nГлавное меню\n" +
            "1 - разыграть игрушку\n" +
            "2 - посмотреть список игрушек\n" +
            "3 - добавить игрушку\n" +
            "4 - выход из программы\n" +
            "Выберете пукт меню: ");
            iScanner = new Scanner(System.in);
            choice = iScanner.next();

            if (choice.equals("1"))
            {
                ToyLottery.lottery(FileOper.readFile());
            }
            if (choice.equals("2"))
            {
                FileOper.watchToysList(FileOper.readFile());
            }
            if (choice.equals("3"))
            {
                FileOper.inputToFile(TryInput.newToy(iScanner));
            }
            if (choice.equals("4"))
            {
                break;
            }
        }
    }
}