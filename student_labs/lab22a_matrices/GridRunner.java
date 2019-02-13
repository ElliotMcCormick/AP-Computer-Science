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

public class GridRunner {

    public static void main(String args[]) throws IOException {
        //System.out.println("hi");
        String[] stringArray = {"a", "b", "c", "7", "9", "x", "2"};
        Grid test = new Grid(20, 20, stringArray);
        System.out.println(test);
        
        System.out.println("\n");
        
        String[] longestPerRow = new String[test.getGrid().length];
        for (int r = 0; r < test.getGrid().length; r++){
            longestPerRow[r] = test.findMax(test.getGrid()[r]);
        }
        
        System.out.println(test.findMax(longestPerRow) + " occurs the most");
    }
}