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

    public Missile(double x, double y, double speed, Color trailColor) {
        super(x, y, 1, 1);
        setStartPos();
        setTarget(x, y);
        this.speed = speed;
        this.trailColor = trailColor;
    }

    public boolean isElementExploded() {
        return elementExploded;
    }

    public double getTravelTime() {
        return speed;
    }

    public void setTravelTime(double speed) {
        this.speed = speed;
    }

    public Color getTrailColor() {
        return trailColor;
    }

    public void setTrailColor(Color trailColor) {
        this.trailColor = trailColor;
    }

    public void setTarget(double xPos, double yPos) {
        targetPos = new double[2];
        targetPos[0] = xPos;
        targetPos[1] = yPos;
    }

    public void setStartPos() {
        startPos = new double[2];
        startPos[0] = xPos;
        startPos[1] = yPos;
    }

    public double[] getStartPos() {
        return startPos;
    }

    public double[] getTargetPos() {
        return targetPos;
    }

    public boolean atTarget() {
        //if the difference between the pos and the target pos is within the amount the 
        //missile move each time it is at the target 
        

        return Math.abs(getXpos() - targetPos[0]) <= Math.abs(vector[0]) && Math.abs(getYpos() - targetPos[1]) <= Math.abs(vector[1]);
    }

    public void setVector() {
        vector = new double[2];
        double magnitude = Math.sqrt(Math.pow(targetPos[0] - startPos[0], 2) + Math.pow(targetPos[1] - startPos[1], 2));
        vector[0] = (targetPos[0] - startPos[0]) / (magnitude / speed);
        vector[1] = (targetPos[1] - startPos[1]) / (magnitude / speed);

    }

    @Override
    public void explodeElement(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        elementExploded = true;

        graphics.setFill(Color.BLACK);
        graphics.fillRect(super.getXpos(), super.getYpos(), 2, 2);

    }

    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        if (!isElementExploded()) {
            graphics.setFill(Color.WHITE);
            graphics.fillRect(super.getXpos(), super.getYpos(), super.getWidth(), super.getHeight());
        }
    }

    @Override
    public void update(Canvas canvas) {
        double distanceBehind = targetPos[0] - startPos[0];
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        setVector();

        if (!isElementExploded()) {
            graphics.setStroke(getTrailColor());
            graphics.setLineWidth(1);
            graphics.strokeLine(startPos[0], startPos[1], super.getXpos(), super.getYpos());

            super.setXpos(super.getXpos() + vector[0]);
            super.setYpos(super.getYpos() + vector[1]);
        } else {
            graphics.setStroke(Color.BLACK);
            graphics.setLineWidth(4);
            graphics.strokeLine(startPos[0], startPos[1], super.getXpos() - (distanceBehind * vector[0]/Math.abs(vector[0])), super.getYpos() - (distanceBehind * vector[1]/Math.abs(vector[1])));
            super.setXpos(super.getXpos() + (300 * vector[0]));
            super.setYpos(super.getYpos() + (300 * vector[1]));
        }

        if (atTarget()) {
            explodeElement(canvas);
        }
    }

}
