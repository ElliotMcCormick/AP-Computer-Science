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
    private double explosionRadius = 60;

    public ExplodingElement() {
    }

    public ExplodingElement(double x, double y, double wid, double ht) {
        super(x, y, wid, ht);
    }
    
    public double getExplosionRadius(){
        return explosionRadius;
    }
    
    public abstract void explodeElement(Canvas canvas);
    
    public boolean blewItUp(ExplodingElement element){
        
        double centerOfElementX = element.getXpos() + (element.getWidth()/2.0);
        double centerOfElementY = element.getYpos() + (element.getHeight()/2.0);
        
        
        double ExplosionCenterX = this.getXpos() + (this.getWidth()/2.0);
        double ExplosionCenterY = this.getYpos() + (this.getHeight()/2.0);
        
        //if the center of the element we are checking is within the circle of explosion, return true
        if (centerOfElementX > ExplosionCenterX - this.getWidth() || centerOfElementY < ExplosionCenterX + this.getWidth()
                || centerOfElementX > ExplosionCenterY - this.getWidth() || centerOfElementY < ExplosionCenterY + this.getWidth()){
            return true;
        }
        
        return false;
    }
}
