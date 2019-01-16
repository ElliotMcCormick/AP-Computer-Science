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
public class InvisibleBall extends Ball{
    public InvisibleBall() {
        super();
    }

    public InvisibleBall(int x, int y){
        this(x, y, 2, 2, Color.BLACK, 3, 1);
    }
    public InvisibleBall(int x, int y, int wid, int ht, Color c){
        this(x, y, wid, ht, c, 3, 1);
    }

    public InvisibleBall(int x, int y, int wid, int ht, Color c, int xSpd, int ySpd){
        super(x, y, wid, ht, c, xSpd, ySpd);
    }
    
    @Override
    public void update(Canvas canvas) {
        //draw a white ball at old ball location
        draw(canvas, Color.WHITE);
		//update the ball location
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
        
        if ((int)(Math.random() * 2) == 1){
            setColor(Color.WHITE);
        }
    }
    
}
