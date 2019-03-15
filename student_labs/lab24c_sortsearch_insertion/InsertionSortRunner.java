package lab24c_sortsearch_insertion;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class InsertionSortRunner {

    public static void main(String args[]) {
        //add test cases
        InsertionSort one = new InsertionSort();
        
        System.out.println("adding alice");
        one.add("alice");
        System.out.println("adding tommy");
        one.add("tommy");
        System.out.println("adding bobby");
        one.add("bobby");
        System.out.println("adding annabell");
        one.add("annabell");
        System.out.println("adding sallysue");
        one.add("sallysue");
        System.out.println("adding sallymae");
        one.add("sallymae");
        System.out.println("printing the list : " + one);
        
        System.out.println("");
        
        System.out.println("removing bobby");
        one.remove("bobby");
        System.out.println("printing the list : " + one);
        
        System.out.println("");
        
        System.out.println("removing alice");
        one.remove("alice");
        System.out.println("printing the list : " + one);
        
        System.out.println("");
        
        System.out.println("adding fred");
        one.add("fred");
        System.out.println("adding xylophone");
        one.add("xylophone");
        System.out.println("printing the list : " + one);
        
        System.out.println("");
        
        System.out.println("removing tommy");
        one.remove("tommy");
        System.out.println("printing the list : " + one);
        
        System.out.println("");
        
        System.out.println("removing fred");
        one.remove("fred");
        System.out.println("removing annabell");
        one.remove("annabell");
        System.out.println("removing sallysue");
        one.remove("sallysue");
        System.out.println("printing the list : " + one);

    }
}