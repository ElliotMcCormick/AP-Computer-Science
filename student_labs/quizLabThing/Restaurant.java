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
public class Restaurant {
    private ArrayList<MenuItem> menu;

    public Restaurant(ArrayList<MenuItem> menu) {
        this.menu = menu;
    }
    
    public void addMenuItem(MenuItem item){
        menu.add(item);
    }
    
    public MenuItem getHighestPrice(){
        int maxPrice = Integer.MIN_VALUE;
        MenuItem output = menu.get(0);
        for (MenuItem item : menu){
            if (item.getPrice() < maxPrice){
                maxPrice = item.getPrice();
                output = item;
            }
        }
        
        return output;
    }
    
    public void removeItem(String name){
        for (MenuItem item : menu){
            if (item.getName().equals(name)){
                menu.remove(item);
            }
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" + "menu=" + menu + '}';
    }
    
}
