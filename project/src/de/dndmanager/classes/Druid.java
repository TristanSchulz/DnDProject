package de.dndmanager.classes;

import de.dndmanager.abilities.Wisdom;
import de.dndmanager.dice.D8;

public class Druid extends Class
{
    public Druid()
    {
        super("Druid", "A priest of the Old Faith, wielding the powers of nature and adopting animal forms", new D8(), new Wisdom(0,2,0));
    }
}
