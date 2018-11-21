package lab16c_arrayList_expression;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner {

    public static void main(String args[]) {
        ExpressionSolver test = new ExpressionSolver("3 + 5");
        System.out.println(test);
        System.out.println("");
        
        test.setExpression("3 * 5");
        System.out.println(test);
        System.out.println("");
        
        test.setExpression("3 - 5");
        System.out.println(test);
        System.out.println("");
        
        test.setExpression("3 / 5");
        System.out.println(test);
        System.out.println("");
        
        test.setExpression("5 / 5 * 2 + 8 / 2 + 5");
        System.out.println(test);
        System.out.println("");
        
        test.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
        System.out.println(test);
        
       
    }
}