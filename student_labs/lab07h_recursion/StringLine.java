/*
 * The goal of this lab is to use recursion to print a sentence backwards
 * Example:  
 *   Input:  It works!
 *   Output: !skrow tI
 */
package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class StringLine {

    private int count; 
    
    public static void main(String[] args) {
        String str = "It works!";
        StringLine stringObj = new StringLine();
        stringObj.printString(str);

    }

    public void printString(String word) {
        
	//set up your base case
	//do your recursion.  Print your letters here.  This is not a return method.
        if (count < word.length()){
            System.out.print(word.charAt(word.length() - 1 - count));
            count ++;
            printString(word);
        } 

    }
}
   