package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner {

    public static void main(String[] args) {
        //add in input
        Scanner keyboard = new Scanner(in);
        
      
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a whole number :: ");
            int number = keyboard.nextInt();
            System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
            System.out.println(number + " is even :: " + NumberVerify.isEven(number) + "\n\n");
        }
        //add in more test cases
    }
}