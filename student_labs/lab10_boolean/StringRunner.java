package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRunner {

    public static void main(String args[]) {
        BiggestString test = new BiggestString();
        
        test.setStrings("abc", "cba", "bca");
        System.out.println(test);
        System.out.println(test.getBiggest());
        
        test.setStrings("one", "fourteen", "twenty");
        System.out.println(test);
        System.out.println(test.getBiggest());
        
        test.setStrings("124323", "20009", "3434");
        System.out.println(test);
        System.out.println(test.getBiggest());
        
        test.setStrings("abcde", "ABCDE", "1234234324");
        System.out.println(test);
        System.out.println(test.getBiggest());
        //add test cases
    }
}