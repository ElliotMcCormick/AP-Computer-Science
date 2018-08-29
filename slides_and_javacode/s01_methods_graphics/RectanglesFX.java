package s01_methods_graphics;

// A+ Computer Science
// www.apluscompsci.com

//graphics example for rectangles

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class RectanglesFX
{
public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.WHITE);
        graphics.fillRect(0, 0, 800, 600);
        
        graphics.setStroke(Color.BLACK);
        graphics.strokeText("Squares - Rectangles", 25, 50);
        
        graphics.setFill(Color.BLUE);
        //fillRect(int x1, int y1, int width, int height)
        graphics.fillRect(150, 300, 100, 20);
        
        graphics.setStroke(Color.GRAY);
        graphics.strokeRect(200, 80, 50, 50);
        
        graphics.setFill(Color.RED);
        graphics.fillRect(320, 370, 40, 40);
        
        graphics.setStroke(Color.BLUE);
        graphics.strokeRect(100, 180, 50, 50);
        
        graphics.setFill(Color.ORANGE);
        graphics.fillRect(520, 250, 90, 20);
    }

	
}