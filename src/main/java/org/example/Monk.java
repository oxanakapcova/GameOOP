package org.example;

public class Monk extends BaseHero{
    private int holyWater;
    private int power;

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public Monk(String name, int x, int y) {
        super(100, 110, name, x, y, 0, new int[]{1,2}, 100);
        holyWater = 10;
        power = 5;
    }
}
