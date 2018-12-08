package lab18e_array_of_refs_Gradebook_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grade {

    private double value;
    
    //add in two constructors
    public Grade() {
        this(100);
    }
    public Grade(double grade){
        setValue(grade);
    }
    
    //add in set and get methods
    public void setValue(double val){
        value = val;
    }
    //String getLetterGrade()
    public String getLetterGrade(){
        if (value >= 90 && value <= 100){
            return "A";
        }
        else if (value >= 80){
            return "B";
        }
        else if (value >= 70){
            return "C";
        }
        else if (value >= 60){
            return "D";
        }
        else {
            return "F";
        }
    }
    //double getNumericGrade()
    public double getNumericGrade(){
        return value;
    }
    
    //toString method
    public String toString(){
        return value + " ";
    }
}
