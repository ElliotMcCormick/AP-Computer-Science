package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import javafx.scene.shape.ArcType;

//Name -
//Date -
//Class -
//Lab  -


public class SmileyFace {

    public void paint(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.BLUE);
        graphics.strokeText("SMILEY FACE LAB ", 35, 35);
        smileyFace(canvas);
    }

    public void smileyFace(Canvas canvas) {
        //A nice lime green
        Color eyeColor = Color.rgb(68, 234, 53);
        
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        

        //face
        graphics.setFill(Color.YELLOW);
        graphics.fillOval(210, 100, 400, 400);

        //nose
        graphics.setFill(Color.BLACK);
        graphics.fillOval(390, 290, 40, 40);
        
        //eyes
        graphics.setFill(eyeColor);
        graphics.fillOval(280, 200, 60, 40);
        graphics.fillOval(470, 200, 60, 40);
        
        //mouth
        graphics.setStroke(Color.RED);
        graphics.strokeArc(310, 350, 200, 70, 0, -180, ArcType.OPEN);
        //add more code here
    }
}