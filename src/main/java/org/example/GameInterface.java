package org.example;

import org.example.units.BaseHero;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<BaseHero> arrayList);

    String getInfo();
}
