package lab18g_list_of_references_word;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words {

    private ArrayList<Word> words;

    public Words() {
        setWords("");
    }

    public Words(String wordList) {
        setWords(wordList);
    }

    public void setWords(String wordList) {
        words = new ArrayList();
        words.clear();
        Scanner chopper = new Scanner(wordList);
        while (chopper.hasNext()){
            words.add(new Word(chopper.next()));
        }
    }

    public int countWordsWithXChars(int size) {
        int count = 0;

        for (Word word : words){
            if (word.getLength() == size){
                count++;
            }
        }



        return count;
    }

    //this method will remove all words with a specified size / length
    //this method will also return the sum of the vowels in all words removed
    public int removeWordsWithXChars(int size) {
        int vowelCount = 0;
        
        for(int i = words.size()-1; i >= 0; i--){
            if (words.get(i).getLength() == size){
                vowelCount += words.get(i).getNumVowels();
                words.remove(i);                
            }
            
        }



        return vowelCount;
    }

    public int countWordsWithXVowels(int numVowels) {
        int count = 0;

        for (Word word : words){
            if (word.getNumVowels() == numVowels){
                count++;
            }
        }




        return count;
    }

    public String toString() {
        return words.toString();
    }
}