package lab18g_list_of_references_word;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordRunner {

    public static void main(String[] args) {
        Word test = new Word("chicken");
        System.out.println(test);
        System.out.println("num vowels == " + test.getNumVowels());
        System.out.println("num chars == " + test.getLength());
        
        test.setWord("alligator");
        System.out.println(test);
        System.out.println("num vowels == " + test.getNumVowels());
        System.out.println("num chars == " + test.getLength());
        
        test.setWord("elephant");
        System.out.println(test);
        System.out.println("num vowels == " + test.getNumVowels());
        System.out.println("num chars == " + test.getLength());
    }
}