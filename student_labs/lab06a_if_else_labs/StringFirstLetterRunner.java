package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterRunner {

    public static void main(String args[]) {
        StringFirstLetterCheck strings = new StringFirstLetterCheck("hello", "howdy");
        out.println(strings);
        
        strings.setWords("one", "two");
        out.println(strings);
        
        strings.setWords("three", "two");
        out.println(strings);
        
        strings.setWords("TCEA", "UIL");
        out.println(strings);
        
        strings.setWords("State", "Champions");
        out.println(strings);
        
        strings.setWords("ABC", "DEF");
        out.println(strings);
        //add test cases
    }
}