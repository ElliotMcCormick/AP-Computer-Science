package lab17a_refs_params_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        boolean done = false;
        
        do {
            System.out.print("\nEnter a word :: ");
            String word = kb.next();
            TriangleWord.printTriangle(word);
            
            System.out.print("\n\nDo you want to enter more sample input? ");
            if (!(kb.next().equals("y"))){
                done = true;
            }
        } while (!done);
    }
}