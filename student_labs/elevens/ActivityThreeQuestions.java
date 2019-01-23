/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevens;

import java.util.Arrays;

/**
 *
 * @author elliot
 */
public class ActivityThreeQuestions {
    // #1
    
    public static String flip(){
        int randomValue = (int)(Math.random() * 3);
        if (randomValue > 0){
            return "heads";
        } else {
            return "tails";
        }
    }
    
    // #2
    
    public static boolean arePermutations(int[] one, int[] two){
        int [] temp1 = one;
        int [] temp2 = two;
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if (temp1.equals(temp2)){
            return true;
        }
        return false;
    }
    
    // #3
    
    // A: 1, 2
}
