package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class TriangleThreeRunner {

    public static void main(String args[]) {
        TriangleThree triangle = new TriangleThree();
        
        triangle.setTriangle(3, "A");
        System.out.println(triangle);
        
        triangle.setTriangle(7, "X");
        System.out.println(triangle);
        
        triangle.setTriangle(1, "R");
        System.out.println(triangle);
        
        triangle.setTriangle(5, "T");
        System.out.println(triangle);
        
        triangle.setTriangle(4, "W");
        System.out.println(triangle);
    }
}