import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner iScanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.menu_run(iScanner);
        iScanner.close();
    }
}