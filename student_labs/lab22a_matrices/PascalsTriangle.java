package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class PascalsTriangle {

    private int[][] mat;

    public PascalsTriangle() {
    }

    public PascalsTriangle(int size) {
        //double for equilateral?
        mat = new int[size][size];
    }

    public void createTriangle() {
        for (int r = 0; r < mat.length; r++){
            mat[r][0] = 1;
        }
        for (int row = 1; row < mat.length; row++){        
            for (int col = 1; col < row; col++){
                mat[row][col] = mat[row - 1][col - 1] + mat[row - 1][col];
            }
            mat[row][row] = 1;
        }
    }

    public String toString() {
        String output = "";
        
        for (int r = 0; r < mat.length; r++){
            for (int s = mat.length; s > r; s--){
                output += " ";
            }
            for (int c = 0; c < mat[r].length; c++){
                
                if (mat[r][c] == 0){
                    output += "  ";
                } else {
                    output += mat[r][c] + " ";
                }
            }
            output += "\n";
        }






        return output;
    }
}