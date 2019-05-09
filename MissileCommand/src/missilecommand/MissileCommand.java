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

   //Screen width and height 
    private static final int WIDTH = 900;
    private static final int HEIGHT = 600;

    //location on the screen where the missiles launch from
    private static final int LAUNCH_POINT_X = WIDTH / 2;
    private static final int LAUNCH_POINT_Y = HEIGHT - 50;

    //3 at home, 7 at school
    private static final double MISSILE_SPEED = 3;

    //0.5 at home, 1 at school
    private static final double ENEMY_MISSILE_SPEED = 0.5;

    //variables that are used to control text on the screen
    private boolean gameOver;
    private int score;
    private boolean outOfMissiles;

    
    private static Canvas canvas;

    //number of missiles
    private int missileNumber;

    private RedrawTimer timer = new RedrawTimer();

    //lists of all the moving pieces 
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

        //initialize variables
        gameOver = false;
        score = 0;
        outOfMissiles = false;

        //clear the screen
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, WIDTH, HEIGHT);

        //title the screen
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Missile Command");
        primaryStage.setScene(scene);
        primaryStage.show();

        //initialize lists of missiles and game elements
        state = new GameState();

            //initialize explosions and missiles. add the first missile to the list
        explosionList = new ArrayList<Explosion>();
        missileList = new ArrayList<Missile>();
        missileList.add(new Missile(LAUNCH_POINT_X, LAUNCH_POINT_Y, MISSILE_SPEED, Color.RED));
        missileNumber = 0;
        
             //initialize enemy explosions and missiles. 
             //add the first missile to the list
             
        enemyExplosionList = new ArrayList<Explosion>();
        enemyMissileList = new ArrayList<Missile>();
            //this random stuff is explained below
        int randomCity = (int) (Math.random() * 6);
        Missile enemy = new Missile(Math.random() * WIDTH, 0, ENEMY_MISSILE_SPEED, Color.GREEN);
        enemyMissileList.add(enemy);
        enemy.setTarget(75 + (randomCity * WIDTH / 6), HEIGHT - 45);
        enemyExplosionList.add(new Explosion(enemy.getTargetPos()[0], enemy.getTargetPos()[1], 1, 1));

        // draw the ground
        ground = new Background(Color.CORNFLOWERBLUE, 0, HEIGHT - 40, WIDTH);
        state.add(ground);

        // draw the little missile pictures
        missilePicList = new ArrayList<MissilePicture>();

            //would definitely rather have a for loop but I gotta fulfill requirements
            //and I couldn't figure out anyother place to put one. 
        int missilePicListCounter = 0;
        while (missilePicListCounter < 30 * 11) {
            missilePicList.add(new MissilePicture(Color.CORAL, 10 + missilePicListCounter, HEIGHT - 20));

            missilePicListCounter += 11;
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
                        missileList.add(new Missile(LAUNCH_POINT_X, LAUNCH_POINT_Y, MISSILE_SPEED, Color.RED));
                        missileList.get(missileNumber).setTarget(event.getSceneX(), event.getSceneY());
                        explosionList.add(new Explosion(missileList.get(missileNumber).getTargetPos()[0], missileList.get(missileNumber).getTargetPos()[1], 1, 1));

                        state.remove(missilePicList.get(missileNumber));
                        missileNumber++;
                    }
                } else {
                    outOfMissiles = true;
                }
            }

        });

    }

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public class RedrawTimer extends AnimationTimer {

        public void handle(long now) {

            if (!gameOver) {
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.clearRect(0, 0, WIDTH, HEIGHT);

                //set screen black
                gc.setFill(Color.BLACK);
                gc.fillRect(0, 0, WIDTH, HEIGHT);

                gc.setFill(Color.WHITE);
                gc.setFont(new Font("Verdana", 15));
                gc.fillText("SCORE :: " + score, 50, 50);

                state.updateAll(canvas);
                state.drawAll(canvas);

                if (outOfMissiles) {
                    gc.setFill(Color.ORANGE);
                    gc.setFont(new Font("Verdana", 15));
                    gc.fillText("OUT OF MISSILES", 50, 100);
                }

                if (enemyMissileList.size() < 1) {
                    
                        int randomCity = (int) (Math.random() * 6);
                        Missile enemy = new Missile(Math.random() * WIDTH, 0, ENEMY_MISSILE_SPEED, Color.GREEN);
                        enemyMissileList.add(enemy);
                        enemy.setTarget(75 + (randomCity * WIDTH / 6), HEIGHT - 45);
                        enemyExplosionList.add(new Explosion(enemy.getTargetPos()[0], enemy.getTargetPos()[1], 1, 1));

                } else {
                    if (Math.random() * 400 > 399) {
                        int randomCity = (int) (Math.random() * 6);
                        Missile enemy = new Missile(Math.random() * WIDTH, 0, ENEMY_MISSILE_SPEED, Color.GREEN);
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
                                    score += 10;
                                }
                            }

                        }

                    }

                    if (allCitiesExploded()) {
                        gc.clearRect(0, 0, WIDTH, HEIGHT);
                        gc.setFill(Color.RED);
                        gc.setFont(new Font("Verdana", 100));
                        gc.fillText("GAME OVER", 150, 300);
                        gc.setFont(new Font("Verdana", 50));
                        gc.fillText("SCORE :: " + score, 175, 400);
                        gameOver = true;
                    }

                }
            }
        }

        private boolean allCitiesExploded() {
            for (CityPicture city : cityList) {
                if (!city.isExploded()) {
                    return false;
                }
            }
            return true;
        }
    }

}
