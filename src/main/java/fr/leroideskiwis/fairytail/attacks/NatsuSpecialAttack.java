package fr.leroideskiwis.fairytail.attacks;

import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;
import fr.leroideskiwis.fairytail.entities.characters.Natsu;

public class NatsuSpecialAttack extends Attack {
    public NatsuSpecialAttack(Natsu natsu, GameCharacter gameCharacter) {
        super(natsu, gameCharacter);
    }

    @Override
    public boolean canAttack() {
        return !owner.hungryLowerOrEqualTo(0.5);
    }

    @Override
    public void attack() {
        attacked.makeHungry(0.4);
        attacked.damage((int)owner.hungry.applyCoeff(200));
    }
}
