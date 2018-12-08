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

public class Grades {

    private Grade[] grades;
    private int index = 0;

    public Grades(String gradeList) {
        Scanner chopper = new Scanner(gradeList);
        grades = new Grade[chopper.nextInt()];
        chopper.next();
        for (int i = 0; i < grades.length; i++){
            index = i;
            addGrade(Double.parseDouble(chopper.next()));
        }
    }

    public void addGrade(double grade) {
        grades[index] = new Grade(grade);
    }

    public void setGrade(int spot, double grade) {
        grades[spot] = new Grade(grade);
    }

    public double getSum() {
        double sum = 0.0;
        for (Grade grade : grades){
            sum += grade.getNumericGrade();
        }
        return sum;
    }

    public double getLowGrade() {
        double low = Double.MAX_VALUE;
        for (int i = 0; i < grades.length; i++){
            if (grades[i].getNumericGrade() < low){
                low = grades[i].getNumericGrade();
            }
        }
        return low;
    }

    public double getHighGrade() {
        double high = Double.MIN_VALUE;
        for (int i = 0; i < grades.length; i++){
            if (grades[i].getNumericGrade() > high){
                high = grades[i].getNumericGrade();
            }
        }
        return high;
    }

    public int getNumGrades() {
        return grades.length;
    }

    public String toString() {
        String output = "";
        output += Arrays.toString(grades);
        return output;
    }
}