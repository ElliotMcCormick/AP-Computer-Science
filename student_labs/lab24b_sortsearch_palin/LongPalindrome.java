package lab24b_sortsearch_palin;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -
import static java.lang.System.*;
import java.util.ArrayList;

public class LongPalindrome {

    /*
     *method getAllPalins will return an array list that contains
     *all of the palindromes contained within word
     *palindromes must have a minimum length of 2
     */

    public static ArrayList<Palin> getAllPalins(String word) {
        ArrayList<Palin> palinList = new ArrayList<Palin>();

        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j <= word.length(); j++) {
                if (word.substring(i, j).length() > 1) {
                    Palin newPalin = new Palin(word.substring(i, j));
                    if (newPalin.isPalin()) {
                        palinList.add(insertLocation(palinList, newPalin), newPalin);
                    }
                }
            }
        }

        return palinList;
    }

    /*
     *method insertLocation will look at the list and determine where to
     *put the new Palin so that the sorted order is maintained
     */
    private static int insertLocation(ArrayList<Palin> list, Palin pal) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getWord().compareTo(pal.getWord()) > 0) {
                return i;
            }
        }
        return list.size();
    }

    /*
     *method getLongestPalin will return the longest
     *palindrome contained within word
     *a palindrome must a minimum length of 2
     */
    public static Palin getLongestPalin(String word) {
        Palin longestPalin = new Palin("a");

        for (Palin palin : getAllPalins(word)) {
            if (palin.getLength() > longestPalin.getLength()) {
                longestPalin = palin;
            }
        }
        return longestPalin;
    }
}
