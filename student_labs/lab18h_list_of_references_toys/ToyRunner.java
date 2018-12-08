package lab18h_list_of_references_toys;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ToyRunner {

    public static void main(String[] args) {
        Toy test = new Toy("sorry");
        test.setCount(1);
        System.out.println(test);
        
        test.setName("ji joe");
        test.setCount(5);
        System.out.println(test);
    }
}