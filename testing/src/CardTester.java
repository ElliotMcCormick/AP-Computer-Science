

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
            Card three = new Card("Queen", "Diamond", 4);
            
            System.out.println(one.matches(three));
            System.out.println(one.matches(two));

            System.out.println(one.pointValue());
            System.out.println(one.rank());
            System.out.println(one.suit());
            
            System.out.println(two.pointValue());
            System.out.println(two.rank());
            System.out.println(two.suit());
            
            System.out.println(three.pointValue());
            System.out.println(three.rank());
            System.out.println(three.suit());
                    
	}
}

