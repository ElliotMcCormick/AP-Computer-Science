package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;

public class ArrayFunHouseTwoRunner {

    public static void main(String args[]) {
        //add test cases
        int [] array1 = {1,2,3,4,5,6,7,8,9,10};
        int [] array2 = {1,2,3,9,11,20,30};
        int [] array3 = {9,8,7,6,5,4,3,2,0,-2};
        int [] array4 = {3,6,9,12,15,18,21,23,19,17,15,13,11,10,9,6,3,2,1,0};
        
        System.out.println(Arrays.toString(array1));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingUp(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingUp(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingUp(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingUp(array4));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(Arrays.toString(array1));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingDown(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingDown(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingDown(array3));
        System.out.println(Arrays.toString(array4));
        System.out.println("is going Up? " + ArrayFunHouseTwo.goingDown(array4));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(Arrays.toString(array4));
        System.out.println("first 7 values greater than 9 " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(array4, 7, 9)));
        System.out.println("first 5 values greater than 15 " + Arrays.toString(ArrayFunHouseTwo.getCountValuesBiggerThanX(array4, 5, 15)));

    }
}