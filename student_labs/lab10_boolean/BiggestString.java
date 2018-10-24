package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestString {

    private String one, two, three;

    public BiggestString() {
        this("", "", "");
    }

    public BiggestString(String a, String b, String c) {
        setStrings(a, b, c);
    }

    public void setStrings(String a, String b, String c) {
        one = a;
        two = b;
        three = c;
    }

    public String getBiggest() {
        if (one.compareTo(two) > 0 && one.compareTo(three) > 0){
            return "biggest = " + one + "\n";
        } else if (two.compareTo(one) > 0 && two.compareTo(three) > 0){
            return "biggest = " + two + "\n";
        } else {
            return "biggest = " + three + "\n";
        }
    }

    public String toString() {
        return one + " " + two + " " + three;
    }
}