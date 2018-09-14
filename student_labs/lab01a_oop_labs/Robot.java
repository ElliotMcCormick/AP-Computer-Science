package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Class -
//Lab  -


class Robot {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(Color.BLUE);

        graphics.strokeText("Robot LAB ", 35, 35);

        //call head method
        head(canvas);
        upperBody(canvas);
        //call other methods

    }

    private void head(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        //head background
        graphics.fillRect(350, 50, 100, 100);
        //eyes
        graphics.setFill(Color.RED);
        graphics.fillRect(370, 70, 20, 20);
        graphics.fillRect(410, 70, 20, 20);
        //add more code here

    }

    private void upperBody(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        //add more code here
        graphics.setFill(Color.BLACK);
        graphics.fillOval(325, 100, 150, 150);
    }

    private void lowerBody(Canvas canvas) {
        //add more code here
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.strokeArc();
    }
}