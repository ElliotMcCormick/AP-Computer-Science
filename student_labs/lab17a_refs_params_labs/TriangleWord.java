package lab17a_refs_params_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord {
    //instance variables and constructors could be present, but are not necessary

    public static void printTriangle(String word) {
        for (int i = 1; i < word.length(); i++){
            for (int j = 0; j < i; j++){
                System.out.print(word.substring(0, i));
            }
            System.out.println("");
        }
        for (int i = 0; i < word.length(); i++){
            System.out.print(word);
        }
    }
}