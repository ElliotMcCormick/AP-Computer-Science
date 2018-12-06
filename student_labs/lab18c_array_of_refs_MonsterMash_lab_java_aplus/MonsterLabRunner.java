package lab18c_array_of_refs_MonsterMash_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class MonsterLabRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(in);

        out.print("How many monsters are in the herd? :: ");
        int size = keyboard.nextInt();
        Monsters herd = new Monsters(size);

        for (int i = 0; i < size; i++) {
            out.print("\nEnter the ht :: ");
            int ht = keyboard.nextInt();
            out.print("Enter the wt :: ");
            int wt = keyboard.nextInt();
            out.print("Enter the age :: ");
            int age = keyboard.nextInt();
            //instantiate a new Monster() and add it to the herd
            
            Monster newMonster = new Monster(ht, wt, age);
            
            herd.add(i, newMonster);
        }

        System.out.println("\nHERD :: " + herd + "\n");
        System.out.println("SMALLEST :: " + herd.getSmallest() + "\n");
        System.out.println("LARGEST :: " + herd.getLargest() + "\n");
        System.out.println("HERD :: " + herd.sort() + "\n");

        //print out the other stats

    }
}