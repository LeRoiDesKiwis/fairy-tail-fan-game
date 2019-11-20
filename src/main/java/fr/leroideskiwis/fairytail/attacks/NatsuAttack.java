package fr.leroideskiwis.fairytail.attacks;

import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;

public class NatsuAttack extends Attack {

    public NatsuAttack(GameCharacter owner, GameCharacter attacked) {
        super(owner, attacked);
    }

    @Override
    public boolean canAttack() {
        return !owner.hungryLowerOrEqualTo(0.05);
    }

    @Override
    public void attack() {
        owner.makeHungry(0.05);
        attacked.damage((int)owner.hungry.applyCoeff(50));

    }
}
