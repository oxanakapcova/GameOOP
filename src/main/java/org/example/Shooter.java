package org.example;

import java.util.ArrayList;

public class Shooter extends BaseHero {

    private int accuracy; // точность
    private int arrows; // стрелы
    public int getArrows() {
        return arrows;
    }
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public Shooter(float hp, float maxhp, String name, int x, int y, int attack, int[] damage, int def, int accuracy, int arrows) {
        super(hp, maxhp, name, x, y, attack, damage, def);
    }
    @Override
    public void step (ArrayList< BaseHero > enemy) { // враг
        if (hp <= 0) // если здоровье есть то в этот блок не попадем
            return;
        if (arrows == 0) // если стрелы есть то в этот блок не попадем
            return;
        double minDis = position.distance(enemy.get(0).position); // если живой и стрелы есть то выполнится это
        // находит минимальное расстояние до врага
        int indexEnemy = 0;
        for (int i = 1; i < enemy.size(); i++) {
            double curDis = position.distance(enemy.get(i).position);
            if (curDis < minDis) {
                minDis = curDis;
                indexEnemy = i;
            }
        }
        System.out.println("shoot"); // выстрел (как?)
        // проверка есть ли крестьянин
        if (1 > 0) {// заглушка, не знаю как прописать наличие крестьянина
            System.out.println("Беру стрелу");
        }
        else {
            System.out.println("Завершаю цикл");
        }
    }

}
