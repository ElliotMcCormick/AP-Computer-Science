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
    private boolean isExploded;

    /**
     *
     * @param color
     */
    public CityPicture(Color color) {
        this.color = color;
        isExploded = false;
    }

    /**
     *
     * @param color
     * @param x
     * @param y
     * @param wid
     * @param ht
     */
    public CityPicture(Color color, double x, double y, double wid, double ht) {
        super(x, y, wid, ht);
        this.color = color;
        isExploded = false;

    }

    /**
     *
     * @return boolean isExploded
     */
    public boolean isExploded() {
        return isExploded;
    }

    /**
     * draws the city black when you explode it
     * isExploded becomes true
     * 
     * @param canvas
     */
    @Override
    public void explodeElement(Canvas canvas) {
        color = Color.BLACK;
        isExploded = true;
    }

    /**
     * draws the city, which is built in three layers of rectangles
     * 
     * @param canvas
     */
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
