/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

import java.util.ArrayList;
import javafx.scene.canvas.Canvas;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
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

    private int missileNumber;

    private RedrawTimer timer = new RedrawTimer();

    private GameState state;
    private Missile[] missileList;
    private Missile testMissile;
    private Explosion explosion;

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, WIDTH, HEIGHT);
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Missle Command");
        primaryStage.setScene(scene);
        primaryStage.show();

        state = new GameState();
        missileList = new Missile[30];
        missileNumber = 0;

        for (int i = 0; i < missileList.length; i++) {
            missileList[i] = (new Missile(WIDTH, HEIGHT, 3, Color.RED));
        }
        for (Missile missile : missileList) {
            missile.setTarget(-1, -1);
            state.add(missile);
        }

        timer.start();

        testMissile = new Missile(WIDTH, HEIGHT, 3, Color.RED);
        testMissile.setTarget(-1, -1);

        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (missileNumber < missileList.length) {
                    missileList[missileNumber].setTarget(event.getSceneX(), event.getSceneY());
                    explosion = new Explosion(missileList[missileNumber].getTargetPos()[0], missileList[missileNumber].getTargetPos()[1], 1, 1);
                    missileNumber++;
                } else {
                    System.out.println("out of missiles");
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

            //add missile to list when clicked then check if missile is not null update it?
            if (missileList[missileNumber].getTargetPos()[0] >= 0 && missileList[missileNumber].getTargetPos()[1] >= 0) {
                missileList[missileNumber].update(canvas);
                missileList[missileNumber].draw(canvas);
                System.out.println("missle update?");

                if (missileList[missileNumber].isElementExploded()) {
                    explosion.update(canvas);
                    explosion.draw(canvas);
                }
            }
        }

    }
}
