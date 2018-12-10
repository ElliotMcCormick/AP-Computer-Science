package lab18c_array_of_refs_MonsterMash_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters{

    private Monster[] myMonsters;

    public Monsters(int size) {
        myMonsters = new Monster[size];
    }

    public void add(int spot, Monster m) {
        myMonsters[spot] = m;
    }

    public Monster getLargest() {
        Monster largest = null;
        for (int i = 0; i < myMonsters.length - 1; i++){
            if (myMonsters[i+1].getHeight() > myMonsters[i].getHeight()){
                largest = myMonsters[i+1];
            }
            else {
                largest = myMonsters[i];
            }
        }
        return largest;
        
    }

    public Monster getSmallest() {
        Monster smallest = null;
        for (int i = 0; i < myMonsters.length - 1; i++){
            if (myMonsters[i+1].getHeight() < myMonsters[i].getHeight()){
                smallest = myMonsters[i+1];
            }
            else {
                smallest = myMonsters[i];
            }
        }
        return smallest;
    }
 

    public String sort() {
        Arrays.sort(myMonsters);
        return Arrays.toString(myMonsters);
    }
    
    public String toString() {
        return Arrays.toString(myMonsters);
    }

    
}