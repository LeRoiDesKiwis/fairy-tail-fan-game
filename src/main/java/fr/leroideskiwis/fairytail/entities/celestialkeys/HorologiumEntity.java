package fr.leroideskiwis.fairytail.entities.celestialkeys;

import fr.leroideskiwis.fairytail.core.Location;
import fr.leroideskiwis.fairytail.item.CelestialKeyItem;
import fr.leroideskiwis.fairytail.item.celestialkeys.HorologiumItem;

public class HorologiumEntity extends CelestialKey {
    public HorologiumEntity(Location location) {
        super(location);
    }

    @Override
    public CelestialKeyItem toItem() {
        return new HorologiumItem();
    }
}
