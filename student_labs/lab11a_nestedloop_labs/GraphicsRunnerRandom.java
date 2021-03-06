package lab11a_nestedloop_labs;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class GraphicsRunner extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    private RandomColoredBoxes shape;

    @Override
    public void start(Stage primaryStage) {
        RedrawTimer timer = new RedrawTimer();
        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        shape = new RandomColoredBoxes();
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        primaryStage.setTitle("Drawing Boxes");
        primaryStage.setScene(scene);
        primaryStage.show();
        timer.start();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    public class RedrawTimer extends AnimationTimer { //added for animation lab05

        @Override
        public void handle(long now) {
            shape.clear(canvas);
            shape.draw(canvas);
        }

    }
    
}
