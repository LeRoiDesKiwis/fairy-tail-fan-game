package fr.leroideskiwis.fairytail.entities;

import fr.leroideskiwis.fairytail.core.Location;

public class Entity {

    private Location location;

    public Entity(Location location){
        this.location = location;
    }

    public void move(int x, int y){
        this.location.x = x;
        this.location.y = y;
    }

}
