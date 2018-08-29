package s21_abstract;

// A+ Computer Science
// www.apluscompsci.com

//abstract example two 

import static java.lang.System.*;
import java.util.Scanner;

/*
 *  Open up Monster.java
 *  Open up Vampire.java
 *  Open up Witch.java
 *  Open up Ghost.java
 */

public class MonsterTwo
{
  public static void main ( String[] args )
  {
    String name;
    Scanner kb = new Scanner(in);

    Monster m;

    System.out.print("Your name ::  ");
    name = kb.nextLine();

    m = new Vampire(name);
    out.println("Vampire  :: ");
    System.out.println( m );

    System.out.print("\n\nYour name ::  ");
    name = kb.nextLine();

    m = new Witch(name);
    out.println("Witch :: " );
    System.out.println( m );

    System.out.print("\n\nYour name ::  ");
    name = kb.nextLine();

    m = new Ghost(name);
    out.println("Ghost :: " );
    System.out.println( m );
  }
}