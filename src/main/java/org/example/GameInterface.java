package org.example;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<BaseHero> arrayList);

    String getInfo();
}
