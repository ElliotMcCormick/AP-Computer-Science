package lab18d_array_of_refs_Doggies_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;

public class Doggies {

    private Dog[] pups;

    public Doggies(int size) {
        pups = new Dog[size];
    }

    public void add(int spot, int age, String name) {
        if (spot < pups.length) {
            pups[spot] = new Dog(age, name);
        }
    }

    public String getNameOfOldest() {
        Dog oldest = null;
        for (int i = 0; i < pups.length-1; i++){
            if (pups[i+1].getAge() > pups[i].getAge()){
                oldest = pups[i+1];
            }
            else {
                oldest = pups[i];
            }
        }
        return oldest.getName();
    }

    public String getNameOfYoungest() {
        Dog youngest = null;
        for (int i = 0; i < pups.length-1; i++){
            if (pups[i+1].getAge() < pups[i].getAge()){
                youngest = pups[i+1];
            }
            else {
                youngest = pups[i];
            }
        }
        return youngest.getName();
    }

    public String toString() {
        return "" + Arrays.toString(pups);
    }
}