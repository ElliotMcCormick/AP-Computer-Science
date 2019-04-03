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
public class Sandwich extends MenuItem{
    private int size;
    
    public Sandwich(String nm, int pr, int sz) {
        super(nm, pr);
        size = sz;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + "Sandwich{" + "size=" + size + '}';
    }
    
}
