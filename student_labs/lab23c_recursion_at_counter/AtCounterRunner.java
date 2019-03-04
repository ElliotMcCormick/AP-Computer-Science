package lab23c_recursion_at_counter;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class AtCounterRunner {

    public static void main(String args[]) {
        //instantiate an AtCounter
        //test the code
        AtCounter test = new AtCounter();
        System.out.println(test);
        
        System.out.println(test.countAts(0, 0));
        System.out.println(test.countAts(2, 5));
        System.out.println(test.countAts(5, 0));
        System.out.println(test.countAts(9, 9));
        System.out.println(test.countAts(3, 9));
        
    }
}