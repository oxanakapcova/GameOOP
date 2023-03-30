package org.example;

/**
 * Класс вор
 */
public class Thief extends BaseHero {
    private int knife;

    public int getKnife() {
        return knife;
    }
    public void setKnife(int knife) {
        this.knife = knife;
    }

    public Thief(String name, int x, int y){
        super(70, 100, name, x, y, 80, new int[]{8, 10}, 50);
        int knife = 10; // кол ножей

    }
}
