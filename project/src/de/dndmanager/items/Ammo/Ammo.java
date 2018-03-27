package de.dndmanager.items.Ammo;

import de.dndmanager.abilities.Ability;
import de.dndmanager.items.Attrib;
import de.dndmanager.items.Item;

import java.util.ArrayList;

public class Ammo extends Item {
    public Ammo(String name, int cost, int weight, Attrib attribute, ArrayList<Ability> modifier) {
        super(name, cost, weight, attribute, modifier);
    }
}
