package de.dndmanager.items;
import de.dndmanager.abilities.*;
import java.util.ArrayList;

public abstract class Item
{
    private String name;
    private int cost;
    private int weight;
    private ArrayList<Ability> modifier;

    public Item(String name,int cost, int weight, ArrayList<Ability>modifier)
    {
    	setName(name);
    	setCost(cost);
    	setWeight(weight);
    	setModifier(modifier);
    }

    protected void setName(String name)
    {
    	this.name = name;
    }

    protected String getName()
    {
    	return name;
    }

    protected void setCost(int cost)
    {
    	this.cost = cost;
    }

    protected int getCost()
    {
    	return cost;
    }

    protected void setWeight(int weight)
    {
    	this.weight = weight;
    }

    protected int getWeight()
    {
    	return weight;
    }

    protected void setModifier(ArrayList<Ability> modifier)
    {
    	for(int i = 0; i < modifier.size(); i++)
    	{
    		modifier.get(i).setBase(0);
    		modifier.get(i).setSave(0);
    	}
    	this.modifier = modifier;
    }

    protected ArrayList<Ability> getModifier()
    {
    	return modifier;
    }
}