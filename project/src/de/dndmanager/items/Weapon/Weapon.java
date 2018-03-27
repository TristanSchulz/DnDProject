package de.dndmanager.items.Weapon;

import de.dndmanager.abilities.Ability;
import de.dndmanager.items.Attrib;
import de.dndmanager.items.Item;

import java.util.ArrayList;

public class Weapon extends Item {

    public Weapon(String name, int cost, int weight, Attrib attribute, ArrayList<Ability> modifier) {
        super(name, cost, weight, attribute, modifier);
    }
}
