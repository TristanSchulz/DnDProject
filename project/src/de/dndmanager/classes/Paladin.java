package de.dndmanager.classes;

import de.dndmanager.abilities.Charisma;
import de.dndmanager.dice.D10;

public class Paladin extends Class
{
    public Paladin(){
        super("Paladin","A holy warrior bound to a sacred oath",new D10(),new Charisma(0,2,0));
    }
}
