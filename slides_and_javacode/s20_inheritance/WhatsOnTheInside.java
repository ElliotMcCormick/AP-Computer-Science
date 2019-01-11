package s20_inheritance;

// A+ Computer Science
// www.apluscompsci.com

//inheritance example

import static java.lang.System.*;

class Monster1
{
	private String myName = "long way to go for a toString()";

	public Monster1()
	{
		myName = "Monster1";    //uncomment and recompile and run
	}

	public Monster1( String name )
	{
		myName = name;
	}

	public String toString( )
	{
		return myName;
	}
}

class Witch1 extends Monster1
{
   public Witch1( )	//GoodWitch1 will not compile without this constructor
   { 
   	//automatically calls super()
   }  

   public Witch1( String name )
   {
       super(name);
   }
}

class GoodWitch1 extends Witch1
{
   //what do we need here??
   public GoodWitch1(){
   
   }
   
   public GoodWitch1( String name )
   {
 	  //automatically calls super()
              super(name);

   }
}

public class WhatsOnTheInside
{
	public static void main ( String[] args )
	{
		GoodWitch1 bad = new GoodWitch1();		//why does this not compile
		out.println(bad);
		
		GoodWitch1 witch1 = new GoodWitch1("Harriet");
		out.println(witch1);
	}
}