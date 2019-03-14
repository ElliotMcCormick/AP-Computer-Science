package lab24b_sortsearch_palin;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.ArrayList;

//define class Palin
public class Palin{
    private String palin;
    
    public Palin(String s){
        palin = s;
    }
    
    public int getLength(){
        return palin.length();
    }
    
    public String getWord(){
        return palin;
    }
    
    public boolean isPalin(){
        for (int i = 0; i < palin.length()/2; i++){
            if (palin.charAt(i) != palin.charAt((palin.length() - 1) - i)){
                return false;
            }
        }
        return true;
    }
    
    public String toString(){
        return palin;
    }
}
//instance variable - String
//constructors
//getLength method - returns an int
//getWord method - returns a String
//isPalin method - returns a boolean


	//toString method - returns a String
