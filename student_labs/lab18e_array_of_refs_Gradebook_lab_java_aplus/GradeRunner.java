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

public class GradeRunner {

    public static void main(String args[]) {
        //add in test cases
        Grade test = new Grade(92.5);
        System.out.println(test);
        System.out.println(test.getLetterGrade());
        
        test.setValue(77.5);
        System.out.println(test);
        System.out.println(test.getLetterGrade());
        
        
        test.setValue(47.5);
        System.out.println(test);
         System.out.println(test.getLetterGrade());

        
        test.setValue(87.5);
        System.out.println(test);
        System.out.println(test.getLetterGrade());
        
    }
}