package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social {

    private String socialNum;
    private int sum;

    public Social() {
        setWord("");
    }

    public Social(String soc) {
        setWord(soc);
    }

    public void setWord(String w) {
        socialNum = w;
    }

    public void chopAndAdd() {
        String sub = socialNum;
        int firstSet = Integer.parseInt(sub.substring(0, socialNum.indexOf("-")));
        int secondSet = Integer.parseInt(sub.substring(socialNum.indexOf("-") + 1, socialNum.lastIndexOf("-")));
        int thirdSet = Integer.parseInt(sub.substring(socialNum.lastIndexOf("-") + 1));
        sum = firstSet + secondSet + thirdSet;       
    }

    public String toString() {
        return "SS# " + socialNum + " has a total of " + sum + "\n";
    }
}