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
public class Ball extends Block implements Renderable, Updateable {

    private int xSpeed;
    private int ySpeed;

    public Ball() {
        super();
        xSpeed = 3;
        ySpeed = 1;
    }

    public Ball(int x, int y, int wid, int ht, Color c){
        this(x, y, wid, ht, c, 3, 1);
    }

    public Ball(int x, int y, int wid, int ht, Color c, int xSpd, int ySpd){
        setX(x);
        setY(y);
        setWidth(wid);
        setHeight(ht);
        setColor(c);
        xSpeed = xSpd;
        ySpeed = ySpd;
    }
    //add the other Ball constructors - see BallTestOne
    //add the set methods
    public void setXSpeed(int xSpd){
        xSpeed = xSpd;
    }
    public void setYSpeed(int ySpd){
        ySpeed = ySpd;
    }
    //add the get methods
    public int getXSpeed(){
        return xSpeed;
    }
    public int getYSpeed(){
        return ySpeed;
    }
    //add a toString() method
    
    public String toString(){
        return super.toString() + " " + xSpeed + " " + ySpeed;
    }
    
    @Override
    public void update(Canvas canvas) {
        //draw a white ball at old ball location
        draw(canvas, Color.WHITE);
		//update the ball location
        new Ball(super.getX() + xSpeed, super.getY() + ySpeed);        

    }

    @Override
    public boolean equals(Object obj) {
        //complete this method
        Ball compare = (Ball)obj;
        return super.equals(obj) && xSpeed == compare.xSpeed && ySpeed == compare.ySpeed;
    }

    public void checkCollideLeft(Block b) {
	//complete this method - the word document might be helpful
        if (super.getX() == (b.getX() + b.getWidth())){
            setXSpeed(xSpeed * -1);
        }
    }
    public void checkCollideRight(Block b) { 
	//complete this method - the word document might be helpful
        if ((super.getX() - super.getWidth()) == b.getX()){
            setXSpeed(xSpeed * -1);
        }
    }


}
