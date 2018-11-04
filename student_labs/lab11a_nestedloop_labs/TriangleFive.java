package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class TriangleFive {

    private char letter;
    private int amount;

    public TriangleFive() {
        this(' ', 0);
    }

    public TriangleFive(char c, int amt) {
        setLetter(c);
        setAmount(amt);
    }

    public void setLetter(char c) {
        letter = c;
    }

    public void setAmount(int amt) {
        amount = amt;
    }

    public String toString() {
        String output = "";
        char letterAt = letter;
        
        for (int i = 0; i < amount; i++){ //height
            for (int j = 0; j < amount - i; j++){ //width && which letter
                for (int k = amount; k > j; k--){ //number of times letters repeated                   
                    if (letterAt + j > (int)'Z'){
                        letterAt = (char)('A' - j);
                    }
                    output += (char)(letterAt + j); //dont forget to wrap around, use if 
                    
                }
                output += " ";
            }
            output += "\n";
            letterAt = letter;
        }
        return output;
    }
}