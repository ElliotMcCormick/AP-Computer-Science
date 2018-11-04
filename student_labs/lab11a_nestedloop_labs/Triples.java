package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples {

    private int number;

    public Triples() {
        this(0);
    }

    public Triples(int num) {
        setNum(0);
    }

    public void setNum(int num) {
        number = num;
    }

    private int greatestCommonFactorforTwoNums(int a, int b) {
       
        if (a == 0) 
            return b; 
        return greatestCommonFactorforTwoNums(b % a, a); 
     
    }
    
    private int greatestCommonFactor(int a, int b, int c) {
        return greatestCommonFactorforTwoNums(greatestCommonFactorforTwoNums(a, b), c);
    }
    
    private boolean isATriangle(int a, int b, int c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){
            return true;
        } else {
            return false;
        }
    }

    private boolean correctOddEvenCombo(int a, int b, int c){
        if (a % 2 == 1 && b % 2 == 0 && c % 2 == 1){
            return true;
        }
        else if (a % 2 == 0 && b % 2 == 1 && c % 2 == 1){
            return true;
        }
        else {
            return false;
        }
        
       
    }
    
    
    public String toString() {
        String output = "";
        
        for (int a = 1; a <= number; a++){
            for (int b = 1; b <= number; b++){
                for (int c = 1; c <= number; c++){
                    if (greatestCommonFactor(a, b, c) <= 1 && isATriangle(a, b, c) && correctOddEvenCombo(a, b, c)){
                        if (!output.contains(b + " " + a + " " + c) && !output.contains(c + " " + b + " " + a) && !output.contains(a + " " + c + " " + b)){
                            output += a + " " + b + " " + c + "\n";
                        }
                    } 
                }
            }
        }
        return output + "\n";
    }
}