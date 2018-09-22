package lab03a_oop_return_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic {

    private int a, b, c;
    private double rootOne;
    private double rootTwo;

    public Quadratic() {
    }

    public Quadratic(int quadA, int quadB, int quadC) {
        setEquation(quadA, quadB, quadC);
    }

    public void setEquation(int quadA, int quadB, int quadC) {
        a = quadA;
        b = quadB;
        c = quadC;
    }

    public void calcRoots() {
        rootOne = ((-b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / (2*a); 
        rootTwo = ((-b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / (2*a);
    }

    public void print() {
        System.out.println("\n\nrootone :: " + String.format("%.2f", rootOne));
        System.out.println("roottwo :: " + String.format("%.2f", rootTwo) + "\n\n\n");
    }
    

    
}
