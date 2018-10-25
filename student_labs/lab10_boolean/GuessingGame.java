package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame {

    private int upperBound;
    public GuessingGame(){
        this(0);
    }
    
    public GuessingGame(int stop) {
        upperBound = stop;
    }

    public void playGame() {
        Scanner keyboard = new Scanner(System.in);
        int input = 0;
        int random = (int)(Math.random() * upperBound);
        int counter = 0;
        
        while (input != random){
            System.out.println("Enter a number between 1 and " + upperBound + " ");
            input = keyboard.nextInt();
            counter++;
        }
    }

    public String toString() {
        String output = "";
        return output;
    }
}