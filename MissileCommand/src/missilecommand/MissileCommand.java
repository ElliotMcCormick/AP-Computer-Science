/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

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
 * @author McCormick.Elliot19
 */
public class MissileCommand extends Application {

    /**
     * @param args the command line arguments
     */
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;
    private static Canvas canvas;

    RedrawTimer timer = new RedrawTimer();

    Missile testMissile;
    Explosion explosion;

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, WIDTH, HEIGHT);
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        testMissile = new Missile(0, 0, 3, Color.RED);

        testMissile.setTarget(WIDTH / 2, HEIGHT / 2);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Missle Command");
        primaryStage.setScene(scene);
        primaryStage.show();
        timer.start();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public class RedrawTimer extends AnimationTimer {

        public void handle(long now) {
            GraphicsContext gc = canvas.getGraphicsContext2D();

            testMissile.update(canvas);
            testMissile.draw(canvas);
            if (testMissile.isElementExploded()) {
                explosion = new Explosion(testMissile.getXpos() - (testMissile.getWidth() / 2), testMissile.getYpos() - (testMissile.getHeight() / 2), 5, 5);
                explosion.update(canvas);
                explosion.draw(canvas);
            }
            

        }
    }
}