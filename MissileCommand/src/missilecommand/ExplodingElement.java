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
        
//                      System.out.println("\n\n\nnew check");
//
//        System.out.println("width of expl. " + this.getWidth());
//              System.out.println("\n");
//        System.out.println("distance between centers " + Math.abs(centerOfElementX - ExplosionCenterX));
//                      System.out.println("\n");

        //if the center of the element we are checking is within the circle of explosion, return true
        if (Math.abs(centerOfElementX - ExplosionCenterX) < this.getWidth() && Math.abs(centerOfElementY - ExplosionCenterY) < this.getHeight()){
            return true;
        }
        
        return false;
    }
}
