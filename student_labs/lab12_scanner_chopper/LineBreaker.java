package lab12_scanner_chopper;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker {

    private String line;
    private int breaker;

    public LineBreaker() {
        this("", 0);
    }

    public LineBreaker(String s, int b) {
        setLineBreaker(s, b);
    }

    public void setLineBreaker(String s, int b) {
        line = s;
        breaker = b;
    }

    public String getLine() {
        return line;
    }

    public String getLineBreaker() {
        String box = "";
        
        Scanner chopper = new Scanner(line);
        
        while(chopper.hasNext()){
            //height
            for (int i = 0; i < line.length(); i += breaker){
                //repeat breaker number of times (width of box)
                for (int j = 0; j < breaker; j++){
                    if (chopper.hasNext()){
                        box += chopper.next(); 
                    }
                }
                box += "\n";
            }
        }
        

        return box;
    }

    public String toString() {
        return getLineBreaker();
    }
}