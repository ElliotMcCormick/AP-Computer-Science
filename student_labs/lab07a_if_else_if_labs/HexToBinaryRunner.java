package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinaryRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(in);
        HexToBinary test = new HexToBinary();
        
        out.println("Enter a letter :: A");
        test.setHex('A');
        out.println(test);
        
        out.println("Enter a letter :: B");
        test.setHex('B');
        out.println(test);
        
        out.println("Enter a letter :: C");
        test.setHex('C');
        out.println(test);
        
        out.println("Enter a letter :: D");
        test.setHex('D');
        out.println(test);
        
        out.println("Enter a letter :: E");
        test.setHex('E');
        out.println(test);
        
        out.println("Enter a letter :: F");
        test.setHex('F');
        out.println(test);
        
        out.println("Enter a letter :: X");
        test.setHex('X');
        out.println(test);
//add test cases	
    }
}