package de.dndmanager.items.Gear;

import de.dndmanager.abilities.Ability;
import de.dndmanager.items.Attrib;

import java.util.ArrayList;

public class Abacus extends Gear {
    public Abacus(String name, int cost, int weight, Attrib attribute, ArrayList<Ability> modifier) {
        super("Abacus", 200, 2, null, new ArrayList<Ability>());
    }
}
