package fr.leroideskiwis.fairytail.core;

public class Health {

    private int health;

    public Health(int health){
        this.health = health;
    }

    public boolean is(int health){
        return this.health == health;
    }

    public boolean lowerOrEqualTo(int health){
        return this.health > health;
    }

    public void heal(Health health){
        this.health+= health.health;
    }

    public void damage(Health health){
        this.health-=health.health;
    }

}
