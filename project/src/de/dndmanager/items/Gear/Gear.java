package de.dndmanager.items.Gear;

import de.dndmanager.abilities.Ability;
import de.dndmanager.items.Attrib;
import de.dndmanager.items.Item;

import java.util.ArrayList;

public class Gear extends Item {
    public Gear(String name, int cost, int weight, Attrib attribute, ArrayList<Ability> modifier) {
        super(name, cost, weight, attribute, modifier);
    }
}
