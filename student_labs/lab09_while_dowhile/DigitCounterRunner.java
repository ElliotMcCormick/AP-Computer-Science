package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitCounterRunner {

    public static void main(String args[]) {
        DigitCounter test = new DigitCounter();
        System.out.println("234 contains " + test.countDigits(234) + " digits");
        System.out.println("10000 contains " + test.countDigits(10000) + " digits");
        System.out.println("111 contains " + test.countDigits(111) + " digits");
        System.out.println("9005 contains " + test.countDigits(9005) + " digits");
        System.out.println("84645 contains " + test.countDigits(84645) + " digits");
        System.out.println("8547 contains " + test.countDigits(8547) + " digits");
        System.out.println("123456789 contains " + test.countDigits(123456789) + " digits");

        
        //add test cases 
    }
}