package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char response = 0;

        //add in a do while loop after you get the basics up and running
        do {
            String player = "";

            out.print("Pick you weapon! [Rock, Paper, Scissors, Lizard, Spock] :: ");
            player = keyboard.next();
            //read in the player value

            RockPaperScissors game = new RockPaperScissors();
            game.setPlayers(player);
            System.out.println(game);
        
            System.out.print("\nDo you want to play again? ");
            response = keyboard.next().charAt(0);
        } while (response == 'y');
    }
}
