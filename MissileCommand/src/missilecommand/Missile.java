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

    private double x;
    private double y;
    private double speed;
    private Color trailColor;
    private double[] startPos;
    private double[] targetPos;

    public Missile(double x, double y, double speed, Color trailColor) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.trailColor = trailColor;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
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

    public void setStartPos(double xPos, double yPos) {
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
    
    public double[] getVector(){
        double[] vector = new double[2];
        vector[0] = speed * (targetPos[0] - startPos[0]);
        vector[1] = speed * (targetPos[1] - startPos[1]);
        return vector;
    }

    @Override
    public void explodeElement(GameElement element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(Color.WHITE);
        graphics.fillRect(getX(), getY(), 10, 10);

    }

    @Override
    public void update(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(getTrailColor());
        
        graphics.fillRect(getX(), getY(), 2, 2);

        setX(getX() + getVector()[0]);
        setY(getY() + getVector()[1]);
    }

}
