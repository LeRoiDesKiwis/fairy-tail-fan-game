package fr.leroideskiwis.fairytail.entities.characters;

import fr.leroideskiwis.fairytail.attacks.Attack;
import fr.leroideskiwis.fairytail.attacks.NatsuAttack;
import fr.leroideskiwis.fairytail.attacks.NatsuSpecialAttack;
import fr.leroideskiwis.fairytail.core.Location;

public class Natsu extends Attacker{

    public Natsu(int health, Location location, CharacterType characterType) {
        super(characterType, health, location);
    }

    @Override
    public Attack attack(GameCharacter gameCharacter) {
        return new NatsuAttack(this, gameCharacter);
    }

    @Override
    public Attack specialAttack(GameCharacter gameCharacter) {
        return new NatsuSpecialAttack(this, gameCharacter);
    }
}
