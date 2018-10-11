/*
 * The goal of this lab is to print the words in a sentence backwards and vertically
 * It would be helpful if you remember your String methods
 * Example:
 *   Input:  This is a sentence
 *   Output: sentence
 *			 a
 *			 is
 *			 This
 */

package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class StringWord {
    
    
    
    public static void main(String[] args) {
        StringWord test = new StringWord();
        test.printStringWords("This is a sentence");
	//Instantiate your object
	//Call the recursive method printStringWords to print the words
    }
       
 
    public void printStringWords(String word) {
        if (word.length() > 0){
            if (word.contains(" ")){
                System.out.println(word.substring(word.lastIndexOf(" ")));
                printStringWords(word.substring(0, word.lastIndexOf(" ")));
            } else {
                System.out.println(word);
            }
                  
        }

    }
}
   