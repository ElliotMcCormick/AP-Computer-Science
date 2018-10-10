/*
 * The goal of this lab is to use recursion to print an integer number backwards
 * Example:  
 *   Input:  752
 *   Output: 257
 */
package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class ReverseInt {
    
    private int reverseNum = 0;

    public static void main(String[] args) {
        int number = 752;
        ReverseInt revIntObj = new ReverseInt();
        revIntObj.revDigs(number);
    }

    public void revDigs(int number) {
                
        if (number != 0){
            reverseNum = (reverseNum * 10) + (number % 10);
            number = number / 10;
            revDigs(number);
        } else {
            System.out.print(reverseNum);
        }
    }    
}
   