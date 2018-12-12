package lab19d_interfaces_SortByLength_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("words.dat"));
        Word[] wordArray;
        
        int size = file.nextInt();
        wordArray = new Word[size];
        
        file.nextLine();

        for (int i = 0; i < size; i++){
            wordArray[i] = new Word(file.nextLine()); 
        }

        Arrays.sort(wordArray);
        
        for (Word word : wordArray){
            System.out.println(word);
        }






    }
}