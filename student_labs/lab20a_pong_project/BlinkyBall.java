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
 * @author elliot
 */
public class BlinkyBall extends Ball{
    
    public BlinkyBall() {
        super();
    }

    public BlinkyBall(int x, int y){
        this(x, y, 2, 2, Color.BLACK, 3, 1);
    }
    public BlinkyBall(int x, int y, int wid, int ht, Color c){
        this(x, y, wid, ht, c, 3, 1);
    }

    public BlinkyBall(int x, int y, int wid, int ht, Color c, int xSpd, int ySpd){
        setX(x);
        setY(y);
        setWidth(wid);
        setHeight(ht);
        setColor(c);
        setXSpeed(xSpd);
        setXSpeed(ySpd);
    }
    
    @Override
    public void update(Canvas canvas) {
        //draw a white ball at old ball location
        draw(canvas, Color.WHITE);
		//update the ball location
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        
        setColor(Color.rgb((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
    }
}
