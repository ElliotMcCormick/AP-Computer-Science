package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TenToAny {

    private int base10;
    private int newBase;

    public TenToAny(){
        setVariables(0, 10);
    }
    
    public TenToAny(int ten, int newB){
        setVariables(ten, newBase);
    }
    
    public void setVariables(int ten, int newB){
        base10 = ten;
        newBase = newB;
    }
    
    public String getNewNum() {
        String newNum = "";
        while (base10 > 0) {
            if (base10 % newBase > 9){
                newNum = (char)((base10 % newBase) + 55) + newNum;
            } else {
                newNum = (base10 % newBase) + newNum;
            }
            base10 /= newBase;
        }
        return newNum;
    }
    
    public String toString(){
        return base10 + " base 10 is " + getNewNum() + " in base " + newBase + "\n";
    }
    //add a toString method	
}