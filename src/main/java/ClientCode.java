import org.example.*;

import java.util.ArrayList;
import java.util.Random;

public class ClientCode  {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroList1 = new ArrayList<>();
        ArrayList<BaseHero> heroList2 = new ArrayList<>();
        System.out.println("    Список 1==========");
        Additionally.getList(heroList1);
        heroList1.forEach(n -> System.out.println(n.getInfo() + " " + n.getName()));
        System.out.println("    Список 2===========");
        Additionally.getList(heroList2);
        heroList2.forEach(n -> System.out.println(n.getInfo() + " " + n.getName()));
    }



}
