package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Perfect {

    private int number;

    public Perfect(){
        setNumber(0);
    }
    
    public Perfect(int num){
        setNumber(num);
    }
    
    public void setNumber(int num){
        number = num;
    }
    
    public boolean isPerfect() {
        int sumOfDivisors = 0;
        int count = 1;
        while (count < number){
            if (number % count == 0){
                sumOfDivisors += count;
            }
            count++;
        }
        
        if (sumOfDivisors == number){
            return true;
        } else {
            return false;
        }
    }
    
    public String toString(){
        if (isPerfect()){
            return number + " is perfect.\n";
        } else {
            return number + " is not perfect.\n";
        }
    }
    	
}