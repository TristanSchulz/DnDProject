package de.dndmanager.races;

public class Half_Orc extends Race
{
    public Half_Orc(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Half-Orc", 6, 30, 0, 0,0, 0, "Your half-orc character has certain traits deriving from your orc ancestry",
                new Racial_Traits(0,1,0,0,2,0));
    }
}
