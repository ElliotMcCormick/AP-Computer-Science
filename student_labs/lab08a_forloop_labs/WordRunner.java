package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordRunner {

    public static void main(String[] args) {
        Word test = new Word();
        test.setString("Hello");
        System.out.println(test.getFirstChar());
        System.out.println(test.getLastChar());
        System.out.println(test.getBackWards());
        System.out.println(test);
        System.out.println("");
        
        test.setString("World");
        System.out.println(test.getFirstChar());
        System.out.println(test.getLastChar());
        System.out.println(test.getBackWards());
        System.out.println(test);
        System.out.println("");
        
        test.setString("JukeBox");
        System.out.println(test.getFirstChar());
        System.out.println(test.getLastChar());
        System.out.println(test.getBackWards());
        System.out.println(test);
        System.out.println("");
        
        test.setString("TCEA");
        System.out.println(test.getFirstChar());
        System.out.println(test.getLastChar());
        System.out.println(test.getBackWards());
        System.out.println(test);
        System.out.println("");
        
        test.setString("UIL");
        System.out.println(test.getFirstChar());
        System.out.println(test.getLastChar());
        System.out.println(test.getBackWards());
        System.out.println(test);
        System.out.println("");
        //add test cases		
    }
}