package lab13_scanner_files;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class TheLineRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("line.dat"));
        TheLine test;
        int size = file.nextInt();
        file.nextLine();
        for (int i = 0; i < size; i++) {
            test = new TheLine(file.nextLine());
            System.out.println(test);
        }
    }
}