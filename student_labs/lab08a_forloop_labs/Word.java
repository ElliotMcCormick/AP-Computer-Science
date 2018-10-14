package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word {

    private String word;

    public Word() {
        setString("");
    }

    public Word(String s) {
        setString(s);
    }

    public void setString(String s) {
        word = s;
    }

    public char getFirstChar() {
        return word.charAt(0);
    }

    public char getLastChar() {
        return word.charAt(word.length() - 1);
    }

    public String getBackWards() {
        String back = "";
        for (int i = 0; i < word.length(); i++){
            back += word.charAt(word.length() - 1 - i);
        }
        return back;
    }

    public String toString() {
        return word;
    }
}