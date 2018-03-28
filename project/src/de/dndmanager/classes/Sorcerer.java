package de.dndmanager.classes;

import de.dndmanager.abilities.Charisma;
import de.dndmanager.dice.D6;

public class Sorcerer extends Class
{
    public Sorcerer()
    {
        super("Sorcerer", "A spellcaster who draws on inherent magic from a gift or bloodline",new D6(),new Charisma(0,2,0));
    }
}
