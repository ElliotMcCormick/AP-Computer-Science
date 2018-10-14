package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Factorial {

    private int number;

    public Factorial() {
        setNum(0);
    }

    public Factorial(int num) {
        setNum(num);
    }

    public void setNum(int num) {
        number = num;
    }

    public int getNum() {
        return number;
    }

    public long getFactorial() {
        long factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }






        return factorial;
    }

    public String toString() {
        return "factorial of " + getNum() + " is " + getFactorial() + "\n";
    }
}