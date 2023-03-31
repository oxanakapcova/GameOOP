package org.example;

public class Position {
    protected int x, y;


    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Position defender) {
        return Math.sqrt((defender.x - x)*(defender.x - x) + (defender.y - y)*(defender.y - y));
    }


}
