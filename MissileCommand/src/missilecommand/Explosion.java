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

    public Explosion() {
        this.growing = true;
        this.complete = false;
    }

    public Explosion(double x, double y, double wid, double ht) {
        super(x, y, wid, ht);
        this.growing = true;
        this.complete = false;
        this.initialX = x;
        this.initialY = y;
    }

    @Override
    public void update(Canvas canvas) {
        double changeInSize = 0.5;

        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(Color.BLACK);
        graphics.setLineWidth(2);
        graphics.setStroke(Color.BLACK);
        
        graphics.strokeOval(initialX - (super.getWidth() / 2), initialY - (super.getHeight() / 2), super.getWidth(), super.getHeight());
        graphics.fillOval(initialX - (super.getWidth() / 2), initialY - (super.getHeight() / 2), super.getWidth(), super.getHeight());

        if (super.getWidth() >= super.getExplosionRadius()) {
            growing = false;
        } else if (super.getWidth() < super.getExplosionRadius() && growing) {
            super.setWidth(super.getWidth() + changeInSize);
            super.setHeight(super.getHeight() + changeInSize);
            super.setXpos(initialX - (super.getWidth() / 2));
            super.setYpos(initialY - (super.getHeight() / 2));
        }

        if (super.getWidth() > 0 && !growing) {

            super.setWidth(super.getWidth() - changeInSize);
            super.setHeight(super.getHeight() - changeInSize);
            super.setXpos(initialX - (super.getWidth() / 2));
            super.setYpos(initialY - (super.getHeight() / 2));
        }
        
        if (super.getWidth() <= 0){
            complete = true;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(Color.WHITE);
        graphics.fillOval(initialX - (super.getWidth() / 2), initialY - (super.getHeight() / 2), super.getWidth(), super.getHeight());
    }

    @Override
    public void explodeElement(Canvas canvas) {
        throw new UnsupportedOperationException("Not yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isComplete() {
        return complete;
    }

}
