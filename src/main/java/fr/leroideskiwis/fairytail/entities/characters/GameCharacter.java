package fr.leroideskiwis.fairytail.entities.characters;

import fr.leroideskiwis.fairytail.attacks.Attack;
import fr.leroideskiwis.fairytail.core.Health;
import fr.leroideskiwis.fairytail.core.Hungry;
import fr.leroideskiwis.fairytail.core.Location;
import fr.leroideskiwis.fairytail.entities.Entity;

public abstract class GameCharacter extends Entity {

    private CharacterType characterType;
    public Hungry hungry;
    private Health health;

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
    }

    public void heal(int heal){
        health.heal(new Health(heal));
    }

    public void damage(int damage){
        health.damage(new Health(damage));
    }

    public void makeHungry(double hungry){
        this.hungry.makeHungry(new Hungry(hungry));
    }

    public boolean healthlowerOrEqualTo(int health){
        return this.health.lowerOrEqualTo(health);
    }

    public boolean hungryLowerOrEqualTo(double feed){
        return this.hungry.lowerOrEqualTo(feed);
    }

    public abstract Attack attack(GameCharacter gameCharacter);

    public abstract Attack specialAttack(GameCharacter gameCharacter);

}
