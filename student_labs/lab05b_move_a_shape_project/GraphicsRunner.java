package lab05b_move_a_shape_project;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphicsRunner extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Shape shape;
    private static Shape test;
    private static Canvas canvas;

    @Override
    public void start(Stage primaryStage) {
        RedrawTimer timer = new RedrawTimer();

        shape = new Shape();
        shape.setWidth(20);
        shape.setHeight(20);
        shape.setXSpeed(2);
        shape.setYSpeed(3);
        
        test = new Shape(2, 3, 30, 25, Color.GREEN, 3, 5);
        
        StackPane root = new StackPane();

        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Moving Shapes");
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
            shape.clear(canvas);
            shape.draw(canvas);
            shape.move();
            test.draw(canvas);
            test.move();
        }

    }

}
