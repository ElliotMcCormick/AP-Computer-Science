package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner {

    public static void main(String args[]) {
        WordsCompare words = new WordsCompare("abe", "ape");
        out.println(words);
        
        words.setWords("giraffe", "gorilla");
        out.println(words);
        
        words.setWords("one", "two");
        out.println(words);
        
        words.setWords("fun", "funny");
        out.println(words);
        
        words.setWords("123", "19");
        out.println(words);
        
        words.setWords("193", "1910");
        out.println(words);
        
        words.setWords("goofy", "godfather");
        out.println(words);
        
        words.setWords("funnel", "fun");
        out.println(words);
        //add test cases
    }
}