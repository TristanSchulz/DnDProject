package de.dndmanager.items.Weapon;

import de.dndmanager.abilities.Ability;
import de.dndmanager.items.Attrib;

import java.util.ArrayList;

public class Battleaxe extends Weapon{
    public Battleaxe() {
        super("Battleaxe", 100, 4, Attrib.Slashing ,new ArrayList<Ability>());
    }
}
