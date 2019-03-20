package lab24k_sortsearch_quick;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -  

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort {

    private static int passCount;

    public static void quickSort(Comparable[] list) {
        quickSort(list, 0, list.length - 1);
        passCount = 0;
    }

    private static void quickSort(Comparable[] list, int low, int high) {
        
        if (low < high){
            
            //NOTE: partition is actually what is doing the sorting
            int split = partition(list, low, high);
            
            //When it actually matters where you put the println...
            System.out.println("pass " + passCount + " " + Arrays.toString(list));
            passCount++;
            
            quickSort(list, low, split);
            quickSort(list, split + 1, high);
            
        }
    }

    @SuppressWarnings("empty-statement")
    private static int partition(Comparable[] list, int low, int high) {
        Comparable pivot = list[low];
        int bot = low - 1;
        int top = high + 1;
        
        
            
        while (bot < top){
            //actually need to do this otherwise you get index out of bounds. 
            //Stupid, but it works
            while (list[++bot].compareTo(pivot) < 0);
            while (list[--top].compareTo(pivot) > 0);
            
            if(bot >= top){
                return top;
            }
            
            Comparable temp = list[bot];
            list[bot] = list[top];
            list[top] = temp;
        }
        
        //this return statement has no effect
        return 0;
    }
}