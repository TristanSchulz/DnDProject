package de.dndmanager.classes;

import de.dndmanager.abilities.Strength;
import de.dndmanager.dice.D10;

public class Fighter extends Class
{
    public Fighter()
    {
        super("Fighter","A master of martial combat, skilled with a variety of weapons and armor",new D10(),new Strength(0,2,0));
    }
}
