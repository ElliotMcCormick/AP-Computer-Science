package lab24l_sortsearch_matrix;


import java.util.*;
import java.io.*;

public class MatrixSearchRunner {

    public static void main(String[] args) throws Exception {
        MatrixSearch ms = new MatrixSearch(20, 20, 25);
        System.out.println(ms);
        
        System.out.println("");
        
        ms = new MatrixSearch(10, 10, 50);
        System.out.println(ms);
        
        System.out.println("");
        
        ms = new MatrixSearch(7, 7, 100);
        System.out.println(ms);
        //call count evens
    }
}
