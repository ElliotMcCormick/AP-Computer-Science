/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

import java.util.ArrayList;
import java.util.Arrays;
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

    private static final int LAUNCH_POINT_X = WIDTH / 2;
    private static final int LAUNCH_POINT_Y = HEIGHT - 50;

    private boolean gameOver = false;

    private int explodedCityCount = 0;

    private int missilePicX = 10;
    private static Canvas canvas;

    private int missileNumber;

    private RedrawTimer timer = new RedrawTimer();

    private GameState state;
    private ArrayList<Missile> missileList;
    private ArrayList<Explosion> explosionList;
    private ArrayList<Missile> enemyMissileList;
    private ArrayList<Explosion> enemyExplosionList;

    //all the drawing stuff that isn't missles
    private Background ground;
    private ArrayList<MissilePicture> missilePicList;
    private ArrayList<CityPicture> cityList;

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();
        canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);

        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, WIDTH, HEIGHT);

        //set screen black
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Missile Command");
        primaryStage.setScene(scene);
        primaryStage.show();

        state = new GameState();

        explosionList = new ArrayList<Explosion>();
        missileList = new ArrayList<Missile>();
        missileList.add(new Missile(LAUNCH_POINT_X, LAUNCH_POINT_Y, 3, Color.RED));
        missileNumber = 0;

        enemyExplosionList = new ArrayList<Explosion>();
        enemyMissileList = new ArrayList<Missile>();

        ground = new Background(Color.CORNFLOWERBLUE, 0, HEIGHT - 40, WIDTH);
        state.add(ground);

        missilePicList = new ArrayList<MissilePicture>();
        for (int i = 0; i < 30 * 11; i += 11) {
            missilePicList.add(new MissilePicture(Color.CORAL, 10 + i, HEIGHT - 20));
        }
        for (MissilePicture pic : missilePicList) {
            state.add(pic);
        }

        cityList = new ArrayList<CityPicture>();
        for (int i = 0; i < 6 * WIDTH / 6; i += WIDTH / 6) {
            cityList.add(new CityPicture(Color.RED, 50 + i, HEIGHT - 45, 100, 100));
        }
        for (CityPicture pic : cityList) {
            state.add(pic);
        }

        timer.start();

        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (missileNumber < 30) {

                    if (event.getSceneY() < HEIGHT - 60) {
                        missileList.add(new Missile(LAUNCH_POINT_X, LAUNCH_POINT_Y, 7, Color.RED));
                        missileList.get(missileNumber).setTarget(event.getSceneX(), event.getSceneY());
                        explosionList.add(new Explosion(missileList.get(missileNumber).getTargetPos()[0], missileList.get(missileNumber).getTargetPos()[1], 1, 1));

                        state.remove(missilePicList.get(missileNumber));

                        missileNumber++;
                    }
                } else {
                    System.out.println("OUT OF MISSILES!");
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

            //set screen black
            gc.setFill(Color.BLACK);
            gc.fillRect(0, 0, WIDTH, HEIGHT);
            state.updateAll(canvas);
            state.drawAll(canvas);

            
            if (enemyMissileList.size() < 20) {
                if (Math.random() * 400 > 399) {
                    int randomCity = (int) (Math.random() * 6);
                    Missile enemy = new Missile(Math.random() * WIDTH, 0, 1, Color.GREEN);
                    enemyMissileList.add(enemy);
                    enemy.setTarget(75 + (randomCity * WIDTH / 6), HEIGHT - 45);
                    enemyExplosionList.add(new Explosion(enemy.getTargetPos()[0], enemy.getTargetPos()[1], 1, 1));
                }
            }

            for (int i = 0; i < enemyMissileList.size(); i++) {
                if (enemyMissileList.get(i).getTargetPos()[0] >= 0 && enemyMissileList.get(i).getTargetPos()[1] >= 0) {
                    enemyMissileList.get(i).update(canvas);
                    enemyMissileList.get(i).draw(canvas);

                    if (enemyMissileList.get(i).isExploded()) {
                        enemyExplosionList.get(i).update(canvas);
                        enemyExplosionList.get(i).draw(canvas);

                        if (enemyExplosionList.get(i).blewItUp(cityList.get(0))) {
                            cityList.get(0).explodeElement(canvas);

                        } else if (enemyExplosionList.get(i).blewItUp(cityList.get(1))) {
                            cityList.get(1).explodeElement(canvas);

                        } else if (enemyExplosionList.get(i).blewItUp(cityList.get(2))) {
                            cityList.get(2).explodeElement(canvas);

                        } else if (enemyExplosionList.get(i).blewItUp(cityList.get(3))) {
                            cityList.get(3).explodeElement(canvas);

                        } else if (enemyExplosionList.get(i).blewItUp(cityList.get(4))) {
                            cityList.get(4).explodeElement(canvas);

                        } else if (enemyExplosionList.get(i).blewItUp(cityList.get(5))) {
                            cityList.get(5).explodeElement(canvas);

                        }

                    }

                }
            }

            for (int i = 0; i < missileList.size(); i++) {
                if (missileList.get(i).getTargetPos()[0] >= 0 && missileList.get(i).getTargetPos()[1] >= 0) {
                    missileList.get(i).update(canvas);
                    missileList.get(i).draw(canvas);

                    if (missileList.get(i).isExploded()) {
                        explosionList.get(i).update(canvas);
                        explosionList.get(i).draw(canvas);

                        for (int j = 0; j < enemyMissileList.size(); j++) {
                            if (explosionList.get(i).blewItUp(enemyMissileList.get(j))) {
                                enemyMissileList.remove(j);
                                enemyExplosionList.remove(j);
                            }
                        }
                    }
                }
            }

        }
    }
}
