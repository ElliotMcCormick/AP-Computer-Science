package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class GCD {

    private int one, two;

    public GCD() {
        setNums(0, 0);
    }

    public GCD(int numOne, int numTwo) {
        setNums(numOne, numTwo);
    }

    public void setNums(int numOne, int numTwo) {
        one = numOne;
        two = numTwo;
    }

    public long getGCD() {
        long gcd = 0;
        for (int i = one; i <= two; i++){
            if (one % i == 0 && two % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public String toString() {
        return "the gcd of " + one + " and " + two + " is " + getGCD() + "\n";
    }
}