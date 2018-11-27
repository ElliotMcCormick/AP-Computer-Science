package lab17a_refs_params_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxesRunner {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        Boolean done = false;
        
        do {
            System.out.print("\nEnter the letter for the box :: ");
            char letter = kb.next().charAt(0);

            System.out.print("Enter the size of the box :: ");
            int size = kb.nextInt();

            LetterBoxes.printBox(letter, size);
        
            System.out.print("\nDo you want to enter more sample input? ");
            
            if (!kb.next().equals("y")){
                done = true;
            }
            
        } while (!done);
        
        
        
        
    }
}