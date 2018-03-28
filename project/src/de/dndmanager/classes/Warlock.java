package de.dndmanager.classes;

import de.dndmanager.abilities.Charisma;
import de.dndmanager.dice.D8;

public class Warlock extends Class
{
    public Warlock()
    {
        super("Warlock","A wielder of magic that is derived from a bargain with an extraplanar entity",new D8(),new Charisma(0,2,0));
    }
}
