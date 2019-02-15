package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class FancyWord {

    private String[][] mat;

    public FancyWord(String s) {
        mat = new String[s.length()][s.length()];
        //size the matrix
        //use Arrays.fill() to fill in the matrix with spaces\
        for (int r = 0; r < mat.length; r++){
            Arrays.fill(mat[r], " ");
        }
        //use a for loop to load in the letters into the matrix
        for (int i=0; i<s.length(); i++){
            mat[0][i] = Character.toString(s.charAt(i));
            mat[i][i]= Character.toString(s.charAt(i));
            mat[mat.length - 1 - i][i] = Character.toString(s.charAt(i));
            mat[s.length() - 1][i] = Character.toString(s.charAt(i));
        }
        
        
        

    }

    public String toString() {
        String output = "";
         for (int r = 0; r < mat.length; r++){
            
            for (int c = 0; c < mat[r].length; c++){
                output += mat[r][c];
            }
            output += "\n";
        }
        return output + "\n\n";
    }
}