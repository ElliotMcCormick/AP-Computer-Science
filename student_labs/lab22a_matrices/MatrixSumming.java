package lab22a_matrices;


import java.util.*;
import java.io.*;

public class MatrixSumming {

    private int[][] m = {{1, 2, 3, 4, 5}, 
                         {6, 7, 8, 9, 0},
                         {6, 7, 1, 2, 5},
                         {6, 7, 8, 9, 0},
                         {5, 4, 3, 2, 1}};
  //load in the matrix values

    public int sum(int r, int c) {
        int sum = 0;
        
        
                if(c == 0 || r == 0 || c == m[r].length - 1 || r == m.length - 1){
                    //sum is every thing but missing edge
                    if (c == 0 && r == 0){
                        sum = m[r][c] + m[r][c + 1] + m[r + 1][c] + m[r + 1][c + 1];
                    } else if (c == 0 && r ==  m.length - 1){
                        sum = m[r - 1][c] + m[r - 1][c + 1] + m[r][c] + m[r][c + 1];
                    } else if (c == m[r].length - 1 && r == 0){
                        sum =  m[r][c - 1] + m[r][c] + m[r + 1][c - 1] + m[r + 1][c];
                    } else if (c == m[r].length - 1 && r == m.length - 1){
                        sum = m[r - 1][c - 1] + m[r - 1][c] + m[r][c - 1] + m[r][c];
                    } 
                    
                    else if (c == 0){
                        sum = m[r - 1][c] + m[r - 1][c + 1] + m[r][c] + m[r][c + 1] + m[r + 1][c] + m[r + 1][c + 1];
                    } else if (c == m[r].length - 1){
                        sum = m[r - 1][c - 1] + m[r - 1][c] + m[r][c - 1] + m[r][c] + m[r + 1][c - 1] + m[r + 1][c];
                    } else if (r == 0){
                        sum = m[r][c - 1] + m[r][c] + m[r][c + 1] +
                            m[r + 1][c - 1] + m[r + 1][c] + m[r + 1][c + 1];
                    } else if (r == m.length - 1){
                        sum = m[r - 1][c - 1] + m[r - 1][c] + m[r - 1][c + 1] +
                            m[r][c - 1] + m[r][c] + m[r][c + 1];
                    }
                } else {
                    sum = m[r - 1][c - 1] + m[r - 1][c] + m[r - 1][c + 1] +
                            m[r][c - 1] + m[r][c] + m[r][c + 1] +
                            m[r + 1][c - 1] + m[r + 1][c] + m[r + 1][c + 1];
                }
            
        
        return sum;
    }

    public String toString() {
        return "";
    }
}
