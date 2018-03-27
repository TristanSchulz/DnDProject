package de.dndmanager.classes;

import de.dndmanager.abilities.Charisma;
import de.dndmanager.dice.D8;

public class Bard extends Class
{
  public Bard()
  {
      super("Bard", "An inspiring magician whose power echoes the music of creation",new D8(),new Charisma(0,2,0));
  }
}
