package s19_interfaces_23;

// A+ Computer Science
// www.apluscompsci.com

//sort example using an array of Comparable

import static java.lang.System.*;
import java.util.Arrays;

public class Sort
{
	public static void main ( String[] args )
	{
		Comparable[] creatureList = new Creature[3];
		//add 3 creatures to creatureList
		
		creatureList[0] = new Creature(70);
		creatureList[1] = new Creature(50);
		creatureList[2] = new Creature(60);
                
		
		Arrays.sort(creatureList);  		//will throw an exception until
															//creatures are added to the array		
		
		for(Comparable it : creatureList)
		{
			out.println(it);
		}		
  }
}