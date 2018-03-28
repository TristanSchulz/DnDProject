package de.dndmanager.items.Armor;

import de.dndmanager.abilities.Ability;
import de.dndmanager.abilities.Dexterity;
import de.dndmanager.items.Attrib;

import java.util.ArrayList;

public class Breastplate extends Armor {
    public Breastplate(String name, int cost, int weight, Attrib attribute, ArrayList<Ability> modifier) {
        super("Breatplate", 40000, 20, null, new ArrayList<Ability>());
    }
}
