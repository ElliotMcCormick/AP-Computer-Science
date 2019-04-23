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
    
    public boolean elementInExplosion(ExplodingElement element){
        
        double centerOfElementX = element.xPos + (element.width/2.0);
        double centerOfElementY = element.yPos + (element.height/2.0);
        
        
        double ExplosionCenterX = this.xPos + (this.width/2.0);
        double ExplosionCenterY = this.yPos + (this.height/2.0);
        
        //if the center of the element we are checking is within the circle of explosion, return true
        if (centerOfElementX > ExplosionCenterX - explosionRadius || centerOfElementY < ExplosionCenterX + explosionRadius
                || centerOfElementX > ExplosionCenterY - explosionRadius || centerOfElementY < ExplosionCenterY + explosionRadius){
            return true;
        }
        
        return false;
    }
}
