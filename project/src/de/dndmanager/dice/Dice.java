package de.dndmanager.dice;

import java.util.Random;

public abstract class Dice{


    private int number;
    private int size;

    public int roll(){
        Random r = new Random();
        number = r.nextInt(size);
        return number;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public Dice(int size)
    {
        setSize(size);
        setNumber(0);
    }
}