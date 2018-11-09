package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class TheLine {

    private String line;

    public TheLine() {
        this("");
    }

    public TheLine(String s) {
        line = s;
    }

    public int getLargest() {
        int largest = Integer.MIN_VALUE;
        Scanner chopper = new Scanner(line);
        while(chopper.hasNext()){
            int num = chopper.nextInt();
            if (num > largest){
                largest = num;
            }
        }
        return largest;
    }

    public String toString() {
        return line + " -  Largest == " + getLargest();
    }
}