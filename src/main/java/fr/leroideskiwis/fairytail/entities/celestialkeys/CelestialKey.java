package fr.leroideskiwis.fairytail.entities.celestialkeys;

import fr.leroideskiwis.fairytail.core.Location;
import fr.leroideskiwis.fairytail.entities.Entity;
import fr.leroideskiwis.fairytail.item.CelestialKeyItem;

public abstract class CelestialKey extends Entity {

    public CelestialKey(Location location) {
        super(location);
    }

    public abstract CelestialKeyItem toItem();

}
