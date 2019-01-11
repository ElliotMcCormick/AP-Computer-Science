package lab20a_pong_project;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;




public class Block implements Renderable {

    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;

    //add a default and initialization Block constructor - x , y , width, height, color

    public Block(){
        this(0, 0, 1, 1, Color.BLACK);
    }
    
    public Block(int x, int y, int wd, int ht, Color c){
        xPos = x;
        yPos = y;
        width = wd;
        height = ht;
        color = c;
    }
    
    //add the get and set methods
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
    
    public void setX(int x){
       xPos = x;
    }
    public void setY(int y){
        yPos = y;
    }
    public void setWidth(int wd){
        width = wd;
    }
    public void setHeight(int ht){
        height = ht;
    }
    public void setColor(Color c){
        color = c;
    }
    
    @Override
    public void draw(Canvas canvas, Color col) {
        //uncomment after you write the set and get methods
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(col);
        graphics.fillRect(getX(), getY(), getWidth(), getHeight()); 
    }

    public boolean equals(Object obj) {
		//complete this method
        Block comp = (Block)obj;
        return (xPos == comp.xPos && yPos == comp.yPos && width == comp.width && height == comp.height && color.equals(comp.color));
    }

    //add a toString() method  - x , y , width, height, color
    public String toString(){
        return xPos + " , " + yPos + " , " + width + " , " + height + " , " + color;
    }

}