package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class GradeCheck {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(in);
        int grade;
        Grade test = new Grade();
        
        for (int i = 0; i < 8; i++){
            out.print("Enter a number grade :: ");
            grade = keyboard.nextInt();
            test.setGrade(grade);
            out.println(test);
        }
        //add test cases
    }
}