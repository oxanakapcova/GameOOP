package org.example;

public class Witch extends BaseHero{
    private int potion; // количество зелья
    private int power; // мощность зелья

    public int getPotion() {
        return potion;
    }
    public void setPotion(int potion) {
        this.potion = potion;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public Witch(String name, int x, int y) {
        super(90, 100, name, x, y, 0, new int[]{1,2}, 100);
        potion = 10;
        power = 3;
    }
}
