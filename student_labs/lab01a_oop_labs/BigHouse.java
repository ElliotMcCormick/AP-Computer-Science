package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import java.awt.Graphics;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Class -
//Lab  -


public class BigHouse {

    public void draw(Canvas canvas) {
        bigHouse(canvas);
    }
    
    private void bigHouse(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        
        graphics.setStroke(Color.BLUE);

        graphics.strokeText("BIG HOUSE ", 50, 50);

        //house
        graphics.setFill(Color.BROWN);
        graphics.fillRect(200, 200, 400, 400);
        
        //door
        graphics.setFill(Color.GREEN);
        graphics.fillRect(350, 450, 100, 250);
        
        //windows
        graphics.setFill(Color.WHITE);
        graphics.fillRect(260, 300, 100, 100);
        graphics.fillRect(440, 300, 100, 100);
        
        //door knob
        graphics.setFill(Color.BLACK);
        graphics.fillOval(420, 540, 20, 20);
        
        //roof
        graphics.setFill(Color.GREEN);
        drawTriangle(graphics, 400, 50, 300, 200);
        
    }
    
    public void drawTriangle(GraphicsContext graphics, int topX, int topY, int width, int height){
        double[] xPoints = {topX, topX + width, topX - width};
        double[] yPoints = {topY, topY + height, topY + height};
        
        graphics.fillPolygon(xPoints, yPoints, 3);
        //graphics.fillPolygon(xpoints, ypoints, numPoints);
    }
    
    
}