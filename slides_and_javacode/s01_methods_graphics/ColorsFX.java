package s01_methods_graphics;

// A+ Computer Science
// www.apluscompsci.com

//graphics example for colors

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class ColorsFX
{
 public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.WHITE);
        graphics.fillRect(0, 0, 800, 600);
        

        graphics.setStroke(Color.BLACK);
        graphics.strokeText("Colors", 50, 50);
        
        //Color( int red, int green, int blue )
        graphics.setStroke(Color.rgb(40, 60, 80));
        graphics.strokeArc(100,100,50,50,0,-180,ArcType.OPEN);
        
        //the simple approach
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color newColor = Color.rgb(red, green, blue);
        graphics.setFill(newColor);
        graphics.fillRect(250,300,50,50);

        //the not so simple approach
	newColor = Color.rgb(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
	graphics.setFill(newColor);
        graphics.fillOval(150,200,50,50);
        
        
        newColor = Color.rgb(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
	graphics.setFill(newColor);
        graphics.fillOval(550,100,10,50);
        
        red = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        newColor = Color.rgb(red, green, blue);
        graphics.setFill(newColor);
        graphics.fillRect(450,200,50,50);

    }

	
}