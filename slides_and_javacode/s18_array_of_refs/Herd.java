package s18_array_of_refs;

// A+ Computer Science
// www.apluscompsci.com

//array of references as instance variable example

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections;

public class Herd
{
	private Creature[] creatureList;
        private int i = 0;

	public Herd()
	{
            this(0);
//must size the array		

	}		
	
	public Herd(int size)
	{
		//must size the array		
            creatureList = new Creature[size];
	}	
	
	public void add(int Herdize)
	{
		//add in a new creature of size Herdize
            
            creatureList[i] = new Creature(Herdize);
            i++;
	}
	
	public String toString()
	{
		return "" + Arrays.toString(creatureList);
	}
}
