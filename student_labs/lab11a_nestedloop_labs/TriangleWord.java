package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

class TriangleWord {

    private String word;

    public TriangleWord() {
        this("");
    }

    public TriangleWord(String w) {
        setWord(w);
    }

    public void setWord(String w) {
        word = w;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < word.length(); i++){
            for (int j = word.length(); j > i; j--){
               output += " "; 
            } 
            output += word.charAt(i);
            for (int k = 0; k <= i; k++){
                output += " ";
            }
            
            output += "\n";
        }
        
        return output + "\n";
    }
}