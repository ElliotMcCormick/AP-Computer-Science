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
public class Drink extends MenuItem{
    private String size;
    
    public Drink(String nm, int pr, String sz) {
        super(nm, pr);
        size = sz;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Drink{" + "size=" + size + '}';
    }
}
