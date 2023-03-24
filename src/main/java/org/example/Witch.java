package org.example;

public class Witch extends BaseHero{
    int potion; // количество зелья
    int power; // мощность зелья

    public Witch(String name, int x, int y) {
        super(90, 100, name, x, y, 0, new int[]{1,2}, 100);
        potion = 10;
        power = 3;
    }
}
