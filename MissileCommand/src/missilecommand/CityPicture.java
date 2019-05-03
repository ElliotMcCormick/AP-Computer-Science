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
 * @author mccormick.elliot19
 */
public class CityPicture extends ExplodingElement implements Renderable {

    private Color color;
    private boolean growing;

    public CityPicture(Color color) {
        this.color = color;
    }

    public CityPicture(Color color, double x, double y, double wid, double ht) {
        super(x, y, wid, ht);
        this.color = color;
    }

    @Override
    public void explodeElement(Canvas canvas) {
//        double changeInSize = 0.5;
//        
//        GraphicsContext graphics = canvas.getGraphicsContext2D();
//
//        graphics.setFill(Color.BLACK);
//        graphics.setLineWidth(2);
//        graphics.setStroke(Color.BLACK);
//        
//        graphics.strokeOval(getXpos() - (super.getWidth() / 2), getYpos() - (super.getHeight() / 2), super.getWidth(), super.getHeight());
//        graphics.fillOval(getXpos() - (super.getWidth() / 2), getYpos() - (super.getHeight() / 2), super.getWidth(), super.getHeight());
//
//        if (super.getWidth() >= super.getExplosionRadius()) {
//            growing = false;
//        } else if (super.getWidth() < super.getExplosionRadius() && growing) {
//            super.setWidth(super.getWidth() + changeInSize);
//            super.setHeight(super.getHeight() + changeInSize);
//            super.setXpos(getXpos() - (super.getWidth() / 2));
//            super.setYpos(getYpos() - (super.getHeight() / 2));
//        }
        color = Color.BLACK;
        draw(canvas);
    }

    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(color);

        //top
        graphics.fillRect(getXpos(), getYpos(), getWidth() / 2, 10);
        //middle
        graphics.fillRect(getXpos() + 20, getYpos() - 5, getWidth() / 4, 13);
        //base
        graphics.fillRect(getXpos() + 10, getYpos() - 8, getWidth() / 4, 15);
    }

}
