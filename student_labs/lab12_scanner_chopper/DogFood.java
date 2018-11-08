package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFood {

    private double amount;

    public DogFood() {
        this("");
    }

    public DogFood(String line) {
        Scanner chopper = new Scanner(line);
        double cups = 0;

        while (chopper.hasNextInt()){
            int nextValue = chopper.nextInt();
           
            if(nextValue >= 2 && nextValue <= 4){
                cups += 3.5;
            } 
            else if(nextValue >= 5 && nextValue <= 7){
                cups += 7.0;
            }
            else if(nextValue >= 8 && nextValue <= 9){
                cups += 10.5;
            }
            else if(nextValue >= 10 && nextValue <= 19){
                cups += 14.0;
            }
            else if(nextValue >= 20 && nextValue <= 39){
                cups += 24.5;
            }
            else if(nextValue >= 40 && nextValue <= 59){
                cups += 31.5;
            }
            else if(nextValue >= 60 && nextValue <= 79){
                cups += 42.0;
            }
            else if(nextValue >= 80){
                cups += 52.5;
            }
            
        }
        
        amount = Math.ceil(cups / 60);
        //calc code goes here
        

    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return amount + "\n" + (int)amount + " - 10 POUND BAGS";
    }
}