package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class AddRunner {

    public static void main(String[] args) {
       
        
        AddStrings demo = new AddStrings("hello", "world");
        demo.add();
        out.println(demo);
        
        
        
        demo.setStrings("jim", "bob");
        demo.add();
        out.println(demo);

        
        
        demo.setStrings("sally", "sue");
        demo.add();
        out.println(demo);

        
        
        demo.setStrings("computer", "science");
        demo.add();
        out.println(demo);

        
        
        demo.setStrings("uil", "contests");
        demo.add();
        out.println(demo);

        

        //add more test cases		
    }
}