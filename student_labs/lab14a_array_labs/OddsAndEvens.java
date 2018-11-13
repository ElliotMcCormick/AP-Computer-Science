package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class OddsAndEvens {

    private static int countEm(int[] array, boolean odd) {
        int count = 0;
        
        //counts evens
        if (odd){
            for (int item : array){
                if (item % 2 == 1){
                    count++;
                }
            }
        }
        
        //counts odds
        if (!odd){
            for (int item : array){
                if (item % 2 == 0){
                    count++;
                }
            }
        }
        
        return count;
    }

    public static int[] getAllEvens(int[] array) {
        int lengthOfNewArray = countEm(array, false);
        int index = 0;
        int [] newArray = new int[lengthOfNewArray];
        
        for (int item : array) {
            if (item % 2 == 0){
                newArray[index] = item;
                index++;
            }
        }
        
        return newArray;
    }

    public static int[] getAllOdds(int[] array) {
        int lengthOfNewArray = countEm(array, true);
        int index = 0;
        int [] newArray = new int[lengthOfNewArray];
        
        for (int item : array) {
            if (item % 2 == 1){
                newArray[index] = item;
                index++;
            }
        }
        
        return newArray;    
    }
}