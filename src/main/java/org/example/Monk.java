package org.example;

public class Monk extends BaseHero{
    int holyWater;
    int power;
    public Monk(String name, int x, int y) {
        super(100, 110, name, x, y, 0, new int[]{1,2}, 100);
        holyWater = 10;
        power = 5;
    }
}
