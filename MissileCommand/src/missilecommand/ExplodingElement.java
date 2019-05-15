/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

import javafx.scene.canvas.Canvas;

/**
 *
 * @author McCormick.Elliot19
 */
public abstract class ExplodingElement extends GameElement{
    private double maximumExplosionRadius = 60;

    /**
     *
     */
    public ExplodingElement() {
    }

    /**
     *
     * @param x x pos
     * @param y y pos
     * @param wid width
     * @param ht height
     */
    public ExplodingElement(double x, double y, double wid, double ht) {
        super(x, y, wid, ht);
    }
    
    /**
     *
     * @return double maximumExplosionRadius which is the current width of the explosion
     */
    public double getMaximumExplosionRadius(){
        return maximumExplosionRadius;
    }
    
    /**
     * all ExplodingElements will have an explodeElement method to make them go boom
     * 
     * @param canvas
     */
    public abstract void explodeElement(Canvas canvas);
    
    /**
     *
     * @param element
     * @return true if you managed to blow up something, false if otherwise
     */
    public boolean blewItUp(ExplodingElement element){
        
        //center of the element you are trying to blow up
        double centerOfElementX = element.getXpos() + (element.getWidth()/2.0);
        double centerOfElementY = element.getYpos() + (element.getHeight()/2.0);
       
        //center of your explosion
        double ExplosionCenterX = this.getXpos() + (this.getWidth()/2.0);
        double ExplosionCenterY = this.getYpos() + (this.getHeight()/2.0);

        //if the center of the element we are checking is within the circle of explosion, return true
        if (Math.abs(centerOfElementX - ExplosionCenterX) < this.getWidth() && Math.abs(centerOfElementY - ExplosionCenterY) < this.getHeight()){
            return true;
        }
        
        return false;
    }
}
