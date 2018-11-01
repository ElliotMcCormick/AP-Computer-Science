package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;

public class TriangleFourRunner {

    public static void main(String args[]) {
        TriangleFour triangle = new TriangleFour();
        
        triangle.setTriangle(3, "R");
        System.out.println(triangle);
        
        triangle.setTriangle(4, "B");
        System.out.println(triangle);
        
        triangle.setTriangle(5, "X");
        System.out.println(triangle);
        
        triangle.setTriangle(2, "E");
        System.out.println(triangle);
        
        triangle.setTriangle(1, "T");
        System.out.println(triangle);
    }
}