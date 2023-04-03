package org.example.units;

import org.example.Position;
import org.example.units.BaseHero;

import java.util.ArrayList;

/**
 * Копьеносец
 */
public class Spearman extends BaseHero {
    private int spear;

    public int getSpear() {
        return spear;
    }
    public void setSpear(int spear) {
        this.spear = spear;
    }

    public Spearman(String name, Position position) {
        super(70, name, position, 100, new int[]{8,10}, 50);
        spear = 10;
    }

    @Override
    public void step(ArrayList<BaseHero> enemyTeam) {

    }

    @Override
    public void Die() {

    }
}
