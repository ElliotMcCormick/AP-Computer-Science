package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class TriangleFiveRunner {

    public static void main(String args[]) {
        TriangleFive test = new TriangleFive();
        test.setAmount(4);
        test.setLetter('C');
        System.out.println(test);
        
        test.setAmount(5);
        test.setLetter('A');
        System.out.println(test);
        
        test.setAmount(7);
        test.setLetter('B');
        System.out.println(test);
        
        test.setAmount(6);
        test.setLetter('X');
        System.out.println(test);
        
        test.setAmount(8);
        test.setLetter('Z');
        System.out.println(test);
    }
}