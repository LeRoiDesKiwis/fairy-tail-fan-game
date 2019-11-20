package fr.leroideskiwis.fairytail.entities.characters.spirit;

import fr.leroideskiwis.fairytail.core.Location;
import fr.leroideskiwis.fairytail.entities.characters.CharacterType;
import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;

public abstract class CelestialSpirit extends GameCharacter{

    protected GameCharacter owner;

    public CelestialSpirit(GameCharacter owner){
        super(CharacterType.SPIRIT, 50, owner.location.getNearLocation(new Location(10, 10)).orElse(new Location(0, 0)));
        this.owner = owner;
    }

    public abstract void invoke();

    public abstract void update();

    public abstract void uninvoke();

}
