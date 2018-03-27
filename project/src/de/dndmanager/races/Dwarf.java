package de.dndmanager.races;

public class Dwarf extends Race
{
    public Dwarf(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Dwarf", 4, 25, 0, 0, 0, 0, "Your dwarf character has an assortment of inborn abilities, part and parcel of dwarven nature.",
                new Racial_Traits(0,2,0,0,0,0));    }
}
