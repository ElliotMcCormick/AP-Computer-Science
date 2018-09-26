package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstAndLast {

    private String word;
    private char firstLetter;
    private char lastLetter;

    public FirstAndLast() {
        setString("");
    }

    public FirstAndLast(String s) {
        setString(s);
    }

    public void setString(String s) {
        word = s;
    }

    public void findFirstLastLetters() {
        firstLetter = word.charAt(0);
        lastLetter = word.charAt(word.length() - 1);
    }

    public String toString() {
        String output = "";
        output += ("word :: " + word + "\nfirst letter :: " + firstLetter + "\nlast letter :: " + lastLetter + "\n\n");
        return output;
    }
}