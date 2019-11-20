package fr.leroideskiwis.fairytail.entities.characters;

import fr.leroideskiwis.fairytail.attacks.Attack;
import fr.leroideskiwis.fairytail.core.Location;

public abstract class Attacker extends GameCharacter{

    public Attacker(CharacterType characterType, int health, Location location) {
        super(characterType, health, location);
    }

    public abstract Attack attack(GameCharacter gameCharacter);

    public abstract Attack specialAttack(GameCharacter gameCharacter);

}
