package lab11a_nestedloop_labs;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 *
 * @author wkranz
 */

/*
 * So GraphicsRunner.java makes the random pattern. And GraphicsRunnerRandom.java gives you epilepsy. 
 * I don't know if that was intentional, but they were written that way so I just left them alone. 
 */
public class RandomColoredBoxes {

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.BLACK);
        graphics.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        graphics.setStroke(Color.RED);
        graphics.setFont(new Font("Tahoma", 16));
        graphics.strokeText("Drawing boxes with nested loops", 20, 40);
        //graphics.setFill(Color.BLUE);
		//nested for loop draw boxes across and down the screen.  canvas.getHeight() and canvas.getWidth() are helpful
		//make sure to use a random color.  Color.rgb could be helpful
        for (int i = 0; i < canvas.getHeight(); i += canvas.getHeight()/14){
            for (int j = 0; j < canvas.getWidth(); j += canvas.getWidth()/20){
                graphics.setFill(Color.rgb((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));
                graphics.fillRect(j, i, canvas.getWidth()/20, canvas.getHeight()/14);
            }
        }
    }

    public void clear(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}
