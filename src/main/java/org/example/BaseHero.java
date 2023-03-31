package org.example;
import java.util.ArrayList;
import java.util.Random;

/**
 * /**
 *  * Арбалетчик, Маг, Манах, Крестьянин, Вор, Снайпер, Копьеносец
 *
 *  BASEHERO: hp, maxhp, name, x,y, attack, damage, def
 *  *
 *  * 1 копьеносец spearman: колет копьем, ходит, защищается.Свойства: spear
 *  *
 *  * 1 Арбалетчик crossbowman: стреляет болтами, берет болты у крестьянина, зарядка арбалета. Свойства:
 *  crossbow
 *  *
 *  * 1 Маг witch: лечит, колдует. Свойства: potion количество зелья, power мощность яда
 *  *
 *  * 2 Манах monk: лечит, колдует. holyWater, power
 *  *
 *  * 1,2 Крестьянин peasant: подносит стрелы и болты, . Свойства: invisible невидимость,
 *  *
 *  * 2 Снайпер sniper: стреляет стрелами, берет стрелы у крестьянина, зарядка лука. Свойства:
 *  arrows стрелы
 *  *
 *  * 2 Вор thief: колет ножом, ходит, прячется.Свойства:  knife
 *
 *  *
 *  */

public abstract class BaseHero implements GameInterface{
    protected Float hp, maxhp; // здоровье
    protected String name;
    protected Position position;
    protected int attack;
    protected int[] damage; // урон
    protected int def; // защита

    public Float getHp() {
        return hp;
    }
    public void setHp(Float hp) {
        this.hp = hp;
    }
    public Float getMaxhp() {
        return maxhp;
    }
    public void setMaxhp(Float maxhp) {
        this.maxhp = maxhp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public int[] getDamage() {
        return damage;
    }
    public void setDamage(int[] damage) {
        this.damage = damage;
    }

    public BaseHero(float hp, float maxhp, String name, int x, int y, int attack, int[] damage, int def) {
        this.hp = this.maxhp = hp;
        this.name = name;
        position = new Position(x, y);
        this.attack = attack;
        this.damage = damage;
        this.def = def;
    }

    @Override
    public void step(ArrayList<BaseHero> arrayList) {
    }

    @Override
    public String getInfo() {
        return this.getClass().getSimpleName();
    }




}
