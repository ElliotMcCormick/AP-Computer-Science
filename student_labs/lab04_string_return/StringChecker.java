package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker {

    private String word;

    public StringChecker() {
        setString("");
    }

    public StringChecker(String s) {
        setString(s);
    }

    public void setString(String s) {
        word = s;
    }

    public boolean findLetter(char c) {
        if (word.indexOf(c) >= 0){
            return true;
        }
        return false;
    }

    public boolean findSubString(String s) {
        if (word.contains(s)){
            return true;
        }
        return false;
    }

    public String toString() {
        return word + "\n\n";
    }
}