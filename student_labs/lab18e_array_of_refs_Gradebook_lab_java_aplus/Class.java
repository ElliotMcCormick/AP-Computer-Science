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

public class Class {

    private String name;
    private Student[] studentList;

    public Class() {
        name = "";
        studentList = new Student[0];
    }

    public Class(String nm, int stuCount) {
        name = nm;
        studentList = new Student[stuCount];
    }

    public void addStudent(int stuNum, Student s) {
        studentList[stuNum] = s;
    }

    public String getClassName() {
        return name;
    }

    public double getClassAverage() {
        double classAverage = 0.0;
        for (int i = 0; i < studentList.length; i++){
            classAverage += studentList[i].getAverage();
        }
        
        classAverage /= studentList.length;

        return classAverage;
    }

    public double getStudentAverage(int stuNum) {
        return studentList[stuNum].getAverage();
    }

    public double getStudentAverage(String stuName) {
        for (int i = 0; i < studentList.length; i++){
            if (studentList[i].getName().equals(stuName)){
                return (studentList[i].getAverage());
            }
        }

        return 0.0;
    }

    public String getStudentName(int stuNum) {
        return studentList[stuNum].getName();
    }

    public String getStudentWithHighestAverage() {
        double high = Double.MIN_VALUE;
        String hName = "";

        for (int i = 0; i < studentList.length; i++){
            if (studentList[i].getAverage() > high){
                hName = studentList[i].getName();
                high = studentList[i].getAverage();
            }
        }

        return hName;
    }

    public String getStudentWithLowestAverage() {
        double low = Double.MAX_VALUE;
        String hName = "";

        for (int i = 0; i < studentList.length; i++){
            if (studentList[i].getAverage() < low){
                hName = studentList[i].getName();
                low = studentList[i].getAverage();
            }
        }


        return hName;
    }

    public String getFailureList(double failingGrade) {
        String output = "";
        
        for (int i = 0; i < studentList.length; i++){
            if (studentList[i].getAverage() < failingGrade){
                output += studentList[i].getName() + " ";
            }
        }

        return output;
    }

    public String toString() {
        String output = "" + getClassName() + "\n";

        for (Student student : studentList){
            output += student.toString() + " " + student.getAverage() + "\n";
                    
        }
        

        return output;
    }
}