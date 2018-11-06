package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

class BoxWord {

    private String word;

    public BoxWord() {
        word = "";
    }

    public BoxWord(String s) {
        setWord(s);
    }

    public void setWord(String w) {
        word = w;
    }

    public String toString() {
        String output = "";
        output += word + "\n";
        for (int i = 1; i < word.length()-1; i++){
            output += word.charAt(i);
            for (int j = 0; j < word.length() - 2; j++){
                output += " ";
            }
            output += word.charAt(word.length() - 1 - i);
            output += "\n";
        }
        for (int k = word.length() - 1; k >= 0; k--){
            output += word.charAt(k);
        }
        return output + "\n";
    }
}