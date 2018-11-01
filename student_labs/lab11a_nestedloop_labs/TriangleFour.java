package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleFour {

    private int size;
    private String letter;

    public TriangleFour() {
        this(0, "");
    }

    public TriangleFour(int count, String let) {
        setTriangle(count, let);
    }

    public void setTriangle(int sz, String let) {
        letter = let;
        size = sz;
    }

    public String getLetter() {
        return letter;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++){
            for (int k = 0; k <= i; k++){
                output += " ";
            }
            for (int j = size; j > i; j--){
                output += letter;
            }
            output += "\n";
        }
        
        return output + "\n";
    }
}