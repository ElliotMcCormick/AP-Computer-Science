/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author elliot
 */
public class Explosion extends ExplodingElement implements Updateable, Renderable{

    public boolean growing;
    
    public Explosion() {
        this.growing = true;
    }

    public Explosion(double x, double y, double wid, double ht) {
        super(x, y, wid, ht);
        this.growing = true;
    }

    
    @Override
    public void update(Canvas canvas) {
        
        if (width < super.getExplosionRadius() && growing){
            super.setWidth(width + 30);
            super.setHeight(height + 30);
            
            if (width >= super.getExplosionRadius()){
                growing = false;
            }
        }
        else if (width > 0 && !growing){
            super.setWidth(width - 30);
            super.setHeight(height - 30);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(Color.WHITE);
        graphics.fillOval(super.getXpos(), super.getYpos(), super.getWidth(), super.getHeight());    
    }

    @Override
    public void explodeElement(Canvas canvas) {
        throw new UnsupportedOperationException("Not yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
