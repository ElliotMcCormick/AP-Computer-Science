package lab24c_sortsearch_insertion;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort {

    private ArrayList<String> list;

    public InsertionSort() {
        list = new ArrayList();
    }

    //modfiers
    public void add(String word) {
        int loc = 0;
        if (!(list.contains(word))){
            loc = findInsertLocation(word);
            list.add(loc, word);
        }
    }

    private int findInsertLocation(String word) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(word) > 0) {
                return i;
            }
        }
        return list.size();
    }

    public void remove(String word) {
        list.remove(word);
    }

    public String toString() {
        return list.toString();
    }
}