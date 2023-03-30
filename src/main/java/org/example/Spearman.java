package org.example;

/**
 * Копьеносец
 */
public class Spearman extends BaseHero{
    private int spear;

    public int getSpear() {
        return spear;
    }
    public void setSpear(int spear) {
        this.spear = spear;
    }

    public Spearman(String name, int x, int y) {
        super(70, 90, name, x, y, 100, new int[]{8,10}, 50);
        spear = 10;
    }
}
