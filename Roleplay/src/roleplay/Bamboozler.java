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
public class Bamboozler extends CalculatingDevice {
    
    @Override
    public int subtract(int num1, int num2) {
        return num1 * 2 - num2;
    }
    
}
