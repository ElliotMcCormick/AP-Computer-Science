package lab23c_recursion_at_counter;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class AtCounter {

    private String[][] atMat;

    public AtCounter() {
        //size the matrix
        atMat = new String[10][10];
        //use nested loops to randomly load the matrix
        for (int row = 0; row < atMat.length; row++){
            for (int col = 0; col < atMat[row].length; col++){
                int randomNum = (int)(Math.random() * 2);
                if (randomNum == 0){
                    atMat[row][col] = "@";
                } else {
                    atMat[row][col] = "-";
                }
            }
        }
        //you will need to use Math.random()
    }

    public int countAts(int r, int c) {
        //add in recursive code to count up the # of @s connected
        //start checking at spot [r,c]
        
        if(r >= 0 && r < atMat.length && c >= 0 && c < atMat[r].length && atMat[r][c].equals("@")){
            atMat[r][c] = "-";
            return 1 + countAts(r - 1, c) + countAts(r, c + 1) + countAts(r + 1, c) + countAts(r, c - 1);
        }
        
        return 0;
    }

    /*
     *this method will return all values in the matrix
     *this method should return a view of the matrix
     *that looks like a matrix
     */
    public String toString() {
        String output = "";
        
         for (int row = 0; row < atMat.length; row++){
            for (int col = 0; col < atMat[row].length; col++){
                output += atMat[row][col] + " ";
            }
            output += "\n";
        }
         
        return output;
    }
}