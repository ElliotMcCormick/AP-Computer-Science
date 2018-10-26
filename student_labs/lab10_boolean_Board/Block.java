package lab10_boolean_Board;

// A+ Computer Science  -  www.apluscompsci.com

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//Name -
//Date -
//Lab  - Block

public class Block implements Locatable {
    //instance variables

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    //constructors
    public Block(){
        this(0, 0, 0, 0, Color.BLACK);
    }
    public Block(int x, int y, int w, int h){
        setEverything(x, y, w, h, Color.BLACK);
    }
    public Block(int x, int y, int w, int h, Color c){
        setEverything(x, y, w, h, c);
    }
    
    //set methods
    public void setEverything(int x, int y, int w, int h, Color c){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = c;
    }
    public void setPos(int x, int y){
        setX(x);
        setY(y);
    }
    public void setX(int x){
        xPos = x;
    }
    public void setY(int y){
        yPos = y;
    }
    public void setWidth(int w){
        width = w;
    }
    public void setHeight(int h){
        height = h;
    }
    public void setColor(Color c){
        color = c;
    }
    
    //get methods
    public int getX(){
        return xPos;
    }
    public int getY(){
        return yPos;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public Color getColor(){
        return color;
    }

    public void draw(Canvas canvas) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(color);
        graphics.fillRect(getX(), getY(), getWidth(), getHeight());
    }
    
    //toString
    public String toString(){
        String output = "";
        output += getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
        return output;
    }
}