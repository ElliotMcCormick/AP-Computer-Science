package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSummingRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("matsum.dat"));
        
        MatrixSumming summer = new MatrixSumming();
        
        int numRows = file.nextInt();
        int numColumns = 2;
        
        int[][] matIndex = new int[numRows][numColumns];
        
        for (int row = 0; row < matIndex.length; row++){
            for (int col = 0; col < matIndex[row].length; col++){
                matIndex[row][col] = file.nextInt();
            }
        }
        
        for (int row = 0; row < matIndex.length; row++){
            
            int r = matIndex[row][0];
            int c = matIndex[row][1];
            
            System.out.println("The sum of " + r + "," + c + " is " + summer.sum(r,c) + ".");
        }
        
    }
}
