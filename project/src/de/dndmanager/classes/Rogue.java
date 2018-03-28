package de.dndmanager.classes;

import de.dndmanager.abilities.Dexterity;
import de.dndmanager.dice.D8;

public class Rogue extends Class
{
    public Rogue()
    {
        super("Rogue","A scoundrel who uses stealth and trickery to overcome obstacles and enemies",new D8(),new Dexterity(0,2,0));
    }
}
