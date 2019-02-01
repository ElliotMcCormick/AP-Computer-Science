/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

/**
 *
 * @author mccormick.elliot19
 */
public abstract class GameElement {
    
    //instance variables
    private double width;
    private double height;
    private double xPos;
    private double yPos;
    
    //constructors
    public GameElement(){
        this(0.0, 0.0, 0.0, 0.0);
    }
    public GameElement(double wid, double ht, double x, double y){
        width = wid;
        height = ht;
        xPos = x;
        yPos = y;
    }
    
    //set methods for each instance var
    public void setWidth(double wid){
        width = wid;
    }
    public void setHeight(double ht){
        height = ht;
    }
    public void setX(double x){
        xPos = x;
    }
    public void setY(double y){
        yPos = y;
    }
    
    //get methods for each instance var
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getXPos(){
        return xPos;
    }
    public double getYPos(){
        return yPos;
    }
    
    /*
    abstact method that Child classes use to determine
    what they do when the collide
    */
    public abstract void onCollision(GameElement element);
    
    //Checks to see if elements collide
    public boolean checkCollision(GameElement element){
        //if right side of @this collides with the left of 
        //@element
        if (xPos < element.xPos + element.width){
            return true;
        }
        //if left side of @this collide with the right of
        //@element
        if (xPos + width > element.yPos){
            return true;
        }
    }
}
