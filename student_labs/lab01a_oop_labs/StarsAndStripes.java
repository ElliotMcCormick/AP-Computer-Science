package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name - Elliot McCormick
//Date - 9/11/18
//Class - AP CompSci 5
//Lab  - StarsAndStripes

import static java.lang.System.*;

public class StarsAndStripes {

    //basically like an init, it runs when you instantiate something
    public StarsAndStripes() {
        out.println("StarsAndStripes");
        printTwoBlankLines();
    }

    @SuppressWarnings("empty-statement")
    public void printTwentyStars() {
        for (int i = 0; i <= 19; i++){
            out.print("*");
        }
        out.println();
    }

    public void printTwentyDashes() {
        for (int i = 0; i <= 19; i++){
            out.print("-");
        }
        out.println();
    }

    public void printTwoBlankLines() {
        out.println();
        out.println();
    }

    public void printASmallBox() {
        printTwentyDashes();
        for (int i = 0; i <= 2; i++){
            printTwentyStars();
            printTwentyDashes();
        }
    }

    public void printABigBox() {
        for (int i = 0; i <= 1; i++){
            printASmallBox();
        }
    }
    
    public void myOwnPattern() {
        for (int i = 0; i < 3; i++){
            printTwentyDashes();
            printTwoBlankLines();
            printTwentyDashes();
            printTwentyStars();
        }
    }
}