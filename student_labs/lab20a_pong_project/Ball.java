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

    public Ball(int x, int y){
        this(x, y, 2, 2, Color.BLACK, 3, 1);
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
        this.setX(getX() + getXSpeed());
        this.setY(getY() + getYSpeed());
    }

    @Override
    public boolean equals(Object obj) {
        //complete this method
        Ball compare = (Ball)obj;
        return super.equals(obj) && xSpeed == compare.xSpeed && ySpeed == compare.ySpeed;
    }

    public void checkCollideLeft(Block b) {
	//complete this method - the word document might be helpful
        if (super.getX() <= b.getX() + b.getWidth() + Math.abs(xSpeed) && (super.getY() >= b.getY() && 
                super.getY() <= b.getY() + b.getHeight() || super.getY() + super.getHeight() >= b.getY() &&
                super.getY() + super.getHeight() < b.getY() + b.getHeight())){
            if (super.getX() <= b.getX() + b.getWidth() - Math.abs(xSpeed)){
                setYSpeed(ySpeed * -1);
            }
            else {
                setXSpeed(xSpeed * -1);
            }
        }
    }
    public void checkCollideRight(Block b) { 
	//complete this method - the word document might be helpful
        if (super.getX() + super.getWidth() >= b.getX() - Math.abs(xSpeed) && (super.getY() >= b.getY() && 
                super.getY() <= b.getY() + b.getHeight() || super.getY() + super.getHeight() >= b.getY() &&
                super.getY() + super.getHeight() < b.getY() + b.getHeight())){
            if (super.getX() + super.getWidth() >= b.getX() + Math.abs(xSpeed)){
                setYSpeed(ySpeed * -1);
            }
            else {
                setXSpeed(xSpeed * -1);
            }
        }
    }
    public void checkCollideTop(Block b){
        if (super.getY() < b.getY()){
            setYSpeed(ySpeed * -1);
        }
    }
    public void checkCollideBottom(Block b){
        if ((super.getY() + super.getHeight()) > b.getY() - Math.abs(xSpeed)){
            setYSpeed(ySpeed * -1);
        }
    }
    
    public boolean checkCollideLeftWall(Block b){
        if (super.getX() < b.getX()){
            return true;
        }
        return false;
    }
    
    public boolean checkCollideRightWall(Block b){
        if (super.getX() + super.getWidth() > b.getX()){
            return true;
        }
        return false;
    }

}
