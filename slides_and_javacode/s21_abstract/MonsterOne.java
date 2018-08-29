package s21_abstract;

// A+ Computer Science
// www.apluscompsci.com

//abstract example one 

import static java.lang.System.*;
import java.util.Scanner;

/*
 *  Open up Monster.java
 *  Open up Vampire.java
 */

//add in another Monster class
//Sasquatch, Skeleton, Ghoul, Goblin, Ogre, Student, etc.

public class MonsterOne
{
  public static void main ( String[] args )
  {
    String name;
    Scanner kb = new Scanner(in);

    System.out.print("Your name ::  ");
    name = kb.nextLine();

    Vampire vampire = new Vampire(name);
    out.println("Vampire's name :: " + vampire);
    vampire.talk();
  }
}