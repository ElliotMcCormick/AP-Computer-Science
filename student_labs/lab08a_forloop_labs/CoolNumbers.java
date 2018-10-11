package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class CoolNumbers {
    /*
     *method isCoolNumber will return true if
     *	num % 3-6 all have a remainder of 1
     *it will return false otherwize
     */

    public static boolean isCoolNumber(int num) {
        boolean bool = false;
        for (int i = 3; i <= 6; i++){
            if (num % i == 1){
                bool = true;
            } else {
                return false;
            }
        }
        return bool;
    }

    /*
     *method countCoolNumbers will return the count
     *of the coolNumbers between 6 and stop
     */
    public static int countCoolNumbers(int stop) {
        int count = 0;
        for (int i = 6; i < stop; i++){
            if (isCoolNumber(i)){
                count++;
            }
        }
        return count;
    }
}