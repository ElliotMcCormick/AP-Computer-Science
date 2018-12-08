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

public class GradeBookRunner {

    public static void main(String args[]) {
        out.println("Welcome to the Class Stats program!\n");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the name of this class? ");
        String nameOfClass = keyboard.nextLine();
        
        
        System.out.print("How many students are in this class? ");
        int numberOfStudents =  keyboard.nextInt();
        keyboard.nextLine();
        
        Class theClass = new Class(nameOfClass, numberOfStudents);
        
      
        
        for (int i = 1; i < numberOfStudents+1; i++){
            System.out.print("\nEnter the name of student " + i + " : ");
            String name = keyboard.nextLine();
            
            System.out.print("Enter the grades for " + name + "\nUse the format x - grades (2 - 100 100) : ");
            String gradeString = keyboard.nextLine();
            
            Student newStudent = new Student(name, gradeString);
            
            theClass.addStudent(i-1, newStudent);
        }
        
        System.out.println(theClass);
        System.out.println("");
        
        out.println("Failure List = " + theClass.getFailureList(70));
        out.println("Highest Average = " + theClass.getStudentWithHighestAverage());
        out.println("Lowest Average = " + theClass.getStudentWithLowestAverage());

        out.println("Class Average = " + theClass.getClassAverage());
    }
}