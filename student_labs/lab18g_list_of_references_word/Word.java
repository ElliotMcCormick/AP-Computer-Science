package lab18g_list_of_references_word;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word {

    private String word;
    private static String vowels = "AEIOUaeiou";   //only one

    public Word() {
        this("");
    }

    public Word(String wrd) {
        setWord(wrd);
    }

    public void setWord(String wrd) {
        word = wrd;
    }

    public int getNumVowels() {
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            if (vowels.indexOf(word.charAt(i)) != -1){
                count++;
            }
        }

        return count;
    }

    public int getLength() {
        return word.length();
    }

    public String toString() {
        return word;
    }
}