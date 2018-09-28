package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++){
            out.print("Enter the original bill amount :: ");
            double amt = keyboard.nextDouble();
        
            Discount test = new Discount();
            out.println("Bill after discount :: " + String.format("%.2f", test.getDiscountedBill(amt)) + "\n");
        }

    }
}