package org.example;

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

public abstract class BaseHero {
    Float hp, maxhp; // здоровье
    String name;
    int x, y;
    int attack;
    int[] damage; // урон
    int def; // защита


    public BaseHero(float hp,float maxhp,String name, int x, int y, int attack, int[] damage, int def) {
        this.hp = this.maxhp = hp;
        this.name = name;
        this.x = x;
        this.y = y;
        this.attack = attack;
        this.damage = damage;
        this.def = def;
    }

}
