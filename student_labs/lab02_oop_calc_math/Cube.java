package lab02_oop_calc_math;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Cube {

    private int side;
    private int surfaceArea;

    public void setSide(int s) {
        side = s;
    }

    public void calculateSurfaceArea() {
        surfaceArea = 6 * ((int)Math.pow(side, 2));
    }

    public void print() {
        System.out.println("The surface area is :: " + surfaceArea);
    }
}