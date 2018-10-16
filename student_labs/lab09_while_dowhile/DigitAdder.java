package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitAdder {
    private int number;
    
    public DigitAdder(){
        setDigit(0);
    }
    
    public DigitAdder(int num){
        setDigit(num);
    }
    
    public void setDigit(int num){
        number = num;
    }
    
    public static int sumDigits(int number) {
        int sum = 0;
        while(number > 0 ){
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }
    
    public String toString(){
        return sumDigits(number) + " is the sum of the digits of " + number + "\n";
    }
}