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

    public Missile(double x, double y, double speed, Color trailColor) {
        super(x, y, 2, 2);
        setStartPos();
        setTarget(x,y);
        this.speed = speed;
        this.trailColor = trailColor;
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
    
    public double[] getVector(){
        double[] vector = new double[2];
        double magnitude = Math.sqrt(Math.pow(targetPos[0] - startPos[0], 2) + Math.pow(targetPos[1] - startPos[1], 2));
        vector[0] = (targetPos[0] - startPos[0]) / (magnitude / speed);
        vector[1] = (targetPos[1] - startPos[1]) / (magnitude / speed);
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
        graphics.fillRect(super.getXpos(), super.getYpos(), super.getWidth(), super.getHeight());

    }

    @Override
    public void update(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();

        graphics.setFill(getTrailColor());
        
        graphics.fillRect(super.getXpos(), super.getYpos(), 2, 2);

        super.setXpos(super.getXpos() + getVector()[0]);
        super.setYpos(super.getYpos() + getVector()[1]);
        System.out.println("new x:" + super.getXpos());
        System.out.println("new y:" + super.getYpos());
    }

}
