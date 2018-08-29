package s01_methods_graphics;

// A+ Computer Science
// www.apluscompsci.com
//graphics example for lines
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class LinesFX {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.WHITE);
        graphics.fillRect(0, 0, 800, 600);

        graphics.setStroke(Color.BLACK);
        graphics.strokeText("Points - Lines", 25, 50);

        graphics.setStroke(Color.YELLOW);
        //strokeLine(int x1, int y1, int x2, int y2)
        graphics.strokeLine(300, 300, 400, 400);

        graphics.setStroke(Color.RED);
        graphics.strokeLine(50, 100, 50, 300);

        graphics.setStroke(Color.BLUE);
        graphics.strokeLine(100, 100, 100, 400);

        graphics.setStroke(Color.ORANGE);
        graphics.strokeLine(400, 200, 400, 201);

        graphics.setStroke(Color.GREEN);
        graphics.strokeLine(50, 400, 500, 400);
    }

    
}
