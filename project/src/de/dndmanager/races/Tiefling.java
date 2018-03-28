package de.dndmanager.races;

public class Tiefling extends Race
{
    public Tiefling(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Tiefling", 6, 30, 0,0, 0, 0, "Tieflings share certain racial traits as a result of their infernal descent.",
                new Racial_Traits(2,0,0,1,0,0));
    }
}
