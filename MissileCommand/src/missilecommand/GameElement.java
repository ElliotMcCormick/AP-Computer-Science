/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;


/**
 *
 * @author McCormick.Elliot19
 */
public class GameElement {
    
    private double xPos, yPos, width, height;
    
    public GameElement(){
        this(0,0,0,0);
    }
    
    public GameElement(double x, double y, double wid, double ht){
        setXpos(x);
        setYpos(y);
        setWidth(wid);
        setHeight(ht);
    }
    
    public void setXpos(double x){
        xPos = x;
    }
    public void setYpos(double y){
        yPos = y;
    }
    public void setWidth(double wid){
        width = wid;
    }
    public void setHeight(double ht){
        height = ht;
    }
    
    public double getXpos(){
        return xPos;
    }
    public double getYpos(){
        return yPos;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    
}
