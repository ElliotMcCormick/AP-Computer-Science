package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char response;
        GuessingGame game = new GuessingGame();
        
        do {
            System.out.print("Guessing Game - how many numbers? ");
            int upperBound = keyboard.nextInt();
            game.setUpperBound(upperBound);
            game.playGame();
            System.out.println(game);
            System.out.print("Do you want to play again? ");
            response = keyboard.next().charAt(0);
            System.out.println("");
        } while (response == 'y');
    }
}