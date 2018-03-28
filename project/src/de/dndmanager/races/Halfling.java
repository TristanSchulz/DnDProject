package de.dndmanager.races;

public class Halfling extends Race
{
    public Halfling(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Halfling", 3, 25,0, 0, 0, 0, "Your halfling character has a number of traits in common with all other halflings.",
                new Racial_Traits(0,0,2,0,0,0));
    }
}
