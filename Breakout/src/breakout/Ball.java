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
public class Ball extends GameElement implements Renderable, Updateable {
    //instance variables
    private double xVelocity, yVelocity;
    
    public Ball(){
        super();
    }
    public Ball(int x, int y, int wid, int ht, Color c, int xVel, int yVel){
        super(x, y, wid, ht, c);
        xVelocity = xVel;
        yVelocity = yVel;
    }
    //set methods
    public void setXVelocity(double xVel){
        xVelocity = xVel;
    }
    public void setYVelocity(double yVel){
        yVelocity = yVel;
    }
    
    //get methods
    public double getXVelocity(){
        return xVelocity;
    }
    public double getYVelocity(){
        return yVelocity;
    }
    
    @Override
    public void onCollision(GameElement element){
        if (checkCollision(element) != (null)){
            System.out.println("onCollision verifies collison");
            //if x overlap > y overlap - x velocity * -1
            if (checkCollision(element)[0] < checkCollision(element)[1]){
                System.out.println("bounce? x");
                xVelocity *= -1;
                
            //if x overlap < y overlap - y velocity * -1    
            } else if (checkCollision(element)[0] > checkCollision(element)[1]){
                System.out.println("bounce? y");
                yVelocity *= -1;
            }
        }  
    }
    
    @Override
    public void update(Canvas canvas){    
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        
        graphics.setFill(Color.WHITE);
        graphics.fillRect(getXPos(), getYPos(), getWidth(), getHeight());
    
        setX(getXPos() + xVelocity);
        setY(getYPos() + yVelocity);
    }
    
    @Override
    public void draw(Canvas canvas){
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        
        graphics.setFill(getColor());
        graphics.fillRect(getXPos(), getYPos(), getWidth(), getHeight());
    }
}
