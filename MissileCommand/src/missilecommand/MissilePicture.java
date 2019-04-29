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
public class MissilePicture implements Renderable {

    private Color color;
    private int x;
    private int y;

    public MissilePicture(Color color) {
        this.color = color;
    }


    public MissilePicture(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;

    }

    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(color);
        graphics.fillRect(x, y, 5, 5);
        graphics.fillRect(x - 2, y + 5, 3, 3);
        graphics.fillRect(x + 4, y + 5, 3, 3);

    }
}
