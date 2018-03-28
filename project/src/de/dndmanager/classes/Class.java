package de.dndmanager.classes;
import de.dndmanager.abilities.Ability;
import de.dndmanager.dice.*;

public abstract class Class{
    private String name;
    private String description;
    private Dice hit_dice;
    private Ability primary_Ability;

    public Dice getHit_dice()
    {
        return hit_dice;
    }

    public void setHit_dice(Dice hit_dice)
    {
        this.hit_dice = hit_dice;
    }

    public Ability getPrimary_Ability()
    {
        return primary_Ability;
    }

    public void setPrimary_Ability(Ability primary_Ability)
    {
        this.primary_Ability = primary_Ability;
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Class(String name, String description, Dice hit_dice, Ability primary_Ability)
    {
        setName(name);
        setDescription(description);
        setHit_dice(hit_dice);
        setPrimary_Ability(primary_Ability);
    }
}