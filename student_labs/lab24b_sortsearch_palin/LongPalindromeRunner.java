package lab24b_sortsearch_palin;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.util.ArrayList;
import static java.lang.System.*;

public class LongPalindromeRunner {

    public static void main(String args[]) {
        //add test cases
        LongPalindrome one = new LongPalindrome();
        System.out.println(one.getAllPalins("bobcat"));
        System.out.println(one.getLongestPalin("bobcat"));
        System.out.println("");
        System.out.println(one.getAllPalins("bobracecarcat"));
        System.out.println(one.getLongestPalin("bobracecarcat"));
        System.out.println("");
        System.out.println(one.getAllPalins("alligatorslikegroovycatslikemadamandrooroo"));
        System.out.println(one.getLongestPalin("alligatorslikegroovycatslikemadamandrooroo"));
        System.out.println("");
        System.out.println(one.getAllPalins("idrovetothelibraryinmyracecartolearnaboutpanama"));
        System.out.println(one.getLongestPalin("idrovetothelibraryinmyracecartolearnaboutpanama"));
        
        
    }
}