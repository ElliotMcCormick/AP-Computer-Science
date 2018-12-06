package lab18b_advOOP_Rational_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
    //add two instance variables
    private int numerator;
    private int denominator;
    
    //write two constructors
    public Rational(){
        this(1, 1);
    }
    public Rational(int num, int denom){
        setRational(num, denom);
    }
    
    //write a setRational method
    public void setRational(int num, int denom){
        numerator = num;
        denominator = denom;
    }
    //write  a set method for numerator and denominator
    public void setNumerator(int num){
        numerator = num;
    }
    public void setDenominator(int denom){
        denominator = denom;
    }
    
    public void add(Rational other) {
        //num1/den1 + num2/den2 
        //new numerator = (num1 * den2 + num2 * den1)
        //new denominator = (den1 * den2)
        numerator = (numerator * other.denominator) + (other.numerator * denominator);
        denominator = (denominator * other.denominator);


        reduce();
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        if (gcd > 0){
            numerator = numerator / gcd;
            denominator = denominator / gcd;
        }
            
    }

    private int gcd(int numOne, int numTwo) {
        int gcd = 0;
        for (int i = 1; i <= numOne && i <= numTwo; i++){
            if (numOne % i == 0 && numTwo % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public Object clone() {
        return new Rational(numerator, denominator);
    }

    //ACCESSORS
    //write get methods for numerator and denominator
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    
    
    public boolean equals(Object obj) {
        Rational object = (Rational)obj;
        reduce();
        object.reduce();
        
        if (numerator == object.numerator && denominator == object.denominator){
            return true;
        }

        return false;
    }

    public int compareTo(Rational other) {
        if (equals(other)){
            return 0;
        }
        else if ((double)numerator/denominator > (double)other.numerator/other.denominator){
            return 1;
        }


        return -1;
    }
    
    //write  toString() method
    public String toString(){
        return numerator + "/" + denominator;
    }
}