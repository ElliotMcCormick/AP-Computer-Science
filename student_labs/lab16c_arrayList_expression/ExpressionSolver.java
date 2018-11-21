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

public class ExpressionSolver {
    //add in instance variables
    String str;
    ArrayList<String> expression;
    int answer;

    public ExpressionSolver(String s) {
        setExpression(s);
    }

    public void setExpression(String s) {
        str = s;
        answer = 0;
        expression = new ArrayList();
        
        Scanner chopper = new Scanner(s);
        while (chopper.hasNext()){
            expression.add(chopper.next());
        }
    }

    public void solveExpression() {
        
        while (expression.contains("/") || expression.contains("*")){
            
            if (expression.contains("/")){
                int index = expression.indexOf("/");
                int partialAnswer = ((Integer.parseInt(expression.get(index - 1))) / (Integer.parseInt(expression.get(index + 1))));
                
                expression.remove(index + 1);
                expression.remove(index);
                expression.remove(index - 1);
                expression.add(index - 1, Integer.toString(partialAnswer));
            }
            if (expression.contains("*")){
                int index = expression.indexOf("*");
                int partialAnswer = ((Integer.parseInt(expression.get(index - 1))) * (Integer.parseInt(expression.get(index + 1))));
                
                expression.remove(index + 1);
                expression.remove(index);
                expression.remove(index - 1);
                expression.add(index - 1, Integer.toString(partialAnswer));
            }
        }
        
        while (expression.contains("+") || expression.contains("-")){
            if (expression.contains("+")){
                int index = expression.indexOf("+");
                int partialAnswer = ((Integer.parseInt(expression.get(index - 1))) + (Integer.parseInt(expression.get(index + 1))));
                
                expression.remove(index + 1);
                expression.remove(index);
                expression.remove(index - 1);
                expression.add(index - 1, Integer.toString(partialAnswer));
            }
            if (expression.contains("-")){
                int index = expression.indexOf("-");
                int partialAnswer = ((Integer.parseInt(expression.get(index - 1))) - (Integer.parseInt(expression.get(index + 1))));
                
                expression.remove(index + 1);
                expression.remove(index);
                expression.remove(index - 1);
                expression.add(index - 1, Integer.toString(partialAnswer));
            }
        }
        
        
        answer = Integer.parseInt(expression.get(0));
    }

    public String toString() {
        solveExpression();
        return str + " = " + answer;
    }
}