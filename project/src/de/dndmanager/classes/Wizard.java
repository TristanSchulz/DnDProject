package de.dndmanager.classes;

import de.dndmanager.abilities.Intelligence;
import de.dndmanager.dice.D6;

public class Wizard extends Class
{
    public Wizard()
    {
        super("Wizard", "A scholarly magic-user capable of manipulating the structures of reality", new D6(), new Intelligence(0, 2, 0));
    }
}
