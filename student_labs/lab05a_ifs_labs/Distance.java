package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance {

    private int x1, y1, x2, y2;

    public Distance() {
        setCoordinates(0, 0, 0, 0);
    }

    public Distance(int xOne, int yOne, int xTwo, int yTwo) {
        setCoordinates(xOne, yOne, xTwo, yTwo);
    }

    public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo) {
        x1 = xOne;
        y1 = yOne;
        x2 = xTwo;
        y2 = yTwo;
    }

    public String determineClosest() {
        double distanceA = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2)), distanceB = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        String result = "";

        if (distanceA < distanceB){
            result += "A is closer to (0,0)";
        }
        else {
            result += "B is closer to (0,0)";
        }




        return result;
    }

    public String toString() {
        return "";
    }
}