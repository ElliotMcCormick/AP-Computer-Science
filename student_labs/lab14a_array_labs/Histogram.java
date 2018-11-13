package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Scanner;

public class Histogram {
    int [] numCount;
    //constructor
    public Histogram(){
        this("");
    }
    public Histogram(String input){
        setNumberCount(input);
    }
    
    public void setNumberCount(String in){
        Scanner chopper = new Scanner(in);
        numCount = new int[10];
       
        
        while (chopper.hasNext()){
            int number = chopper.nextInt();
            numCount[number] = numCount[number] + 1;
        }
    }
    
    public String toString(){
        String output = "";
        for (int i = 0; i <= 9; i++){
            output += i + " - " + numCount[i] + "\n";
        }
        return output;
    }
    //toString method
}