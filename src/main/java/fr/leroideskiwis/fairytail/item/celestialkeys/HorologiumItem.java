package fr.leroideskiwis.fairytail.item.celestialkeys;

import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;
import fr.leroideskiwis.fairytail.entities.characters.spirit.CelestialSpirit;
import fr.leroideskiwis.fairytail.entities.characters.spirit.Horologium;
import fr.leroideskiwis.fairytail.item.CelestialKeyItem;

public class HorologiumItem extends CelestialKeyItem {

    @Override
    public CelestialSpirit createNewSpirit(GameCharacter owner) {
        return new Horologium(owner);
    }
}
