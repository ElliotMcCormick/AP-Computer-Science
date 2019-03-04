package lab23g_recursion_maze;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze {

    private String[][] maze;

    public Maze(int size, String line) {
        maze = new String[size][size];

        Scanner chopper = new Scanner(line);

        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                if (chopper.hasNext()) {
                    maze[row][col] = chopper.next();
                }
            }
        }
    }

    public boolean hasExitPath(int r, int c) {
        
        if (r >= 0 && r < maze.length && c >= 0 && c < maze[r].length && maze[r][c].equals("1")) {
            maze[r][c] = "P";
            if (c == maze[r].length - 1) {
                return true;
            } else {
                return hasExitPath(r - 1, c) || hasExitPath(r, c + 1) || hasExitPath(r + 1, c) || hasExitPath(r, c - 1);

            }
        }
        
        return false;
    }

    public String toString() {
        String output = "";
        
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                output += maze[row][col] + " ";
            }
            output += "\n";
        }
        
        if (hasExitPath(0, 0)){
            output += "exit found";
        } else {
            output += "exit not found";
        }
        return output;
    }
}
