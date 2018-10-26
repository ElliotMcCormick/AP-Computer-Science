package lab10_boolean_Board;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  - 


import java.util.Scanner;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;


public class Tester extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public void start(Stage stage) {
        HBox root = new HBox();
        
        Board board = new Board(WIDTH, HEIGHT);
        //BlockTestTwo testTwo = new BlockTestTwo(WIDTH - 200, HEIGHT);
        
        //testTwo.drawBlocks();
        
        board.drawBlocks();
        
        //root.getChildren().add(testTwo.getCanvas());
        root.getChildren().add(board.getCanvas());
        

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                board.mouseClicked(event);
                
            }
        });
        
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String args[]) {
        launch(args);
        
    }
}