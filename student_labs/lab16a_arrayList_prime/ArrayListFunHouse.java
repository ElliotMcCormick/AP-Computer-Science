package lab16a_arrayList_prime;

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

public class ArrayListFunHouse {

    public static ArrayList<Integer> getListOfFactors(int number) {
        ArrayList<Integer> output = new ArrayList();
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                output.add(i);
            }
        }
        return output;
    }

    public static void keepOnlyCompositeNumbers(List<Integer> nums) {
        for (int i = nums.size() - 1; i >= 0; i--){
            if (!(getListOfFactors(nums.get(i)).size() > 0)){
                nums.remove(i);
            }
        }
    }
}