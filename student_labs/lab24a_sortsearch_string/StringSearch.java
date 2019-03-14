package lab24a_sortsearch_string;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class - 
//Lab  - 
import static java.lang.System.*;

public class StringSearch {

    /*
     *method countWords will count the occurrences of word in sent
     *there may many occurrences of word or none at all
     */
    public static int countWords(String sent, String word) {
        //add code here
        int count = 0;

        while (sent.indexOf(word) != -1) {

            sent = sent.substring(0, sent.indexOf(word)) + sent.substring(sent.indexOf(word) + word.length(), sent.length());
            count++;

        }

        return count;
    }

    /*
     *method countLetters will count the occurrences of letter in sent
     *there may many occurrences of letter or none at all
     */
    public static int countLetters(String sent, String letter) {
        //add code here
        int count = 0; 
        for (int i = 0; i < sent.length(); i++){
            if (sent.charAt(i) == letter.charAt(0)){
                count++;
            }
            
        }
        return count;
    }
}
