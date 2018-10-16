package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitMathRunner {

    public static void main(String args[]) {
        DigitMath test = new DigitMath();
        System.out.println("234 has a digit average of " + test.averageDigits(234) + "\n");
        
        System.out.println("100000 has a digit average of " + test.averageDigits(10000) + "\n");
        
        System.out.println("111 has a digit average of " + test.averageDigits(111) + "\n");
        
        System.out.println("9005 has a digit average of " + test.averageDigits(9005) + "\n");
        
        System.out.println("84645 has a digit average of " + test.averageDigits(84645) + "\n");
        
        System.out.println("8547 has a digit average of " + test.averageDigits(8547) + "\n");
        
        System.out.println("123456789 has a digit average of " + test.averageDigits(123456789) + "\n");
        //add test cases 
    }
}