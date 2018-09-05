package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name - Elliot McCormick
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsAndStripes {

    public StarsAndStripes() {
        out.println("StarsAndStripes");
        printTwoBlankLines();
        printTwentyStars();
    }

    @SuppressWarnings("empty-statement")
    public void printTwentyStars() {
        for (int i = 0; i <= 20; i++){
            out.println("*");
        }
    }

    public void printTwentyDashes() {
        for (int i = 0; i <= 20; i++){
            out.println("-");
        }
    }

    public void printTwoBlankLines() {
        
    }

    public void printASmallBox() {
    }

    public void printABigBox() {
    }
}