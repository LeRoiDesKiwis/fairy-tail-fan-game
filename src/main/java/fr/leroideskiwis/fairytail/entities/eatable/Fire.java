package fr.leroideskiwis.fairytail.entities.eatable;

import fr.leroideskiwis.fairytail.core.Location;
import fr.leroideskiwis.fairytail.entities.Entity;
import fr.leroideskiwis.fairytail.entities.characters.CharacterType;
import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;

public class Fire extends Entity implements Eatable{

    public Fire(Location location) {
        super(location);
    }

    @Override
    public boolean canBeEat(GameCharacter gameCharacter) {
        return gameCharacter.isType(CharacterType.DRAGON_FIRE);
    }

    @Override
    public void applyEat(GameCharacter gameCharacter) {
        gameCharacter.feed(0.2);
    }
}