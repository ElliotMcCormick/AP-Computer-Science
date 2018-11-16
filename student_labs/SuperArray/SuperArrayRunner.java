/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperArray;

/**
 *
 * @author mccormick.elliot19
 */
public class SuperArrayRunner {
    public static void main(String[] args) {
        SuperArray test = new SuperArray(new Integer[] {5,7,9});
        SuperArray wordTest = new SuperArray(new String[] {"hi", "bob", "upreandj"});
        
        System.out.println(wordTest);
        wordTest.removeValueAtIndex(2);
        System.out.println(wordTest);
        wordTest.addValue("Hello");
        System.out.println(wordTest);
        
        System.out.println(test);
        
        test.removeValueAtIndex(1);
        
        System.out.println(test);
        
        test.addValue(1, 4);
        
        System.out.println(test);
        
        test.addValue(49);
        
        System.out.println(test);
        
        System.out.println(test.returnValueAt(1));
        
        test.clear();
        
        System.out.println(test);
        
        
    }
}
