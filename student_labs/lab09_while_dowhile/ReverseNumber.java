package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber {

    private int number;
    
    public ReverseNumber(){
        setNumber(0);
    }

    public ReverseNumber(int num){
        setNumber(num);
    }
    
    public void setNumber(int num){
        number = num;
    }
    
    public int getReverse() {
        int rev = 0;
        while (number > 0){
            rev = (rev * 10) + (number % 10);
            number /= 10;
        }
        return rev;
    }
    
    public String toString(){
        return number + " reversed is " + getReverse();
    }
}