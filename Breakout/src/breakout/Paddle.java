/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author mccormick.elliot19
 */
public class Paddle extends GameElement implements Renderable, Updateable{
    
    private int speed;
    private String direction;

    public Paddle() {
        super();
    }
    
    public Paddle(int x, int y, int wid, int ht, Color c){
        super(x, y, wid, ht, c);
        speed = 4;
        direction = "NEUTRAL    ";
    }
    
    public Paddle(int x, int y, int wid, int ht, Color c, int xSpeed){
        super(x, y, wid, ht, c);
        speed = xSpeed;
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
     
    @Override
    public void update(Canvas canvas) {
        if (direction.equals("RIGHT") && getXPos() + getWidth() < canvas.getWidth()) {
            setX(getXPos() + speed);
            //update paddle
        } else if (direction.equals("LEFT") && (getXPos() > 0)) {
            setX(getXPos() - speed);
            //update paddle
        }
    }
    
    @Override
    public void draw(Canvas canvas){
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        
        graphics.setFill(getColor());
        graphics.fillRect(getXPos(), getYPos(), getWidth(), getHeight());
    }

    @Override
    public void onCollision(GameElement element) {
    }
}
