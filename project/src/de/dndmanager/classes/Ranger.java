package de.dndmanager.classes;

import de.dndmanager.abilities.Dexterity;
import de.dndmanager.dice.D10;

public class Ranger extends Class
{
    public Ranger()
    {
        super("Ranger", "A warrior who combats threats on the edges of civilization",new D10(),new Dexterity(0,2,0));
    }
}
