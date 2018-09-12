package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

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

        graphics.setFill(Color.BLUE);

        graphics.fillRect(200, 200, 400, 400);

    }
    
    private void drawTriangle(GraphicsContext graphics, int topX, int topY, int width, int height){
        double xpoints[] = {topX, topX - width, topX + width};
        double ypoints[] = {topY, topY - height, topY + height};
        int numPoints = 3;
        
        graphics.fillPolygon(xpoints, ypoints, numPoints);
    }
}