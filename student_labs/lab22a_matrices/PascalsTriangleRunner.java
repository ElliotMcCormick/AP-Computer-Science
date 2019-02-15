package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangleRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("triangle.dat"));
        int size = file.nextInt();
        file.nextLine();
        
        PascalsTriangle test;
        
        for (int i = 0; i < size; i++) {
            test = new PascalsTriangle(file.nextInt());
            test.createTriangle();
            System.out.println(test);
        }
        
    }
}
