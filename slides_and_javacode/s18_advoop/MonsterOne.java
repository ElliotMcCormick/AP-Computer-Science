package s18_advoop;

// A+ Computer Science
// www.apluscompsci.com

//monster example one

import static java.lang.System.*;

class MonsterE
{
	private int weight;
	
	public MonsterE( )
	{
		weight=0;
	}
	
	public void print()
	{
		System.out.println("Monster's weight = " + weight);
	}
	
	//add a toString()
	
}

public class MonsterOne
{
	public static void main ( String[] args )
	{
		MonsterE m = new MonsterE();
		m.print();
		System.out.println(m.toString());
		System.out.println(m.hashCode());
	}
}