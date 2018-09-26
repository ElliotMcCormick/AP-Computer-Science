package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify {

    public static boolean isOdd(int num) {
        if (num % 2 == 0){
            return false;
        }
        return true;
    }

    public static boolean isEven(int num) {
        if(num % 2 != 0){
            return false;
        }
        return true;
    }
}