package lab22a_matrices;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToeRunner {

    public static void main(String args[]) throws IOException {
        Scanner file = new Scanner(new File("tictactoe.dat"));
        int size = file.nextInt();
        file.nextLine();
        
        TicTacToe test;
        
        for (int i = 0; i < size; i++) {
            test = new TicTacToe(file.nextLine());
            System.out.println(test);
        }
    }
}