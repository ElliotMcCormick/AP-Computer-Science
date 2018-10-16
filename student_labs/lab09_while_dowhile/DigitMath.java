package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitMath {

    private static int countDigits(int number) {
        int count = 0;
        while (number > 0){
            count++;
            number /= 10;
        }
        return count;
    }

    private static int sumDigits(int number) {
        int sum = 0;
        while(number > 0 ){
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static double averageDigits(int number) {
        return (double)sumDigits(number) / countDigits(number);
    }
}