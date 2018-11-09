package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Box {

    private String let;
    private int size;

    public Box(){
        this("", 0);
    }
    public Box(String letter, int sz){
        let = letter;
        size = sz;
    }
    //make two constructors	
    public String toString() {
        String output = "";
        
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                output += let;
            }
            output += "\n";
        }


        return output + "\n";
    }
}