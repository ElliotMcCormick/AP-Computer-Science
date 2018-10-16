package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitCounter {

    public static int countDigits(int number) {
        int count = 0;
        while (number > 0){
            count++;
            number /= 10;
        }
        return count;
    }
 
}