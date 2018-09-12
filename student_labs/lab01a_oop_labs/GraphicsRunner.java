package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//Name -
//Date -
//Class -
//Lab  -


public class GraphicsRunner extends Application{

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();
        
        canvas = new Canvas(WIDTH, HEIGHT);
        
        root.getChildren().add(canvas);
        
        Scene primaryScene = new Scene(root, WIDTH, HEIGHT);
       
        //SmileyFace Lab
        //SmileyFace face = new SmileyFace();
		//face.paint(canvas);
          
        //Big House Lab
        BigHouse house = new BigHouse();
        house.draw(canvas);
        
        stage.setScene(primaryScene);
        stage.setTitle("Lab 1");
        stage.show();
    }
}