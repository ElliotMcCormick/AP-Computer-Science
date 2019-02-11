package lab22a_matrices;


import java.util.*;
import java.io.*;

public class MatrixSumming {

    private int[][] m = {{5, 6}, {7, 8}, {3, 4}};   //load in the matrix values

    public int sum(int r, int c) {
        int sum = 0;
        
        for (int row = 0; row < m.length; row++){
            for (int col = 0; col < m[row].length; col++){
                if (row == 0){
                    sum = m[row][col] + m[row + 1][col];
                }
                if (row == m.length - 1){
                    
                }
                
                if (col == 0){
                    
                }
                if (col == m[row].length - 1){
                    
                }
            }
        }
        return 0;
    }

    public String toString() {
        return "";
    }
}
