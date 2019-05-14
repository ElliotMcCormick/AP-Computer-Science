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
    
    /**
     *
     */
    public GameElement(){
        this(0,0,0,0);
    }
    
    /**
     *
     * @param x
     * @param y
     * @param wid
     * @param ht
     */
    public GameElement(double x, double y, double wid, double ht){
        setXpos(x);
        setYpos(y);
        setWidth(wid);
        setHeight(ht);
    }
    
    /**
     *
     * @param x
     */
    public void setXpos(double x){
        xPos = x;
    }

    /**
     *
     * @param y
     */
    public void setYpos(double y){
        yPos = y;
    }

    /**
     *
     * @param wid
     */
    public void setWidth(double wid){
        width = wid;
    }

    /**
     *
     * @param ht
     */
    public void setHeight(double ht){
        height = ht;
    }
    
    /**
     *
     * @return
     */
    public double getXpos(){
        return xPos;
    }

    /**
     *
     * @return
     */
    public double getYpos(){
        return yPos;
    }

    /**
     *
     * @return
     */
    public double getWidth(){
        return width;
    }

    /**
     *
     * @return
     */
    public double getHeight(){
        return height;
    }
    
}
