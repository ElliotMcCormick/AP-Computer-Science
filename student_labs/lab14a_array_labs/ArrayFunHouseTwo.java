package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouseTwo {
    //goingUp() will return true if all numbers
    //in numArray are in increasing order
    //[1,2,6,9,23] returns true
    //[9, 11, 13, 8]  returns false

    public static boolean goingUp(int[] numArray) {
        boolean up = false;
        for (int i = 1; i < numArray.length; i++){
            if (numArray[i] > numArray[i-1]){
                up = true;
            } else {
                return false;
            }
        }
        return up;
    }

    //goingDown() will return true if all numbers
    //in numArray are in decreasing order
    //[31,12,6,2,1] returns true
    //[31, 20, 10, 15, 9] returns false
    public static boolean goingDown(int[] numArray) {
        boolean down = false;
        for (int i = 1; i < numArray.length; i++){
            if (numArray[i] < numArray[i-1]){
                down = true;
            } else {
                return false;
            }
        }
        return down;
    }

    //getValuesBiggerThanX will return an array that contains
    //count number of values that are larter than parameter x
    //[1,2,3,4,5,6,7,8,9,10,11,6],3,5  would return [6,7,8]
    public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x) {
        int[] output = new int[count];
        int index = 0;
        
        for (int item : numArray){
            if (item > x && index < count){
                output[index] = item;
                index++;
            }
            
        }
        
        return output;
    }
}