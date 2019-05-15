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
public class Background implements Renderable {

    private Color color;
    private int x;
    private int y;
    private int width;
    private static int HEIGHT = 40;

    /**
     *
     * @param color color of the background
     * @param x x pos of the background
     * @param y y pos of the background
     * @param width width of background
     */
    public Background(Color color, int x, int y, int width) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
    }

    /**
     * method to draw the background/floor of the game
     * 
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        
        graphics.setFill(color);
        graphics.fillRect(x, y, width, HEIGHT);
        graphics.fillRect(x + (width/2 - 20), y-7, 40, 10);
    }

}
