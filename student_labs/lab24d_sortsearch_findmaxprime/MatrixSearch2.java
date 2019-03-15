package lab24d_sortsearch_findmaxprime;


import java.util.*;
import java.io.*;

public class MatrixSearch2 {

    private int[][] mat;

    public MatrixSearch2(int rows, int cols, int upper) {
        mat = new int[rows][cols];
        for (int r = 0; r < mat.length; r++){
            for (int c = 0; c < mat[r].length; c++){
                mat[r][c] = (int)(Math.random() * upper) + 1;
            }
        }
    }

    /*
     *findMaxPrime() will return the prime that has the largest surrounding sum
     */
    public int findMaxPrime() {
        int maxPrime = 0;
        for (int r = 0; r < mat.length; r++){
            for (int c = 0; c < mat[r].length; c++){
                if (isPrime(mat[r][c]) && mat[r][c] > maxPrime){
                    maxPrime = mat[r][c];
                }
            }
        }
        return maxPrime;
    }

    public int getCountRndCell(int r, int c) {
        int cnt = 0;
        return cnt;
    }

    private boolean inBounds(int r, int c) {
        return false;
    }

    private boolean isPrime(int num) {
        for (int devisor = 2; devisor < num/2; devisor++){
            if(num % devisor == 0){
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String out = "";
        for (int r = 0; r < mat.length; r++){
            for (int c = 0; c < mat[r].length; c++){
                if (mat[r][c] > 9){
                    out += mat[r][c] + "  ";
                } else {
                    out += " " + mat[r][c] + "  ";
                }
            }
            out += "\n";
        }
        out += "\n";
        out += "Max Prime = " + findMaxPrime();
        return out;
    }
}
