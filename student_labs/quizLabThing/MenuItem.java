/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizLabThing;

/**
 *
 * @author mccormick.elliot19
 */
public abstract class MenuItem {
    private String name;
    private int price;
    
    public MenuItem(String nm, int pr){
        name = nm;
        price = pr;
    }

    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    
    @Override
    public String toString() {
        return "MenuItem{" + "name=" + name + ", price=" + price + '}';
    }
    
}
