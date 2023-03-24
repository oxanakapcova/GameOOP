package org.example;

/**
 * Крестьянин
 */
public class Peasant extends BaseHero{
    int invisible; // невидимость

    public Peasant(String name, int x, int y) {
        super(50, 70, name, x, y, 0, new int[] {1, 2}, 55 );
        invisible = 10;
    }
}
