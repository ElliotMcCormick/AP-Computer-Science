package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree {

    private int size;
    private String letter;

    public TriangleThree() {
        this(0, "");
    }

    public TriangleThree(int count, String let) {
        setTriangle(count, let);
    }

    public void setTriangle(int sz, String let) {
        size = sz;
        letter = let;
    }

    public String getLetter() {
        return letter;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++){
            for (int j = i; j < size; j++){
                output += " ";
            }
            for (int k = 0; k <= i; k++){
                output += letter;
            }
            output += "\n";
        }
        return output + "\n";
    }
}