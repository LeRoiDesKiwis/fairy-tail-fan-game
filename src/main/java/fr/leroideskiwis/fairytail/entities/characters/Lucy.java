package fr.leroideskiwis.fairytail.entities.characters;

import fr.leroideskiwis.fairytail.attacks.Attack;
import fr.leroideskiwis.fairytail.attacks.LucyAttack;
import fr.leroideskiwis.fairytail.core.Location;
import fr.leroideskiwis.fairytail.item.CelestialKeyItem;

import java.util.ArrayList;
import java.util.List;

public class Lucy extends Attacker{

    public final List<CelestialKeyItem> keys = new ArrayList<>();

    public Lucy(CharacterType characterType, int health, Location location) {
        super(characterType, health, location);
    }

    @Override
    public Attack attack(GameCharacter gameCharacter) {
        return new LucyAttack(this, gameCharacter);
    }

    @Override
    public Attack specialAttack(GameCharacter gameCharacter) {
        return null;
    }
}
