package de.dndmanager.races;

import de.dndmanager.abilities.*;

public class Racial_Traits
{
    Charisma charisma;
    Constitution constitution;
    Dexterity dexterity;
    Intelligence intelligence;
    Strength strength;
    Wisdom wisdom;
    public Racial_Traits(int charisma, int constitution, int dexterity, int intelligence, int strength, int wisdom)
    {
     setCharisma(new Charisma(charisma,0,0));
     setConstitution(new Constitution(constitution,0,0));
     setDexterity(new Dexterity(dexterity,0,0));
     setIntelligence(new Intelligence(intelligence,0,0));
     setStrength(new Strength(strength,0,0));
     setWisdom(new Wisdom(wisdom,0,0));
    }

    public Charisma getCharisma()
    {
        return charisma;
    }

    public void setCharisma(Charisma charisma)
    {
        this.charisma = charisma;
    }

    public Constitution getConstitution()
    {
        return constitution;
    }

    public void setConstitution(Constitution constitution)
    {
        this.constitution = constitution;
    }

    public Dexterity getDexterity()
    {
        return dexterity;
    }

    public void setDexterity(Dexterity dexterity)
    {
        this.dexterity = dexterity;
    }

    public Intelligence getIntelligence()
    {
        return intelligence;
    }

    public void setIntelligence(Intelligence intelligence)
    {
        this.intelligence = intelligence;
    }

    public Strength getStrength()
    {
        return strength;
    }

    public void setStrength(Strength strength)
    {
        this.strength = strength;
    }

    public Wisdom getWisdom()
    {
        return wisdom;
    }

    public void setWisdom(Wisdom wisdom)
    {
        this.wisdom = wisdom;
    }
}
