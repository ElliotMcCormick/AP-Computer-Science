package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class GCDRunner {

    public static void main(String[] args) {
        GCD test = new GCD();
        test.setNums(5, 25);
        System.out.println(test);
        
        test.setNums(4, 400);
        System.out.println(test);
        
        test.setNums(8, 80);
        System.out.println(test);
        
        test.setNums(15, 45);
        System.out.println(test);
        
        test.setNums(9, 9);
        System.out.println(test);
        
        test.setNums(3, 543);
        System.out.println(test);
        //add test cases		
    }
}