package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Box {

    private int size;

    public Box() {
        this(0);
    }

    public Box(int count) {
        setSize(count);
    }

    public void setSize(int count) {
        size = count;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++){
            for (int j = size; j > i; j--){
                output += "*";
            }
            for (int k = 0; k <= i; k++){
                output += "#";
            }
            output += "\n";
        }
        return output;
    }
}