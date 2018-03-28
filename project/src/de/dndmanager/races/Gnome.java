package de.dndmanager.races;

public class Gnome extends Race
{
    public Gnome(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Gnome", 4, 25, 0, 0, 0, 0, "Your gnome character has certain characteristics in common with all other gnomes.",
                new Racial_Traits(0,0,0,2,0,0));    }
}
