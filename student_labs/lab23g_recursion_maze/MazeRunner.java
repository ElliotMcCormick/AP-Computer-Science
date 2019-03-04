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

public class MazeRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("maze.dat"));
        
        
        int size = file.nextInt();
        file.nextLine();
        String input = file.nextLine();
        
        Maze maze1 = new Maze(size, input);
        System.out.println(maze1);
        System.out.println("\n");
        
        size = file.nextInt();
        file.nextLine();
        input = file.nextLine();
        
        Maze maze2 = new Maze(size, input);
        System.out.println(maze2);
        System.out.println("\n\n");
        
        size = file.nextInt();
        file.nextLine();
        input = file.nextLine();
        
        Maze maze3 = new Maze(size, input);
        System.out.println(maze3);
        System.out.println("\n\n");
        
        size = file.nextInt();
        file.nextLine();
        input = file.nextLine();
        
        Maze maze4 = new Maze(size, input);
        System.out.println(maze4);
        System.out.println("\n\n");
        
        size = file.nextInt();
        file.nextLine();
        input = file.nextLine();
        
        Maze maze5 = new Maze(size, input);
        System.out.println(maze5);
        System.out.println("\n\n");
        
        size = file.nextInt();
        file.nextLine();
        input = file.nextLine();
        
        Maze maze6 = new Maze(size, input);
        System.out.println(maze6);
        System.out.println("\n\n");
    }
}