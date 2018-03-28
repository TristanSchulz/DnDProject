package de.dndmanager.races;

public class Genasi extends Race
{
    public Genasi(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Genasi", 6, 30, 0, 0, 0, 0, "Your genasi character has certain characteristics in common with all other genasi.",
                new Racial_Traits(0,2,0,0,0,0)); ;
    }
}
