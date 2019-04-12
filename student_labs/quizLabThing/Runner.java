/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizLabThing;

import java.util.ArrayList;

/**
 *
 * @author mccormick.elliot19
 */
public class Runner {
    public static void main(String[] args) {
        Drink coke = new Drink("coke", 12, "medium");
        
        coke.setSize("large");
        System.out.println(coke.getSize());
        System.out.println(coke);
        
        Sandwich bonelessPizza = new Sandwich("bonelessPizza", 12, 12);
        bonelessPizza.setSize(5);
        System.out.println(bonelessPizza.getSize());
        System.out.println(bonelessPizza);
   
        
        ArrayList<MenuItem> menu = new ArrayList<>();
        Restaurant cafeDeFood = new Restaurant(menu);
        cafeDeFood.addMenuItem(coke);
        cafeDeFood.addMenuItem(bonelessPizza);
        
        System.out.println(cafeDeFood.getHighestPrice());
        
        cafeDeFood.removeItem("coke");
        
        System.out.println(cafeDeFood);
    }
}
