package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe {

    private char[][] mat;

    public TicTacToe() {
    }

    public TicTacToe(String game) {
        int index = 0;
        
        mat = new char[3][3];
               
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[row].length; col++){
                if (index < game.length()){
                    mat[row][col] = game.charAt(index);
                    index++;
                }
            }
        }
     
    }

    public String getWinner() {
        for (int row = 0; row < mat.length; row++){           
            if (mat[row][0] == mat[row][1] && mat[row][1] == mat[row][2]){
                return mat[row][0] + " wins horizontally!";
            }       
        }

        for (int col = 0; col < 3; col++){
            if(mat[0][col] == mat[1][col] && mat[1][col] == mat[2][col]){
                return mat[0][col] + " wins vertically!";
            }
        }

        if((mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]) || mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]){
            return mat[1][1] + " wins diagonally!";
        }







        return "cat's game - no winner!";
    }

    public String toString() {
        String output = "";
        
        for (int r = 0; r < mat.length; r++){
            
            for (int c = 0; c < mat[r].length; c++){
                output += mat[r][c] + " ";
            }
            output += "\n";
        }


        output += getWinner();


        return output + "\n\n";
    }
}