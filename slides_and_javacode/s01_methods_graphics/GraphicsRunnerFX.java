package s01_methods_graphics;

// A+ Computer Science
// www.apluscompsci.com

//graphics frame to run graphics examples

import javax.swing.JFrame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GraphicsRunnerFX extends Application
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
        private static Canvas canvas;

        @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
        
        canvas = new Canvas(WIDTH, HEIGHT);
        
        root.getChildren().add(canvas);
        
        Scene primaryScene = new Scene(root, WIDTH, HEIGHT);
        
         //new CirclesFX().draw(canvas);
         //new RectanglesFX().draw(canvas);
         //new LinesFX().draw(canvas);
        new ArcsFX().draw(canvas);
         //new ColorsFX().draw(canvas);
        stage.setScene(primaryScene);
        stage.show();
    }


public static void main(String args[]) {
        launch(args);
    }
}