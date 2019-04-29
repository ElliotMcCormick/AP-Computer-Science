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

    public Background(Color color, int x, int y, int width) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
    }

    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        
        graphics.setFill(color);
        graphics.fillRect(x, y, width, HEIGHT);
        graphics.fillRect(x + (width/2 - 20), y-7, 40, 10);
    }

}
