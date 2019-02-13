package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

public class Grid {

    private String[][] grid;

    //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals) {

        grid = new String[rows][cols];
        
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < cols; c++){
                grid[r][c] = vals[(int)(Math.random() * vals.length)];
            }
        }
    }

    //find out which of the vals occurs the most
    public String findMax(String[] vals) {
        int maxNumber = Integer.MIN_VALUE;
        String highestVal = null;
        for (String val : vals){
            if(countVals(val) > maxNumber){
                maxNumber = countVals(val);
                highestVal = val;
            }
        }
        return highestVal;
    }

    //returns a count of how many times val occurs in the matrix
    private int countVals(String val) {
        int count = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                if(grid[r][c].equals(val)){
                    count++;
                }
            }
        }
        return count;
    }

    //display the grid
    public String toString() {
        String output = "";
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                output += grid[r][c] + " ";
            }
            output += "\n";
        }
        
        output += "\n\n\n"; 
        return output;
    }
}