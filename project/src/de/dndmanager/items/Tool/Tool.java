package de.dndmanager.items.Tool;

import de.dndmanager.abilities.Ability;
import de.dndmanager.items.Attrib;
import de.dndmanager.items.Item;

import java.util.ArrayList;

public class Tool extends Item {
    public Tool(String name, int cost, int weight, Attrib attribute, ArrayList<Ability> modifier) {
        super(name, cost, weight, attribute, modifier);
    }
}
