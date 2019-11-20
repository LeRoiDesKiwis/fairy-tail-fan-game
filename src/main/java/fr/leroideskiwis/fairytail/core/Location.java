package fr.leroideskiwis.fairytail.core;

import fr.leroideskiwis.fairytail.utils.Interval;

public class Location {

    public int x;
    public int y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isInBorder(int xMax, int yMax){
        return new Interval(0, xMax).isBetween(x) && new Interval(0, yMax).isBetween(y);
    }

    /**
     * déplace l'entité de addX cases et addY cases
     *
     * @param addX nombre à ajouter à x
     * @param addY nombre à ajouter à y
     */
    public void move(int addX, int addY){
        this.x+=addX;
        this.y+=addY;
    }
}
