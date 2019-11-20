package fr.leroideskiwis.fairytail.item;

import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;
import fr.leroideskiwis.fairytail.entities.characters.spirit.CelestialSpirit;

public abstract class CelestialKeyItem extends GameItem{

    public abstract CelestialSpirit createNewSpirit(GameCharacter owner);

}
