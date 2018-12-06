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

public class Monster {
    //add stuff like methods and instance variables
    private int height;
    private int weight;
    private int age;
    
    
    public Monster(){
        this(0, 0, 0);
    }
    public Monster(int ht, int wt, int a){
        setMonster(ht, wt, a);
    }
    
    
    public void setMonster(int ht, int wt, int a){
        height = ht;
        weight = wt;
        age = a;
    }
    public void setHeight(int ht){
        height = ht;
    }
    public void setWeight(int wt){
        weight = wt;
    }
    public void setAge(int a){
        age = a;
    }
    
    
    public int getHeight(){
        return height;
    }
    public int getWeight(){
        return weight;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return height + " " + weight + " " + age;
    }
}