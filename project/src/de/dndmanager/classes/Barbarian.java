package de.dndmanager.classes;

import de.dndmanager.abilities.Strength;
import de.dndmanager.dice.D12;

public class Barbarian extends Class
{
    public Barbarian()
    {
        super("Barbarian" , "A fierce warrior of primitive background who can enter a battle rage",new D12(), new Strength(0,2,0));
    }
}
