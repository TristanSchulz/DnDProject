package de.dndmanager.races;

public class Elf extends Race
{
    public Elf(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Elf", 6, 30, 0, 0, 0, 0, "Your elf character has a variety of natural abilities, the result of thousands of years of elven refinement.",
                new Racial_Traits(0,0,2,0,0,0));
    }
}
