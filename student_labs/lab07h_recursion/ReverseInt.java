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

    public static void main(String[] args) {
        int number = 752;
        ReverseInt revIntObj = new ReverseInt();
        revIntObj.revDigs(number);
    }

    public void revDigs(int number) {
        int reverseNum = 0;
            if (number != 0){
            reverseNum = (reverseNum * 10) + (number % 10);
            number = number / 10;
            revDigs(number);
        }
        System.out.print(reverseNum);

    }
}
   