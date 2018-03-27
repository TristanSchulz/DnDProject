package de.dndmanager.classes;

import de.dndmanager.abilities.Wisdom;
import de.dndmanager.dice.D8;

public class Cleric extends Class
{
    public Cleric()
    {
        super("Cleric", "A priestly champion who wields divine magic in service of a higher power",new D8(),new Wisdom(0,2,0));
    }
}
