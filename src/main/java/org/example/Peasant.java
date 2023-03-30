package org.example;

/**
 * Крестьянин
 */
public class Peasant extends BaseHero{
    private int invisible; // невидимость
    public int getInvisible() {
        return invisible;
    }
    public void setInvisible(int invisible) {
        this.invisible = invisible;
    }

    public Peasant(String name, int x, int y) {
        super(50, 70, name, x, y, 0, new int[] {1, 2}, 55 );
        invisible = 10;
    }
}
