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
public class QuadraticCalculator {
    
    public String calculate(double a, double b, double c){
        double posAnswer = ((-b) + Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / (2*a); 
        double negAnswer = ((-b) - Math.sqrt((Math.pow(b, 2)) - (4*a*c))) / (2*a);
        
        String outPut = posAnswer + " and " + negAnswer;
        
        return (outPut);
        
    }

    
}
