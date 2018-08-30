/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roleplay;

/**
 *
 * @author mccormick.elliot19
 */
public class Roleplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dice riley = new Dice();
        System.out.println(riley.roll());
        System.out.println(riley.roll());
        System.out.println("Number of rolls " + riley.numRolls());
        
        Calculator elliot = new Calculator();
        System.out.println(elliot.add(10, 4));
        System.out.println(elliot.subtract(10, 4));
        
        Bamboozler paul = new Bamboozler();
        System.out.println(paul.add(10, 4));
        System.out.println(paul.subtract(10, 4));
        
        LazyCalculator davidHill = new LazyCalculator();
        System.out.println(davidHill.add(10, 4));
        System.out.println(davidHill.subtract(10, 4));
        System.out.println(davidHill.add(2, 4, 5, 10));
        
        DivisionCalculator testCalc = new DivisionCalculator();
        System.out.println(testCalc.divide(4, 2));
    }
    
}
