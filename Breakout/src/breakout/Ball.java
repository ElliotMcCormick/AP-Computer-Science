/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

/**
 *
 * @author mccormick.elliot19
 */
public class Ball extends GameElement implements Renderable, Updateable {
    //instance variables
    private double xVelocity, yVelocity;
    
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
        if (!checkCollision(element).equals(null)){
            //if x overlap > y overlap - x velocity * -1
            if (checkCollision(element)[0] > checkCollision(element)[1]){
                xVelocity *= -1;
            //if x overlap < y overlap - y velocity * -1    
            } else if (checkCollision(element)[0] < checkCollision(element)[1]){
                yVelocity *= -1;
            }
        }  
    }
    
    @Override
    public void update(){
        
        setColor(Color.WHITE);
        
        setX(getXPos() + xVelocity);
        setY(getYPos() + yVelocity);
    }
    
    @Override
    public void draw(Canvas canvas){
        
    }
}
