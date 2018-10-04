package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringLengthRunner {

    public static void main(String args[]) {
        StringLengthCheck words = new StringLengthCheck("hello", "goodbye");
        out.println(words);
        
        words.setWords("one", "two");
        out.println(words);
        
        words.setWords("three", "four");
        out.println(words);
        
        words.setWords("TCEA", "UIL");
        out.println(words);
        
        words.setWords("State", "Champions");
        out.println(words);
        
        words.setWords("ABC", "DEF");
        out.println(words);
        
        words.setWords("four", "five");
        out.println(words);
        
        words.setWords("whoot", "what");
        out.println(words);
        
        //add test cases
    }
}