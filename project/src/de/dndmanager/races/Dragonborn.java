package de.dndmanager.races;

public class Dragonborn extends Race
{
    public Dragonborn(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Dragonborn", 6, 30, 0, 0, 0, 0, "Your draconic heritage manifests in a variety of traits you share with other dragonborn.",
        new Racial_Traits(1,0,0,0,2,0));
    }
}
