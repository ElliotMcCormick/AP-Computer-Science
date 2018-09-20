package lab03a_oop_return_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour {

    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNums(0, 0, 0);
        mph = 0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins) {
        setNums(dist, hrs, mins);
        mph = 0.0;
    }

    public void setNums(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void calcMPH() {
        double totalTime;
        totalTime = hours + (minutes/60.0);
        mph = distance / totalTime;
    }

    public void print() {
        System.out.println("\n" + distance + " miles in " + hours + " hours and " + minutes + " minutes = " + Math.round(mph) + " MPH" + "\n\n\n");
    }
}