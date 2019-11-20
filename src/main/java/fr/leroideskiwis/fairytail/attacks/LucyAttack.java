package fr.leroideskiwis.fairytail.attacks;

import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;
import fr.leroideskiwis.fairytail.entities.characters.Lucy;

public class LucyAttack extends Attack {

    private Lucy lucy;

    public LucyAttack(GameCharacter owner, GameCharacter attacked) {
        super(owner, attacked);
        this.lucy = (Lucy)owner;
    }

    @Override
    public boolean canAttack() {
        return !lucy.keys.isEmpty();
    }

    @Override
    public void attack() {
        

    }
}
