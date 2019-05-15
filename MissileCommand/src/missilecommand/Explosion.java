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
public class Explosion extends ExplodingElement implements Updateable, Renderable {

    private boolean growing;
    private double initialX;
    private double initialY;
    private boolean complete;

    /**
     * set growing to true and complete to false initially
     */
    public Explosion() {
        this.growing = true;
        this.complete = false;
    }

    /**
     *
     * @param x x position
     * @param y y position
     * @param wid width
     * @param ht height
     */
    public Explosion(double x, double y, double wid, double ht) {
        super(x, y, wid, ht);
        this.growing = true;
        this.complete = false;
        this.initialX = x;
        this.initialY = y;
    }

    /**
     *
     * @param canvas
     */
    @Override
    public void update(Canvas canvas) {
        double changeInSize = 0.5;

        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(Color.BLACK);
        graphics.setLineWidth(2);
        graphics.setStroke(Color.BLACK);
        
        //draw a circle where the explosion is
        graphics.strokeOval(initialX - (super.getWidth() / 2), initialY - (super.getHeight() / 2), super.getWidth(), super.getHeight());
        graphics.fillOval(initialX - (super.getWidth() / 2), initialY - (super.getHeight() / 2), super.getWidth(), super.getHeight());

        //if the width is larger than the maximum explosion radius stop growing
        if (super.getWidth() >= super.getMaximumExplosionRadius()) {
            growing = false;
        } 
        
        //else increase the width by the changeInSize and move the x and y so the center stays the same
        else if (super.getWidth() < super.getMaximumExplosionRadius() && growing) {
            super.setWidth(super.getWidth() + changeInSize);
            super.setHeight(super.getHeight() + changeInSize);
            super.setXpos(initialX - (super.getWidth() / 2));
            super.setYpos(initialY - (super.getHeight() / 2));
        }

        // if not growing and width is greater than 0 decrease width and move x and y
        if (super.getWidth() > 0 && !growing) {

            super.setWidth(super.getWidth() - changeInSize);
            super.setHeight(super.getHeight() - changeInSize);
            super.setXpos(initialX - (super.getWidth() / 2));
            super.setYpos(initialY - (super.getHeight() / 2));
        }
        
        //full explosion cycle complete
        if (super.getWidth() <= 0){
            complete = true;
        }
    }

    /**
     *
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(Color.WHITE);
        graphics.fillOval(initialX - (super.getWidth() / 2), initialY - (super.getHeight() / 2), super.getWidth(), super.getHeight());
    }

    /**
     *
     * @param canvas
     */
    @Override
    public void explodeElement(Canvas canvas) {
        throw new UnsupportedOperationException("Not yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return true if explosion is complete
     */
    public boolean isComplete() {
        return complete;
    }

}
