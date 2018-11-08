package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class DogFoodRunner {

    public static void main(String[] args) {
        DogFood dog1 = new DogFood("6 10 14 18 25 32");
        System.out.println(dog1);
        
        DogFood dog2 = new DogFood("12 15 20 26 35 42");
        System.out.println(dog2);
        
        DogFood dog3 = new DogFood("33 38 45 51 60 65");
        System.out.println(dog3);
        
        DogFood dog4 = new DogFood("40 50 60 77 90 101");
        System.out.println(dog4);
        
        
    }
}