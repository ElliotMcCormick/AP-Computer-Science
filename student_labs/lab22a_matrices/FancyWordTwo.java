package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class FancyWordTwo {

    private String[][] mat;

    public FancyWordTwo(String s) {
        mat = new String[s.length()][s.length()];
        //size the matrix
        //use Arrays.fill() to fill in the matrix with spaces\
        for (int r = 0; r < mat.length; r++){
            Arrays.fill(mat[r], " ");
        }
        //use a for loop to load in the letters into the matrix
        for (int i=0; i<s.length(); i++){
            mat[0][i] = Character.toString(s.charAt(i));
            mat[i][0]= Character.toString(s.charAt(i));
            mat[i][mat.length - 1] = Character.toString(s.charAt(s.length()-1 - i));
            mat[s.length() - 1][i] = Character.toString(s.charAt(s.length()-1 - i));
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