package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreakerRunner {

    public static void main(String args[]) {
        LineBreaker test = new LineBreaker();
        test.setLineBreaker("1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9", 4);
        System.out.println(test);
        
        test.setLineBreaker("t h e b i g b a d w o l f h a d b i g e a r s a n d t e e t h", 2);
        System.out.println(test);
        
        test.setLineBreaker("1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9", 4);
        System.out.println(test);
    }
}