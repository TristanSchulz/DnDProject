package de.dndmanager.abilities;
public abstract class Ability
{
    private AbilityType type;
    private int base;
    private int mod;
    private int save;

    public Ability(AbilityType type,int base,int mod,int save)
    {
        setType(type);
        setBase(base);
        setMod(mod);
        setSave(save);
    }

    public AbilityType getType() {
        return type;
    }

    public void setType(AbilityType type) {
        this.type = type;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }
}