package de.dndmanager.races;

public class Goliath extends Race
{
    public Goliath(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Goliath", 8, 30, 0, 0, 0, 0, "Goliaths share a number of traits in common with each other.",
                new Racial_Traits(0,1,0,0,2,0));
    }
}
