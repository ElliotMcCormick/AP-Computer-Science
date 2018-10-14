package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleOne {

    private String word;

    public TriangleOne() {
        word = "";
    }

    public TriangleOne(String s) {
        setWord(s);
    }

    public void setWord(String s) {
        word = s;
    }

    public String toString() {
        String output = "";
        for(int i = 0; i < word.length(); i++){
            output += word.substring(0, word.length() - i) + "\n";
        }
        return output;
    }
}