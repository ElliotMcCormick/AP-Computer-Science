package s01_methods_graphics;

// A+ Computer Science
// www.apluscompsci.com

//graphics example for circles/ovals

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class CirclesFX
{
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.WHITE);
        graphics.fillRect(0, 0, 800, 600);
        
        graphics.setStroke(Color.BLACK);
        graphics.strokeText("Circles - Ovals", 50, 50);
        
        graphics.setStroke(Color.BLUE);
        //strokeOval(int x1, int y1, int width, int height)
        graphics.strokeOval(500, 300, 40, 40);
        
        graphics.setStroke(Color.GREEN);
        graphics.strokeOval(400, 100, 100, 50);
        
        graphics.setFill(Color.YELLOW);
        graphics.fillOval(250, 250, 90, 90);
        
        graphics.setFill(Color.RED);
        graphics.fillOval(50, 150, 50, 50);
        
        graphics.setFill(Color.BLUE);
        graphics.fillOval(150, 350, 120, 80);
    }
//	public void paint( Graphics window )
//	{
//		window.setColor(Color.BLACK);
//		window.drawString("Circles - Ovals", 50, 50);
//
//		window.setColor(Color.BLUE);
//
//		//drawOval(int x1, int y1, int width, int height)
//		window.drawOval(500,300,40,40);
//
//		window.setColor(Color.GREEN);
//		window.drawOval(400,100,100,50);
//
//		window.setColor(Color.YELLOW);
//		window.fillOval(250,250,90,90);
//
//		window.setColor(Color.RED);
//		window.fillOval(50,150,50,50);
//
//		window.setColor(Color.BLUE);
//		window.fillOval(150,350,120,80);
//	}
}