package de.dndmanager.classes;

import de.dndmanager.abilities.Dexterity;
import de.dndmanager.dice.D8;

public class Monk extends Class
{
    public Monk()
    {
        super("Monk", "A master of martial arts, harnessing the power of the body in pursuit of physical and spiritual perfection", new D8(), new Dexterity(0, 2, 0));
    }
}
