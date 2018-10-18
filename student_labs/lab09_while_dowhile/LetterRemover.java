package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover {

    private String sentence;
    private char lookFor;

    public LetterRemover() {
        setRemover("", (char)0);
    }
    public LetterRemover(String s, char rem) {
        setRemover(s, rem);
    }
    
    public void setRemover(String s, char rem) {
        sentence = s;
        lookFor = rem;
    }

    public String removeLetters() {
        String cleaned = sentence;
        int loc = sentence.indexOf(lookFor);
        while (loc != -1){
            cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
            loc = cleaned.indexOf(lookFor);
        }
        return cleaned + "\n";
    }

    public String toString() {
        return sentence + " - letter to remove " + lookFor;
    }
}