package fr.leroideskiwis.fairytail.entities.eatable;

import fr.leroideskiwis.fairytail.entities.characters.CharacterType;
import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;

public class Fire implements Eatable{

    @Override
    public boolean canBeEat(GameCharacter gameCharacter) {
        return gameCharacter.isType(CharacterType.DRAGON_FIRE);
    }

    @Override
    public void applyEat(GameCharacter gameCharacter) {
        gameCharacter.feed(0.2);
    }
}