package lab04_string_return;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class FirstRunner {

    public static void main(String[] args) {
        FirstAndLast demo = new FirstAndLast("Hello");
        demo.findFirstLastLetters();
        out.println(demo);
        
        demo.setString("World");
        demo.findFirstLastLetters();
        out.println(demo);
        
        demo.setString("JukeBox");
        demo.findFirstLastLetters();
        out.println(demo);
        
        demo.setString("TCEA");
        demo.findFirstLastLetters();
        out.println(demo);
        
        demo.setString("UIL");
        demo.findFirstLastLetters();
        out.println(demo);

        //add more test cases	

    }
}