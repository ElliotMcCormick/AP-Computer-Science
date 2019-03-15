package lab24d_sortsearch_findmaxprime;


import java.util.*;
import java.io.*;

public class MatrixSearch2Runner {

    public static void main(String[] args) throws Exception {
        MatrixSearch2 matSearch = new MatrixSearch2(20, 15, 50);
        System.out.println(matSearch);
        
        System.out.println("");
        
        MatrixSearch2 matSearch2 = new MatrixSearch2(15, 15, 75);
        System.out.println(matSearch2);
        
        System.out.println("");
        
        MatrixSearch2 matSearch3 = new MatrixSearch2(7, 7, 100);
        System.out.println(matSearch3);
    }
}
