package golden_dragon_curve;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DragonGraphicsRunner extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
   
    private static Canvas canvas;

    @Override
    public void start(Stage primaryStage) {
        RedrawTimer timer = new RedrawTimer();

       
        
        StackPane root = new StackPane();

        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Golden dragon");
        primaryStage.setScene(scene);
        primaryStage.show();
        timer.start();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }

    public class RedrawTimer extends AnimationTimer {

        @Override
        public void handle(long now) {
           
        }

    }

}
