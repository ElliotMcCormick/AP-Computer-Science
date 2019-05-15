/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;


/**
 * class to house all basic parts of the game
 * 
 * @author McCormick.Elliot19
 */
public class GameElement {
    
    private double xPos, yPos, width, height;
    
    /**
     *
     */
    public GameElement(){
        this(0,0,0,0);
    }
    
    /**
     *
     * @param x x position
     * @param y y position
     * @param wid width
     * @param ht height
     */
    public GameElement(double x, double y, double wid, double ht){
        setXpos(x);
        setYpos(y);
        setWidth(wid);
        setHeight(ht);
    }
    
    /**
     * set x position to new x
     * 
     * @param x new x position
     */
    public void setXpos(double x){
        xPos = x;
    }

    /**
     * set y position to new y
     * 
     * @param y new y position
     */
    public void setYpos(double y){
        yPos = y;
    }

    /**
     * set width to new width
     * 
     * @param wid new width
     */
    public void setWidth(double wid){
        width = wid;
    }

    /**
     * set height to new height
     * 
     * @param ht new height
     */
    public void setHeight(double ht){
        height = ht;
    }
    
    /**
     *
     * @return x position
     */
    public double getXpos(){
        return xPos;
    }

    /**
     *
     * @return y position
     */
    public double getYpos(){
        return yPos;
    }

    /**
     *
     * @return width
     */
    public double getWidth(){
        return width;
    }

    /**
     *
     * @return height
     */
    public double getHeight(){
        return height;
    }
    
}
