package s11_nestedloops;

// A+ Computer Science
// www.apluscompsci.com

//nested for loop example

public class NestedForTri
{
   public static void main(String args[])
   {

   	/*
                        *
			**
			***
			****
			*****
			******
			*******
			********
			*********
		*/

		int stop=9;
                for (int i = 0; i <= stop; i++){
                    for (int star = 0; star < i; star++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
		


	}
}