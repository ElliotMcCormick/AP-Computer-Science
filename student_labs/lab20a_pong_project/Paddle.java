/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

/**
 *
 * @author wkranz
 */
public class Paddle extends Block implements Renderable, Updateable {

    private int speed;
    private String direction;

    public Paddle() {
        super(10, 10, 10, 40, Color.BLACK);
        speed = 2;
        direction = "NEUTRAL	";
    }
    public Paddle(int x, int y) {
        super(x, y, 10, 40, Color.BLACK);
        speed = 2;
        direction = "NEUTRAL	";
    }
    //add the other Paddle constructors
    public Paddle(int x, int y, int wid, int ht, Color c){
        super(x, y, wid, ht, c);
        speed = 2;
        direction = "NEUTRAL    ";
    }
    
    public Paddle(int x, int y, int wid, int ht, Color c, int ySpeed){
        super(x, y, wid, ht, c);
        speed = ySpeed;
        direction = "NEUTRAL    ";
    }
    //add get methods
    public int getPaddleSpeed(){
        return speed;
    }
    public String getPaddleDirection(){
        return direction;
    }
    //add set methods
    public void setPaddleSpeed(int s){
        speed = s;
    }
    public void setDirection(String d){
        direction = d;
    }
    //add a toString() method
    public String toString(){
        return super.toString() + " " + speed + " " + direction;
    }
    
    @Override
    public void update(Canvas canvas) {
        draw(canvas, Color.WHITE);
        if (direction.equals("UP") && super.getY() > 0) {
            super.setY(super.getY() - speed);
            //update paddle
        } else if (direction.equals("DOWN") && (super.getY() + super.getHeight()) < canvas.getHeight()) {
            super.setY(super.getY() + speed);
            //update paddle
        }
    }



}
