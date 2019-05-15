/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author elliot
 */
public class Missile extends ExplodingElement implements Renderable, Updateable {

    private double speed;
    private Color trailColor;
    private double[] startPos;
    private double[] targetPos;
    private double[] vector;
    private boolean elementExploded;
    private boolean erased;
    private static final double TRAILING_LINE_SPEED = 3;

    /**
     *
     * @param x 
     * @param y
     * @param speed
     * @param trailColor
     */
    public Missile(double x, double y, double speed, Color trailColor) {
        super(x, y, 1, 1);
        setStartPos();
        setTarget(-1, -1);
        this.speed = speed;
        this.trailColor = trailColor;
        this.elementExploded = false;
        this.erased = false;
    }

    /**
     *
     */
    public Missile() {
    }

    /**
     *
     * @return
     */
    public boolean isExploded() {
        return elementExploded;
    }

    /**
     *
     * @return
     */
    public boolean isErased() {
        return erased;
    }

    /**
     *
     * @return
     */
    public double getTravelTime() {
        return speed;
    }

    /**
     *
     * @param speed
     */
    public void setTravelTime(double speed) {
        this.speed = speed;
    }

    /**
     *
     * @return
     */
    public Color getTrailColor() {
        return trailColor;
    }

    /**
     *
     * @param trailColor
     */
    public void setTrailColor(Color trailColor) {
        this.trailColor = trailColor;
    }

    /**
     *
     * @param xPos
     * @param yPos
     */
    public void setTarget(double xPos, double yPos) {
        targetPos = new double[2];
        targetPos[0] = xPos;
        targetPos[1] = yPos;
    }

    /**
     *
     */
    public void setStartPos() {
        startPos = new double[2];
        startPos[0] = getXpos();
        startPos[1] = getYpos();
    }

    /**
     *
     * @return
     */
    public double[] getStartPos() {
        return startPos;
    }

    /**
     *
     * @return
     */
    public double[] getTargetPos() {
        return targetPos;
    }

    /**
     *
     * @return
     */
    public boolean atTarget() {
        
        //if the difference between the pos and the target pos is within the amount the 
        //missile move each time it is at the target 
        if (!isExploded()) {
            return Math.abs(getXpos() - targetPos[0]) <= Math.abs(vector[0]) && Math.abs(getYpos() - targetPos[1]) <= Math.abs(vector[1]);
        } 
        return Math.abs(getXpos() - targetPos[0]) <= Math.abs(TRAILING_LINE_SPEED * vector[0]) && Math.abs(getYpos() - targetPos[1]) <= Math.abs(TRAILING_LINE_SPEED * vector[1]);
    }

    /**
     *
     */
    public void setVector() {
        //new array used as a vector
        vector = new double[2];
        double magnitude = Math.sqrt(Math.pow(targetPos[0] - startPos[0], 2) + Math.pow(targetPos[1] - startPos[1], 2));
        
        /* 
            technically this vector is just a fraaction of the total vector determined by the speed input
        */
        vector[0] = (targetPos[0] - startPos[0]) / (magnitude / speed);
        vector[1] = (targetPos[1] - startPos[1]) / (magnitude / speed);

    }

    /**
     *
     * @param canvas
     */
    @Override
    public void explodeElement(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        elementExploded = true;

        graphics.setFill(Color.BLACK);
        graphics.fillRect(super.getXpos(), super.getYpos(), 2, 2);

    }

    /**
     *
     * @param canvas
     */
    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        if (!isExploded()) {
            graphics.setFill(Color.WHITE);
            graphics.fillRect(super.getXpos(), super.getYpos(), super.getWidth(), super.getHeight());
        }
    }

    /**
     *
     * @param canvas
     */
    @Override
    public void update(Canvas canvas) {
        //essentially i run the missile through twice. once with color and the 
        //second black at a higher speed to create the trail effect
        
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        setVector();

        if (!isExploded()) {
            //draw a line with first (x, y) equal to the start pos and
            //the second (x, y) point egual to the missile's x and y
          
            graphics.setStroke(getTrailColor());
            graphics.setLineWidth(1);
            graphics.strokeLine(startPos[0], startPos[1], super.getXpos(), super.getYpos());

            //update the x and y based on the vector
            super.setXpos(super.getXpos() + vector[0]);
            super.setYpos(super.getYpos() + vector[1]);
        } else {
            //set the trailing line to black
            graphics.setStroke(Color.BLACK);
            graphics.setLineWidth(4);
           
            //set the vector equal to 0. 
            if (atTarget()) {
                vector[0] = 0;
                vector[1] = 0;
            }

            // then have the trail disappear. (cover it in a black line
            graphics.strokeLine(startPos[0], startPos[1], super.getXpos(), super.getYpos());
           
            super.setXpos(super.getXpos() + (TRAILING_LINE_SPEED * vector[0]));
            super.setYpos(super.getYpos() + (TRAILING_LINE_SPEED * vector[1]));

        }

        if (atTarget()) {
            // reset the x and y for the trailing line
            super.setXpos(startPos[0]);
            super.setYpos(startPos[1]);
            
            //explode the missile
            explodeElement(canvas);
        }
    }

}
