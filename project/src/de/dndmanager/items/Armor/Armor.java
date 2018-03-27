package de.dndmanager.items.Armor;

import de.dndmanager.abilities.Ability;
import de.dndmanager.items.Attrib;
import de.dndmanager.items.Item;

import java.util.ArrayList;

public class Armor extends Item{
    public Armor(String name, int cost, int weight, Attrib attribute, ArrayList<Ability> modifier) {
        super(name, cost, weight, attribute, modifier);
    }
}
