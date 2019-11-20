package fr.leroideskiwis.fairytail.entities.eatable;

import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;

public interface Eatable {

    boolean canBeEat(GameCharacter gameCharacter);

    void applyEat(GameCharacter character);

}
