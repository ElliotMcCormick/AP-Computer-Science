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
        for (int i = 0; i < amount; i++){
            for (int j = 0; j < amount; j++){
                for (int k = 0; k < amount; k++){
                    
                    output += (char)(letter + j); //dont forget to wrap around, use if
                    
                }
                output += " ";
            }
            output += "\n";
        }
        return output;
    }
}