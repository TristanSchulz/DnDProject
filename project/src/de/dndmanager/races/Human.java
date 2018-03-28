package de.dndmanager.races;

public class Human extends Race
{
    public Human(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Human", 5, 30,0, 0, 0, 0, "It’s hard to make generalizations about humans, but your human character has these traits.",
                new Racial_Traits(1,1,1,1,1,1));
    }
}
