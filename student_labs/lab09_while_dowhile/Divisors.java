package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Divisors {
    private int number;
    
    public Divisors(){
        setNumber(0);
    }
    
    public Divisors(int num){
        setNumber(num);
    }
    
    public void setNumber(int num){
        number = num;
    }
    
    public static String getDivisors(int number) {
        String divisors = "";
        int count = 1;
        while (count < number){
            if (number % count == 0){
                divisors = divisors + " " + count;
            }
            count++;
        }
        
        return divisors;
    }
    
    public String toString(){
        return number + " has divisors" + getDivisors(number) + "\n";
    }
    
}