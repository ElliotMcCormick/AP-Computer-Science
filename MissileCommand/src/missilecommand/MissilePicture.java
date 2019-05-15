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
 * class to draw the missile pictures that tell you how many shots you have left
 * 
 * @author elliot
 */
public class MissilePicture implements Renderable {

    private Color color;
    private int x;
    private int y;

    /**
     *
     * @param color color of the missile pictures in the bottom left
     */
    public MissilePicture(Color color) {
        this.color = color;
    }

    /**
     *
     * @param color color of the missile pictures
     * @param x x position
     * @param y y position
     */
    public MissilePicture(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;

    }

    /**
     * draw the little missile pictures that show how many missiles you have left
     * 
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {
        //just the little image of the missile telling you how many shots you have left
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        //it's just three rectangles
        graphics.setFill(color);
        graphics.fillRect(x, y, 5, 5);
        graphics.fillRect(x - 2, y + 5, 3, 3);
        graphics.fillRect(x + 4, y + 5, 3, 3);

    }
}
