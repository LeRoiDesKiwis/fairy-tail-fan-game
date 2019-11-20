package fr.leroideskiwis.fairytail.attacks;

import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;

public abstract class Attack {

    protected final GameCharacter owner;
    protected final GameCharacter attacked;

    public Attack(GameCharacter owner, GameCharacter attacked){
        this.owner = owner;
        this.attacked = attacked;
    }

    public abstract boolean canAttack();

    public abstract void attack();

}
