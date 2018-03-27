package de.dndmanager.races;

public class Aarakocra extends Race
{
    public Aarakocra(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        super("Aarakocra", 5, 25, 0, 0, 50, 0, "As an aarakocra, you have certain traits in common with your people. Being able to fly at high speed starting at 1st level is exceptionally effective in certain circumstances and exceedingly dangerous in others. As a result, playing an aarakocra requires special consideration by your DM.",
                new Racial_Traits(0,0,2,0,0,1));
    }
}
