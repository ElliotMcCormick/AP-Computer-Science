package lab19e_interfaces_SortByVowels_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("word.dat"));
        Word[] output;
        
        int fileLength = file.nextInt();
        file.nextLine();
        
        output = new Word[fileLength];
        
        for (int i = 0; i < fileLength; i++){
            output[i] = new Word(file.nextLine());
        }
        
        Arrays.sort(output);
        
        for (int i = 0; i < output.length; i++){
            System.out.println(output[i]);
        }
        
        
    }
}