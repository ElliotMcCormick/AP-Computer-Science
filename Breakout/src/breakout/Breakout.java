/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javafx.scene.canvas.Canvas;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Bogus.Andrew18
 */
public class Breakout extends Application {

    /**
     * @param args the command line arguments
     */
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    
    public static GameState state;
    private Ball ball;
    private Wall topWall;
    private Wall bottomWall;
    private Wall leftWall;
    private Wall rightWall;
    private Paddle paddle;
    private Block testBlock;
    
    private int deaths;
    
    private Color blockColor;
    
    RedrawTimer timer = new RedrawTimer();


    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        
        //instantiate your GameState object
        state = new GameState();
        
        //create walls, ball, paddle, and blocks
        topWall = new Wall(0, 0, WIDTH, 0, Color.WHITE);
        bottomWall = new Wall(0, HEIGHT, WIDTH, 0, Color.WHITE);
        leftWall = new Wall(0, 0, 0, HEIGHT, Color.WHITE);
        rightWall = new Wall(WIDTH, 0, 0, HEIGHT, Color.WHITE);
        
        ball = new Ball(WIDTH/2, HEIGHT - 200, 10, 10, Color.BLACK, 1, -1);
        paddle = new Paddle((WIDTH/2) - 10, HEIGHT - 10, 50, 5, Color.BLACK, 3);

        //DO NOT MOVE. BALL MUST BE INDEX ZERO
        state.add(ball); 
        state.add(paddle); //index one
        state.add(topWall); //etc
        state.add(bottomWall);
        state.add(leftWall);
        state.add(rightWall);
        
        // first loop y pos
        for (int y = 30; y < 105; y += 10){
        
            blockColor = Color.rgb((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
            
            // second loop x pos
            for (int x = 0; x < WIDTH - 86; x += WIDTH/10){
                Block block = new StrongBlock(x, y, 85, 8, blockColor);
                state.add(block);
            }
        }
       
        deaths = 0;
        
        
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Breakout");
        primaryStage.setScene(scene);
        primaryStage.show();
        timer.start();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.RIGHT) {
                    //set the paddle to move to the right
                    paddle.setDirection("RIGHT");
                }
                if (event.getCode() == KeyCode.LEFT) {
                    //set the paddle to move to the left
                    paddle.setDirection("LEFT");
                }
            }

        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.RIGHT) {
                    //set the paddle to not move
                    paddle.setDirection("NEUTRAL");
                }
                if (event.getCode() == KeyCode.LEFT) {
                    //set the paddle to not more
                    paddle.setDirection("NEUTRAL");                    
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);

    }

    public class RedrawTimer extends AnimationTimer {

        public void handle(long now) {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.clearRect(0, 0, WIDTH, HEIGHT);
            gc.setFont(new Font("Verdana", 14));
            gc.strokeText("Deaths:" + deaths, 50, 550);
            
            state.collideAll();
            
            state.updateAll(canvas);
            state.drawAll(canvas);
            
            if (ball.checkCollision(bottomWall) != null){
                deaths++;
                state.remove(ball);
                ball = new Ball(WIDTH/2, HEIGHT - 200, 10, 10, Color.BLACK, 1, -1);
                state.add(0, ball);
            }
            
            
            
            //update, draw and collide all of the Game Elements in the GameState object 
        }
    }

}
