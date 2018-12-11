package lab19b_interfaces_Monster_lab2_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable {

    private int myWeight;
    private int myHeight;
    private int myAge;

    //write a default Constructor
    public Monster(){
        this(0,0,0);
    }
    //write an initialization constructor with an int parameter ht
    public Monster(int ht){
        this(ht, 0, 0);
    }
    //write an initialization constructor with int parameters ht and wt
    public Monster(int ht, int wt){
        this (ht, wt, 0);
    }
    //write an initialization constructor with int parameters ht, wt, and age
    public Monster(int ht, int wt, int age){
        myHeight = ht;
        myWeight = wt;
        myAge = age;
    }
    
    //modifiers - write set methods for height, weight, and age
    public void setHeight(int ht){
        myHeight = ht;
    }
    public void setWeight(int wt){
        myWeight = wt;
    }
    public void setAge(int age){
        myAge = age;
    }
    
    //accessors - write get methods for height, weight, and age
    public int getHeight(){
        return myHeight;
    }
    public int getWeight(){
        return myWeight;
    }
    public int getAge(){
        return myAge;
    }
    //creates a new copy of this Object
    public Object clone() {
        return this;
    }

    public boolean equals(Object obj) {
        if (compareTo(obj) == 0){
            return true;
        }

        return false;
    }

    public int compareTo(Object obj) {
        Monster rhs = (Monster) obj;

        if (myHeight > rhs.myHeight){
            return 1;
        } else if (myHeight < rhs.myHeight){
            return -1;
        } else {
            if (myWeight > rhs.myWeight){
                return 1;
            } else if (myWeight < rhs.myWeight){
                return -1;
            } else {
                if (myAge > rhs.myAge){
                    return 1;
                } else if (myAge < rhs.myAge){
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
    
    //write a toString() method
    public String toString(){
        return myHeight + " " + myWeight + " " + myAge;
    }
}