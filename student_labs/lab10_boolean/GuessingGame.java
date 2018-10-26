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
    private double percentIncorrect;
    private int counter = 0;
    private int random;
    
    public GuessingGame(){
        this(0);
    }
    
    public GuessingGame(int stop) {
        setUpperBound(stop);
    }

    public void setUpperBound(int stop){
        upperBound = stop;
        if (upperBound == 1){
            random = 1;
        } else {
            random = (int)(Math.random() * upperBound);
        }
    }
    
    public void playGame() {
        Scanner keyboard = new Scanner(System.in);
        int input;
        
        
        do {
            System.out.print("Enter a number between 1 and " + upperBound + " ");
            input = keyboard.nextInt();
            if (input > random || input < 1) {
                System.out.println("Number out of range!");
            } else {
                counter++; 
            }
            System.out.println("");
            
        } while (input != random);
        
        percentIncorrect = 100 - (((double)1/counter) * 100);
        
    }

    public String toString() {
        String output = "";
        output += "It took " + counter + " guesses to guess " + random + "\n"; 
        output += "You guessed wrong " + percentIncorrect + " percent of the time\n";
        return output;
    }
}