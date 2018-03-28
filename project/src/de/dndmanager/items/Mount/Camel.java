package de.dndmanager.items.Mount;

import de.dndmanager.abilities.Ability;
import de.dndmanager.items.Attrib;

import java.util.ArrayList;

public class Camel extends Mount {
    public Camel(String name, int cost, int weight, Attrib attribute, ArrayList<Ability> modifier) {
        super("Camel", 480, null, attribute, modifier);
    }
}
