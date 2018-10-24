package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors {

    private String playChoice;
    private String compChoice;

    public RockPaperScissors() {
    }

    public RockPaperScissors(String player) {
        setPlayers(player);
    }

    public void setPlayers(String player) {
        playChoice = player;
        int num = (int)(Math.random() * 5);
        if (num == 0){
            compChoice = "Rock";
        } else if (num == 1) {
            compChoice = "Paper";
        } else if (num == 2) {
            compChoice = "Scissors";
        } else if (num == 3) {
            compChoice = "Spock";
        } else if (num == 4) {
            compChoice = "Lizard";
        }
    }

    public String determineWinner() {
        String winner = "";
        
        if (compChoice.equals(playChoice)){
            winner = "No One";
        }
        else if (compChoice.equals("Rock") && (playChoice.equals("S") || playChoice.equals("L"))){
            winner = "Computer";
        }
        else if (compChoice.equals("Paper") && (playChoice.equals("R") || playChoice.equals("Sp"))){
            winner = "Computer";
        } 
        else if (compChoice.equals("Scissors") && (playChoice.equals("P") || playChoice.equals("L"))){
            winner = "Computer";
        }
        else if (compChoice.equals("Spock") && (playChoice.equals("R") || playChoice.equals("S"))){
            winner = "Computer";
        }
        else if (compChoice.equals("Lizard") && (playChoice.equals("P") || playChoice.equals("Sp"))){
            winner = "Computer";
        }
        else {
            winner = "Player";
        }
        return winner;
    }

    public String toString() {
        String output = "";
        output += "player had " + playChoice + "\n";
        output += "computer had " + compChoice + "\n";
        output += "!" + determineWinner() + " wins";
        return output;
        
    }
}