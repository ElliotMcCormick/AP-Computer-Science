package s19_interfaces_23;

// A+ Computer Science
// www.apluscompsci.com

//interface example

import static java.lang.System.*;

public class Interface
{
	public static void main ( String[] args )
	{

		System.out.println("Interface example\n");

		//Locatable x = new Locatable();  //not possible to instantiate an interface

		Locatable y = new Ship();  //change the constructor up
                Locatable x = new Ship(9,0);

		out.println("Here is a ship " + y);
		out.println("Here is a ship " + x);
                
	}
}