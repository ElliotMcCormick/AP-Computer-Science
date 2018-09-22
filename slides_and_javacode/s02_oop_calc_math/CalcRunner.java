package s02_oop_calc_math;

// A+ Computer Science
// www.apluscompsci.com

//modifier method example
//this class runs the Calc class

import static java.lang.System.*;

public class CalcRunner
{
   public static void main(String args[])
   {
   	//instantiate a Calc object
      Calc test = new Calc();

      //comment this line and rerun the program
      test.setNums(4,9);

      test.add();
      test.print();

      test.setNums(45,92);

      test.add();
      test.print();
      
       System.out.println(Math.sqrt(12));
       System.out.println( 9.3 % 3 );				// LINE 5

        System.out.println( 'c' + 5 );				// LINE 6

        System.out.println( Math.pow(3,3) );    		// LINE 7

        System.out.println( Math.ceil(3.4) );    		// LINE 8

        System.out.println( Math.floor(4.6) );   		// LINE 9

        System.out.println( Math.sqrt(12) );  

        System.out.print( Math.ceil(Math.sqrt(17)));	// LINE 19        // LINE 10

      
      //call setNums again
      
   }
}