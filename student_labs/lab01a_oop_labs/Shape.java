package lab01a_oop_labs;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Class -
//Lab  -

public class Shape {
    //instance variables

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    public Shape(int x, int y, int wid, int ht, Color col) {
        xPos = x;
        yPos = y;
        width = wid;
        height = ht;
        color = col;
        //finish this constructor
    }

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        
        graphics.setFill(Color.BLACK);
        graphics.fillRect(xPos, yPos, width, height);
        graphics.setFill(color);
        graphics.fillOval(xPos, yPos, width, height);
        drawTriangle(graphics, xPos + (width/2), yPos - (height/2) - 2, width/2, height/2);
        drawUpsideDownTriangle(graphics, xPos + (width/2), yPos + (height * 1.5) + 2, width/2, height/2);
        drawRightPointingTriangle(graphics, xPos + (width*1.5) + 2, yPos + (height/2), width/2, height/2);
        drawLeftPointingTriangle(graphics, xPos - (width/2) - 2, yPos + (height/2), width/2, height/2);

    }
    
    public void drawTriangle(GraphicsContext graphics, double topX, double topY, double width, double height){
        double[] xPoints = {topX, topX + width, topX - width};
        double[] yPoints = {topY, topY + height, topY + height};
        
        graphics.fillPolygon(xPoints, yPoints, 3);
        //graphics.fillPolygon(xpoints, ypoints, numPoints);
    }
    public void drawUpsideDownTriangle(GraphicsContext graphics, double bottomX, double bottomY, double width, double height){
        double[] xPoints = {bottomX, bottomX + width, bottomX - width};
        double[] yPoints = {bottomY, bottomY - height, bottomY - height};
        
        graphics.fillPolygon(xPoints, yPoints, 3);
        //graphics.fillPolygon(xpoints, ypoints, numPoints);
    }
    public void drawRightPointingTriangle(GraphicsContext graphics, double pointX, double pointY, double width, double height){
        double[] xPoints = {pointX, pointX - width, pointX - width};
        double[] yPoints = {pointY, pointY - height, pointY + height};
        
        graphics.fillPolygon(xPoints, yPoints, 3);
        //graphics.fillPolygon(xpoints, ypoints, numPoints);
    }
    public void drawLeftPointingTriangle(GraphicsContext graphics, double pointX, double pointY, double width, double height){
        double[] xPoints = {pointX, pointX + width, pointX + width};
        double[] yPoints = {pointY, pointY - height, pointY + height};
        
        graphics.fillPolygon(xPoints, yPoints, 3);
        //graphics.fillPolygon(xpoints, ypoints, numPoints);
    }
    

    //BONUS
    //add in set and get methods for all instance variables
    public void setXPos(int x){
        xPos = x;
    }
    public int getXPos(){
        return xPos;
    }
    
    
    public void setYPos(int y){
        yPos = y;
    }
    public int getYPos(){
        return yPos;
    }
    
    
    public void setWidth(int w){
        width = w;
    }
    public int getWidth(){
        return width;
    }
    
    
    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }
    
    
     public void setColor(Color c){
        color = c;
    }
    public Color getColor(){
        return color;
    }
    
    
    public String toString() {
        return xPos + " " + yPos + " " + width + " " + height + " " + color;
    }
}