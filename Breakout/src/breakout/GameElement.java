/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javafx.scene.paint.Color;

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
    private Color color;
    
    //constructors
    public GameElement(){
        this(0.0, 0.0, 0.0, 0.0, Color.BLACK);
    }
    public GameElement(double x, double y, double wid, double ht, Color c){
        width = wid;
        height = ht;
        xPos = x;
        yPos = y;
        color = c;
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
    public void setColor(Color c){
        color = c;
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
    public Color getColor(){
        return color;
    }
    
    /*
    abstact method that Child classes use to determine
    what they do when the collide
    */
    public abstract void onCollision(GameElement element);
    
    //Checks to see if elements collide
    public double[] checkCollision(GameElement element){
        // x1 + w1 - x2 = num
        // x2 + w2 - x1 = num 2
        // if nums are both pos then take lowest number
        
        double xOverlap1 = xPos + width - element.xPos;
        double xOverlap2 = element.xPos + element.width - xPos;
        
        double yOverlap1 = yPos + height - element.yPos;
        double yOverlap2 = element.yPos + element.height - yPos;
        
        double minXOverlap = Math.min(xOverlap1, xOverlap2);
        double minYOverlap = Math.min(yOverlap1, yOverlap2);
        
        if (minXOverlap > 0 && minYOverlap > 0){
            double[] output = {minXOverlap, minYOverlap};
            System.out.println("collision!");
            
            return output;
            
        }
        
        return null;
    }
}
