import org.example.*;

import java.util.ArrayList;
import java.util.Random;

public class ClientCode  {
    public static void main(String[] args) {
//        Spearman spearman1 = new Spearman("Spearboy", 3, 4);
//        System.out.println("type of spearman1 is: " + spearman1.getInfo());
//        Crossbowman crossbowman1 = new Crossbowman("Crossbowboy", 1,2);
//        Peasant peasant1 = new Peasant("Peasboy", 5, 8);
//        Monk monk1 = new Monk("Monkoboy", 6,6);
//        Witch witch1 = new Witch("Witchboy", 7,7);
//        Sniper sniper1 = new Sniper("Sniperboy", 3, 1);
//        Thief thief1 = new Thief("Thiefboy", 2,9);
        //System.out.println("type of monk1 is: " + monk1.getInfo());
        ArrayList<BaseHero> heroList1 = new ArrayList<>();
        ArrayList<BaseHero> heroList2 = new ArrayList<>();

        Random random = new Random();
            for (int i = 0; i < 10; i++) {
                switch (random.nextInt(7)) {
                    case 0 -> heroList1.add(new Spearman(getRandomName(), 1, 5));
                    case 1 -> heroList1.add(new Sniper(getRandomName(), 2, 8));
                    case 2 -> heroList1.add(new Crossbowman(getRandomName(), 3, 5));
                    case 3 -> heroList1.add(new Peasant(getRandomName(), 1, 6));
                    case 4 -> heroList1.add(new Monk(getRandomName(), 6, 5));
                    case 5 -> heroList1.add(new Witch(getRandomName(), 7, 5));
                    default -> heroList1.add(new Thief(getRandomName(), 2, 10));
                }
            }
        for (int i = 0; i < 10; i++) {
            switch (random.nextInt(7)) {
                case 0 -> heroList2.add(new Spearman(getRandomName(), 1, 5));
                case 1 -> heroList2.add(new Sniper(getRandomName(), 2, 8));
                case 2 -> heroList2.add(new Crossbowman(getRandomName(), 3, 5));
                case 3 -> heroList2.add(new Peasant(getRandomName(), 1, 6));
                case 4 -> heroList2.add(new Monk(getRandomName(), 6, 5));
                case 5 -> heroList2.add(new Witch(getRandomName(), 7, 5));
                default -> heroList2.add(new Thief(getRandomName(), 2, 10));
            }
        }
        System.out.println("    Список 1==========");
        heroList1.forEach(n-> System.out.println(n.getInfo() + " " + n.getName()));
        System.out.println("    Список 2===========");
        heroList2.forEach(n-> System.out.println(n.getInfo() + " " + n.getName()));



    }
    protected  static String getRandomName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }



}
