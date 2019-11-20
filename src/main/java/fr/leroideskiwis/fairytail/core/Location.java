package fr.leroideskiwis.fairytail.core;

import fr.leroideskiwis.fairytail.utils.Interval;

import java.util.Optional;

public class Location {

    public int x;
    public int y;

    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isInBorder(Location max){
        return new Interval(0, max.x).isBetween(x) && new Interval(0, max.y).isBetween(y);
    }

    /**
     * prends en paramètre les bordures et retourne la location autour de cette location à 1 bloc
     *
     * @param max Les bordures
     * @return la location autour de cette location
     */
    public Optional<Location> getNearLocation(Location max){

        for(int x = -1; x <= 1; x++){
            for (int y = -1; y <= 1; y++) {
                Location location = new Location(x, y);
                if(location.isInBorder(max)) return Optional.of(location);
            }
        }

        return Optional.empty();

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
