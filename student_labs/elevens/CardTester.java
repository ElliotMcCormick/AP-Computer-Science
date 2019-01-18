/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevens;

/**
 *
 * @author mccormick.elliot19
 */

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
            Card one = new Card("Jack", "Spade", 10);
            
            System.out.println(one);
            
            Card two = new Card("Jack", "Spade", 10);
            
            System.out.println(one.matches(two));

            System.out.println(one.pointValue());
            System.out.println(one.rank());
            System.out.println(one.suit());
                    
	}
}

