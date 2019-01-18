/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20a_pong_project;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author wkranz
 */
public class Pong extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    RedrawTimer timer = new RedrawTimer();
    private int leftscore;
    private int rightscore;

    private int speedFactor = 2;
    private int ballSize = 7;
    //declare a ball, right paddle and left paddle
    Ball ball;
    Paddle left;
    Paddle right;
    
    Wall topWall;
    Wall leftWall;
    Wall rightWall;
    Wall bottomWall;
    
    private enum ballType{
        BLINKY, NORMAL, INVISIBLE
    }
    
    private static ballType ballType;
    
    private int randomDirection(){
        if ((int)(Math.random()*2) == 1){
            return 1;
        }
        return -1;
    }
    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        leftscore = 0;
        rightscore = 0;
        //instantiate a ball that will randomly come out of the middle of the screen
        //  going to the right or left
        int xSpeed = randomDirection() * ((int)(Math.random() * speedFactor) + 1);
        int ySpeed = randomDirection() * ((int)(Math.random() * speedFactor) + 1);
        
        ballType = ballType.NORMAL;
        
        ball = new Ball(WIDTH/2, HEIGHT/2, ballSize, ballSize, Color.BLACK, xSpeed, ySpeed);
        
        //instantiate a right paddle and left paddle
        left = new Paddle(10, HEIGHT/2);
        right = new Paddle (WIDTH - 20, HEIGHT/2);
        
        topWall = new Wall(0, 0, WIDTH, 0);
        bottomWall = new Wall(0, HEIGHT, WIDTH, 0);
        leftWall = new Wall (0, 0, 0, HEIGHT);
        rightWall = new Wall (WIDTH, 0, 0, HEIGHT);
        
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			//Fill in the code for the keypress events
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    right.setDirection("UP");
                }
                if (event.getCode() == KeyCode.DOWN) {
                    right.setDirection("DOWN");
                }
                if (event.getCode() == KeyCode.W) {
                    left.setDirection("UP");
                }
                if (event.getCode() == KeyCode.S) {
                    left.setDirection("DOWN");
                }
                if (event.getCode() == KeyCode.B) {
                    ballType = ballType.BLINKY;
                }
                if (event.getCode() == KeyCode.N) {
                    ballType = ballType.NORMAL;
                }
                if (event.getCode() == KeyCode.I) {
                    ballType = ballType.INVISIBLE;
                }
                if (event.getCode() == KeyCode.R){
                    rightscore = 0;
                    leftscore = 0;
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.UP) {
                    right.setDirection("NEUTRAL");
                }
                if (event.getCode() == KeyCode.DOWN) {
                    right.setDirection("NEUTRAL");
                }
                if (event.getCode() == KeyCode.W) {
                    left.setDirection("NEUTRAL");
                }
                if (event.getCode() == KeyCode.S) {
                    left.setDirection("NEUTRAL");
                }
            }
        });
        primaryStage.setTitle("Pong!");
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

    public class RedrawTimer extends AnimationTimer {
        int direction;

        @Override
        public void handle(long now) {
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.clearRect(0, 0, WIDTH, HEIGHT);
            gc.setFont(new Font("Verdana", 14));
            gc.strokeText("Left Score:" + leftscore, 50, 550);
            gc.strokeText("Right Score:" + rightscore, 50, 580);
            gc.strokeText("Press 'r' to reset score!", 50, 30);
            gc.strokeText("Press 'b' for ball to blink colors!", 50, 50);
            gc.strokeText("Press 'n' for ball to be normal!", 50, 70);
            gc.strokeText("Press 'i' for ball to be partially invisble!", 50, 90);
            
            

            if (ballType == ballType.BLINKY){
                ball = new BlinkyBall(ball.getX(), ball.getY(), ballSize, ballSize, Color.BLACK, ball.getXSpeed(), ball.getYSpeed());
                ball.update(canvas);
            }
            else if (ballType == ballType.NORMAL){
                ball = new Ball(ball.getX(), ball.getY(), ballSize, ballSize, Color.BLACK, ball.getXSpeed(), ball.getYSpeed());
                ball.update(canvas);
            }
            else if (ballType == ballType.INVISIBLE){
                ball = new InvisibleBall(ball.getX(), ball.getY(), ballSize, ballSize, Color.BLACK, ball.getXSpeed(), ball.getYSpeed());
                ball.update(canvas);
            }
            

            //check for ball collision with the top and bottom "wall" and the paddles
            ball.checkCollideTop(topWall);
            ball.checkCollideBottom(bottomWall);
            
            ball.checkCollideLeft(left);
            ball.checkCollideRight(right);
            //update all objects
            
            
            ball.update(canvas);

            left.update(canvas);
            right.update(canvas);
            //draw all objects
            ball.draw(canvas, ball.getColor());
            left.draw(canvas, left.getColor());
            right.draw(canvas, right.getColor());
            //check to see if the ball hits the left or right walls.
            int xSpeed = randomDirection() * ((int)(Math.random() * speedFactor) + 1);
            int ySpeed = randomDirection() * ((int)(Math.random() * speedFactor) + 1);
            
            if (ball.checkCollideLeftWall(leftWall)){
                rightscore++;
                if (ballType == ballType.BLINKY){
                    ball = new BlinkyBall(WIDTH/2, HEIGHT/2, ballSize, ballSize, Color.BLACK, xSpeed, ySpeed);
                } else if (ballType == ballType.NORMAL){
                    ball = new Ball (WIDTH/2, HEIGHT/2, ballSize, ballSize, Color.BLACK, xSpeed, ySpeed);
                } else if (ballType == ballType.INVISIBLE){
                    ball = new InvisibleBall (WIDTH/2, HEIGHT/2, ballSize, ballSize, Color.BLACK, xSpeed, ySpeed);
                    
                }
            }
            if (ball.checkCollideRightWall(rightWall)){
                leftscore++;
                if (ballType == ballType.BLINKY){
                    ball = new BlinkyBall(WIDTH/2, HEIGHT/2, ballSize, ballSize, Color.BLACK, xSpeed, ySpeed);
                } else if (ballType == ballType.NORMAL){
                    ball = new Ball (WIDTH/2, HEIGHT/2, ballSize, ballSize, Color.BLACK, xSpeed, ySpeed);
                } else if (ballType == ballType.INVISIBLE){
                    ball = new InvisibleBall (WIDTH/2, HEIGHT/2, ballSize, ballSize, Color.BLACK, xSpeed, ySpeed);                    
                } 
            }
            //  If so, reset the ball in the middle and adjust the score


        }
    }
}
