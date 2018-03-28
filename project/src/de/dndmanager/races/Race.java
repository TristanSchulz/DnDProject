package de.dndmanager.races;

public abstract class Race{
    private String name;
    private int size;
    private int speed_walking;
    private int speed_burrowing;
    private int speed_climbing;
    private int speed_flying;
    private int speed_swimming;
    private String description;
    private Racial_Traits racial_traits;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getSpeed_walking()
    {
        return speed_walking;
    }

    public void setSpeed_walking(int speed_walking)
    {
        this.speed_walking = speed_walking;
    }

    public int getSpeed_burrowing()
    {
        return speed_burrowing;
    }

    public void setSpeed_burrowing(int speed_burrowing)
    {
        this.speed_burrowing = speed_burrowing;
    }

    public int getSpeed_climbing()
    {
        return speed_climbing;
    }

    public void setSpeed_climbing(int speed_climbing)
    {
        this.speed_climbing = speed_climbing;
    }

    public int getSpeed_flying()
    {
        return speed_flying;
    }

    public void setSpeed_flying(int speed_flying)
    {
        this.speed_flying = speed_flying;
    }

    public int getSpeed_swimming()
    {
        return speed_swimming;
    }

    public void setSpeed_swimming(int speed_swimming)
    {
        this.speed_swimming = speed_swimming;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Racial_Traits getRacial_traits()
    {
        return racial_traits;
    }

    public void setRacial_traits(Racial_Traits racial_traits)
    {
        this.racial_traits = racial_traits;
    }

    public Race(String name, int size, int speed_walking, int speed_burrowing, int speed_climbing, int speed_flying, int speed_swimming, String description, Racial_Traits racial_traits)
    {
        setName(name);
        setSize(size);
        setSpeed_walking(speed_walking);
        setSpeed_burrowing(speed_burrowing);
        setSpeed_climbing(speed_climbing);
        setSpeed_flying(speed_flying);
        setSpeed_swimming(speed_swimming);
        setDescription(description);
        setRacial_traits(racial_traits);
    }
}