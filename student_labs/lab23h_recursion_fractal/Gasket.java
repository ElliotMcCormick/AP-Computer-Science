/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class Gasket {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        gasket(graphics, canvas, (canvas.getWidth() - 10) / 2, 20, canvas.getWidth() - 40, canvas.getHeight() - 20, 40, canvas.getHeight() - 20);

    }

    public void gasket(GraphicsContext g, Canvas canvas, double x1, double y1, double x2, double y2, double x3, double y3) {
        //base case goes here
        if (x2 - x1 > 2){
            Color color = Color.BLACK;
            g.setStroke(color);
            
            g.strokeLine(x1, y1, x2, y2);
            gasket(g, canvas, x1, y1, (x1 + x2) / 2, (y1 + y2) / 2, (x1 + x3) / 2, (y1 + y3) / 2);
            
            g.strokeLine(x1, y1, x3, y3);
            gasket(g, canvas, (x1 + x3) / 2, (y1 + y3) / 2, (x3 + x2) / 2, (y3 + y2) / 2, x3, y3);
            
            g.strokeLine(x2, y2, x3, y3);
            gasket(g, canvas, (x1 + x2) / 2, (y1 + y2) / 2, x2, y2, (x3 + x2) / 2, (y3 + y2) / 2);
            
            
            
        }
        //make a random color here
        //draw lines to make a triangle or use fillPolygon
        //make some recursive calls

    }
}
