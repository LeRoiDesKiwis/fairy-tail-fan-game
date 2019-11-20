package fr.leroideskiwis.fairytail.entities.characters;

import fr.leroideskiwis.fairytail.attacks.Attack;
import fr.leroideskiwis.fairytail.core.Health;
import fr.leroideskiwis.fairytail.core.Hungry;
import fr.leroideskiwis.fairytail.core.Location;
import fr.leroideskiwis.fairytail.entities.Entity;
import fr.leroideskiwis.fairytail.item.GameItem;

import java.util.ArrayList;
import java.util.List;

public abstract class GameCharacter extends Entity {

    private final CharacterType characterType;
    public final Hungry hungry;
    private final Health health;
    public final List<GameItem> inventory = new ArrayList<>();

    public GameCharacter(CharacterType characterType, int health, Location location) {
        super(location);
        this.health = new Health(health);
        this.hungry = new Hungry();
        this.characterType = characterType;
    }

    public boolean isType(CharacterType characterType){
        return this.characterType == characterType;
    }

    public void feed(double feed){
        hungry.feed(new Hungry(feed));
        System.out.println("Vous avez été rassasié de "+feed);
    }

    public void heal(int heal){
        health.heal(new Health(heal));
        System.out.println("Vous avez gagné "+heal+" vies");
    }

    public void damage(int damage){
        health.damage(new Health(damage));
        System.out.println("Vous avez perdu "+damage+" vies");
    }

    public void makeHungry(double hungry){
        this.hungry.makeHungry(new Hungry(hungry));
        System.out.println("Votre faim à augmenté de "+hungry);
    }

    public boolean healthlowerOrEqualTo(int health){
        return this.health.lowerOrEqualTo(health);
    }

    public boolean hungryLowerOrEqualTo(double feed){
        return this.hungry.lowerOrEqualTo(feed);
    }

}
