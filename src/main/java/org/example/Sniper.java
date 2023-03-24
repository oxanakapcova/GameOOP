package org.example;

public class Sniper extends BaseHero {
    int arrows; // стрелы
    int accuracy; // точность
    public Sniper(String name, int x, int y) {
        super(60, 100, name, x, y, 95, new int[] {6,12}, 80);
        arrows = 10;
        accuracy = 90;
    }
}
