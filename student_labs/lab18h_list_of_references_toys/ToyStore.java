package lab18h_list_of_references_toys;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore {

    private ArrayList<Toy> toyList;

    public ToyStore() {
        toyList = new ArrayList();
    }

    public void loadToys(String toys) {
        Scanner chopper = new Scanner(toys);
        
        while (chopper.hasNext()){
            String toyName = chopper.next();
            if (toyList.isEmpty()){
                toyList.add(new Toy(toyName));
                getThatToy(toyName).setCount(1);
            }
            else if (!toyList.contains(getThatToy(toyName))){
                toyList.add(new Toy(toyName));
                getThatToy(toyName).setCount(1);
            } 
            else {
                
                getThatToy(toyName).setCount(getThatToy(toyName).getCount() + 1);
            }
        }
    }

    public Toy getThatToy(String nm) {
        for (Toy toy : toyList){
            if (toy.getName().equals(nm)){
                return toy;
            }
        }
        return null;
    }

    public String getMostFrequentToy() {
        int max = Integer.MIN_VALUE;
        String largestToy = "";
        
        for (Toy toy : toyList){
            if (toy.getCount() > max){
                largestToy = toy.getName();
                max = toy.getCount();
            }
        }
        return largestToy;
    }

    public void sortToysByCount() {
    }

    public String toString() {
        return toyList.toString();
    }
}