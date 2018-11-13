package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats {
    //instance variable
    private int[] array;
    
    //constructor
    public ArrayStats(){
        this(null);
    }
    public ArrayStats(int[] a){
        setArray(a);
    }
    //set method
    public void setArray(int[] a){
        array = a;
    }
    
    public int getNumGroupsOfSize(int size) {
        int cnt = 0;
        int counter = 0;
        int startlocation = 0;
        int currentloc = 0;
        
        for (int i = 0; i < array.length; i++){
            
            while(!(currentloc > array.length - 1) && array[currentloc] == array[startlocation]){
                counter++;
                currentloc++;
            }
            
            if (counter >= size){
                cnt++;
                
            }
            
            counter = 0;
            
            startlocation = currentloc;
        }


        return cnt;
    }

    public String toString() {
        return "" + Arrays.toString(array);
    }
}