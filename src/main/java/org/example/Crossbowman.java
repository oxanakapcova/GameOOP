package org.example;

/**
 * Арбалетчик
 */
public class Crossbowman extends BaseHero{
    int crossbow;
    public Crossbowman(String name, int x, int y) {
        super(90, 100, name, x, y, 100, new int[]{7,19}, 70);
        crossbow = 10;
    }
}
