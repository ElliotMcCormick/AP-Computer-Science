package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleTwo {

    private int size;
    private String letter;

    public TriangleTwo() {
        this("", 0);
    }

    public TriangleTwo(String let, int sz) {
        setTriangle(sz, let);
    }

    public void setTriangle(int count, String let) {
        size = count;
        letter = let;
    }

    public String getLetter() {
        return letter;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++){
            for (int j = size; j > i; j--){
                output += letter;
            }
            output += "\n";
        }









        return output + "\n";
    }
}