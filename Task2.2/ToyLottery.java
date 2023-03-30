import java.util.ArrayList;


public class ToyLottery
{
    public static void lottery(ArrayList<Toy> toys)
    {
        double weight = 0.0;
        for (Toy toy : toys)
        {
            weight += toy.getWeight();
        }
        double rand = Math.random() * weight;
        double countWeight = 0.0;
        for (Toy toy : toys)
        {
            countWeight += toy.getWeight();
            if (countWeight >= rand)
            {
                String[] t = toy.toString().split(" ");
                System.out.println("\nТы выиграл игрушку: " + t[0] + " | Вес игрушки(шанс выпадения) = " + t[1]);
                break;
            }
        }
    }
}
