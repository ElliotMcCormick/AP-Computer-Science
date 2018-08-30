package roleplay;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Class -
//Lab  -


public class BlackBoard {

    public void paint(Canvas canvas) {
        draw(canvas);
    }

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.BLUE);
        graphics.strokeText("Hi Class! ", 35, 35);

        graphics.setFill(Color.YELLOW);
        graphics.strokeOval(210, 100, 400, 400);

        graphics.setFill(Color.BLUEVIOLET);
        graphics.strokeRect(100, 50, 30, 30);
        //add more code here


    }
}