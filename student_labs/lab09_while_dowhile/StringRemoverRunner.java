package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRemoverRunner {

    public static void main(String args[]) {
        StringRemover test = new StringRemover();
        test.setRemover("xR-MxR-MHelloxR-M", "R-M");
        System.out.println(test);
        System.out.println(test.removeStrings());
        
        test.setRemover("sxsssxssxsxssexssxsesss", "xs");
        System.out.println(test);
        System.out.println(test.removeStrings());
        
        test.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
        System.out.println(test);
        System.out.println(test.removeStrings());
        //add test cases	
    }
}