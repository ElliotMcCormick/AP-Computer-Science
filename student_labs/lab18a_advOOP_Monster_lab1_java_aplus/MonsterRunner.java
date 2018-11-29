package lab18a_advOOP_Monster_lab1_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            //ask for name and size
            out.print("Enter 1st monster's name : ");
            String name1 = keyboard.next();
            out.print("Enter 1st monster's size : ");
            int size1 = keyboard.nextInt();
            //instantiate monster one
            Monster monster1 = new Monster(name1, size1);


            //ask for name and size
            out.print("Enter 2nd monster's name : ");
            String name2 = keyboard.next();
            out.print("Enter 2nd monster's size : ");
            int size2 = keyboard.nextInt();
            //instantiate monster two
            Monster monster2 = new Monster(name2, size2);

            out.println("\nMonster 1 - " + monster1 + "\nMonster 2 - " + monster2 + "\n");

            if (monster1.isBigger(monster2)) {
                out.println("Monster one is bigger than Monster two.");
            } else {
                out.println("Monster one is smaller than Monster two.");
            }

            if (monster1.namesTheSame(monster2)){
                out.println("Monster one has the same name as Monster two.");
            } else {
                out.println("Monster one does not have the same name as Monster two.");
            }
            
            out.println("\n\n");
        }

    }
}