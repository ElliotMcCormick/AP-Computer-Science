package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
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
        //BigHouse house = new BigHouse();
        //house.draw(canvas);
        
        //Robot Lab
        //Robot robot = new Robot();
        //robot.draw(canvas);
        
        //Shape Lab
        Shape shape1 = new Shape(100, 100, 150, 100, Color.RED);
        shape1.draw(canvas);
        Shape shape2 = new Shape(200, 400, 34, 56, Color.GREEN);
        shape2.draw(canvas);
        Shape shape3 = new Shape (505, 10, 55, 200, Color.BLUE);
        shape3.draw(canvas);
        
        System.out.println(shape3.toString());
        shape3.setXPos(400);
        shape3.setColor(Color.BLUEVIOLET);
        shape3.draw(canvas);
        System.out.println(shape3.toString());

        
        stage.setScene(primaryScene);
        stage.setTitle("Lab 1");
        stage.show();
    }
}