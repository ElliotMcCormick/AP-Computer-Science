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
        String howDidTheyWin = "";
        
        if (!playChoice.equals("Rock") && !playChoice.equals("Paper") && !playChoice.equals("Scissors") && !playChoice.equals("Spock") && !playChoice.equals("Lizard")) {
            winner = "That's not an option!";
        }
        else if (compChoice.equals(playChoice)){
            winner = "No One wins! <<" + compChoice + " == " + playChoice + ">>";
        }
        else if (compChoice.equals("Rock") && (playChoice.equals("Scissors") || playChoice.equals("Lizard"))){
            if (playChoice.equals("Scissors")){
                howDidTheyWin = "Breaks";
            } else if (playChoice.equals("Lizard")){
                howDidTheyWin = "Crushes";
            }
            
            winner = "Computer wins! <<" + compChoice + " " + howDidTheyWin + " " + playChoice + ">>";
        }
        else if (compChoice.equals("Paper") && (playChoice.equals("Rock") || playChoice.equals("Spock"))){
            if (playChoice.equals("Rock")){
                howDidTheyWin = "Covers";
            } else if (playChoice.equals("Spock")){
                howDidTheyWin = "Disapproves";
            }
            
            winner = "Computer wins! <<" + compChoice + " " + howDidTheyWin + " " + playChoice + ">>";
        } 
        else if (compChoice.equals("Scissors") && (playChoice.equals("Paper") || playChoice.equals("Lizard"))){
            if (playChoice.equals("Paper")){
                howDidTheyWin = "Cuts";
            } else if (playChoice.equals("Lizard")){
                howDidTheyWin = "Decapitates";
            }
            
            winner = "Computer wins! <<" + compChoice + " " + howDidTheyWin + " " + playChoice + ">>";
        }
        else if (compChoice.equals("Spock") && (playChoice.equals("Rock") || playChoice.equals("Scissors"))){
            if (playChoice.equals("Rock")){
                howDidTheyWin = "Breaks";
            } else if (playChoice.equals("Scissors")){
                howDidTheyWin = "Crushes";
            }
            
            winner = "Computer wins! <<" + compChoice + " " + howDidTheyWin + " " + playChoice + ">>";
        }
        else if (compChoice.equals("Lizard") && (playChoice.equals("Paper") || playChoice.equals("Spock"))){
            if (playChoice.equals("Paper")){
                howDidTheyWin = "Eats";
            } else if (playChoice.equals("Spock")){
                howDidTheyWin = "Poisons";
            }
            
            winner = "Computer wins! <<" + compChoice + " " + howDidTheyWin + " " + playChoice + ">>";
        }
        else {
            howDidTheyWin = "beats";
            winner = "Player wins! <<" + playChoice + " " + howDidTheyWin + " " + compChoice + ">>";
        }
        return winner;
    }

    public String toString() {
        String output = "";
        output += "player had " + playChoice + "\n";
        output += "computer had " + compChoice + "\n";
        output += determineWinner();
        return output;
        
    }
}