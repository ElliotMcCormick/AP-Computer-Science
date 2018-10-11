package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Box {

    private String word;

    public Box() {
        setWord("");
    }

    public Box(String s) {
        setWord(s);
    }

    public void setWord(String s) {
        word = s;
    }

    public void print() {
        for (int i = 0; i < word.length(); i++){
            System.out.println(word);
        }
    }
}