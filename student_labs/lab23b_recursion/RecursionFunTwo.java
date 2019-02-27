package lab23b_recursion;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunTwo {

    public static int countChickens(String word) {
        if (word.contains("chicken")){
            return 1 + countChickens(word.replace("chicken", ""));
        }

        return 0;
    }
}