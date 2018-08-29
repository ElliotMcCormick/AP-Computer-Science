package s01_methods_graphics;

// A+ Computer Science
// www.apluscompsci.com
//graphics example for arcs
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class ArcsFX extends Canvas {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.WHITE);
        graphics.fillRect(0, 0, 800, 600);

        graphics.setStroke(Color.BLACK);
        graphics.strokeText("Arcs", 50, 50);

        graphics.setStroke(Color.BLUE);
        //drawArc(double x, double y, double width, double height, double startAngle, double arcAngle, ArcType closure)
        graphics.strokeArc(500, 300, 40, 40, 90, 90, ArcType.OPEN);

        graphics.setStroke(Color.GREEN);
        graphics.strokeArc(100, 100, 50, 50, 0, -180, ArcType.OPEN);

        graphics.setStroke(Color.RED);
        graphics.strokeArc(250, 100, 50, 50, 0, 270, ArcType.OPEN);

        graphics.setStroke(Color.ORANGE);
        graphics.strokeArc(50, 200, 50, 50, 180, -180, ArcType.OPEN);
    }

   
}
