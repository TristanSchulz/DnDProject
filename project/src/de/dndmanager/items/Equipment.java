package de.dndmanager.items;

import java.util.ArrayList;

abstract class Equipment extends Item
{
	public Equipment(String name, int cost, int weight, ArrayList<Ability> modifier)
    {
        super(name,cost,weight,modifier);
    }
}