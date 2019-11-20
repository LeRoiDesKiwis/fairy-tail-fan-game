package fr.leroideskiwis.fairytail.entities.characters.spirit;

import fr.leroideskiwis.fairytail.attacks.Attack;
import fr.leroideskiwis.fairytail.entities.characters.GameCharacter;

public class Horologium extends CelestialSpirit {
    public Horologium(GameCharacter owner) {
        super(owner);
    }

    @Override
    public void invoke() {

    }

    @Override
    public void update() {

        if(Math.random() < 0.80) owner.heal(5);

    }

    @Override
    public void uninvoke() {

    }
}
