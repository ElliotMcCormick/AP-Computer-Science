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
    
    private int count;
    
    public static void main(String[] args) {
	//Instantiate your object
	//Call the recursive method printStringWords to print the words
    }
       
 
    public void printStringWords(String word) {
        int spaceCount = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == ' '){
                spaceCount++;              
            }          
        }
        if (spaceCount > 1){  
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == ' '){
                    word.replace(' ', '*');
                    spaceCount--;
                }          
            }              
        }
        
        
        if (count < word.length()){
               
        }

    }
}
   