package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com

import java.util.Arrays;
import java.util.Scanner;

//Name -
//Date -
//Class -
//Lab  - 

public class OddsAndEvensRunner {

    public static void main(String args[]) {
        
        
        int[] array1 = {2, 4, 6, 8, 10, 12, 14};
        
        System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(array1)));
        System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(array1)));
        
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(array2)));
        System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(array2)));
        
        int[] array3 = {2, 10, 20, 21, 23, 24, 40, 55, 60, 61};
        
        System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(array3)));
        System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(array3)));

        
        //add test cases
    }
}