package org.example;

public class Sniper extends BaseHero {
    private int arrows; // стрелы
    private int accuracy; // точность

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public Sniper(String name, int x, int y) {
        super(60, 100, name, x, y, 95, new int[] {6,12}, 80);
        arrows = 10;
        accuracy = 90;
    }
}
