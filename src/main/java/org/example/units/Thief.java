package org.example.units;
import org.example.Position;
import org.example.units.BaseHero;
import java.util.ArrayList;
/**
 * Класс вор
 */
public class Thief extends Soldiers {
    public Thief(String name, Position position){
        super(70, name, position, 80, new int[]{8, 10}, 50, 7);
    }
}
