/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

/**
 *
 * @author McCormick.Elliot19
 */
public abstract class ExplodingElement extends GameElement{
    private double explosionRadius = 0.0;
    
    public double getExplosionRadius(){
        return explosionRadius;
    }
    
    public abstract void dealWithExplosion(GameElement element);
    
    public boolean checkExplosion(GameElement element){
        //if element x or y is within explodingE explosion radius
        double[] centerOfElement = {((element.xPos + (element.xPos + element.width))/2.0), ((element.yPos + (element.yPos + element.height))/2.0)};
        
        double xValueOfExplosionCircle = 
        
        return false;
    }
}
