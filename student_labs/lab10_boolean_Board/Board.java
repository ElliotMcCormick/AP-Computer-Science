package lab10_boolean_Board;

// A+ Computer Science  -  www.apluscompsci.com
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

//Name -
//Date -
//Lab  - Board 
public class Board {
    //instance variables

    private int width;
    private int height;
    private Block topLeft;
    private Block topRight;
    private Block botLeft;
    private Block botRight;

    private Canvas canvas;

    public Board() //constructor
    {
        width = 200;
        height = 200;
        canvas = new Canvas(width, height);
        topLeft = new Block(0, 0, width / 2 - 10, height / 2 - 10, Color.RED);
        topRight = new Block(width / 2, 0, width / 2 - 10, height / 2 - 10, Color.GREEN);
        botLeft = new Block(0, height / 2, width / 2 - 10, height / 2 - 10, Color.BLUE);
        botRight = new Block(width / 2, height / 2, width / 2 - 10, height / 2 - 10, Color.YELLOW);

    }
    //initialization constructor
    public Board(int w, int h){
        width = w;
        height = h;
        canvas = new Canvas(width, height);
        topLeft = new Block(0, 0, width / 2 - 10, height / 2 - 10, Color.RED);
        topRight = new Block(width / 2, 0, width / 2 - 10, height / 2 - 10, Color.GREEN);
        botLeft = new Block(0, height / 2, width / 2 - 10, height / 2 - 10, Color.BLUE);
        botRight = new Block(width / 2, height / 2, width / 2 - 10, height / 2 - 10, Color.YELLOW);
    }
    

    public void drawBlocks() {
        topLeft.draw(canvas);
        topRight.draw(canvas);
        botLeft.draw(canvas);
        botRight.draw(canvas);
    }

    public void swapTopRowColors() {
        Color temp = topLeft.getColor();
        topLeft.setColor(topRight.getColor());
        topRight.setColor(temp);
    }

    public void swapBottomRowColors() {
        Color temp = botLeft.getColor();
        botLeft.setColor(botRight.getColor());
        botRight.setColor(temp);
    }

    public void swapLeftColumnColors() {
        Color temp = topLeft.getColor();
        topLeft.setColor(botLeft.getColor());
        botLeft.setColor(temp);
    }

    public void swapRightColumnColors() {
        Color temp = topRight.getColor();
        topRight.setColor(botRight.getColor());
        botRight.setColor(temp);
    }

    public void mouseClicked(MouseEvent e) {
        double mouseX = e.getX();
        double mouseY = e.getY();
        if (e.getButton().equals(MouseButton.PRIMARY)) //left mouse button pressed
        {
            
           //mouse is in top left box
           if (mouseX > topLeft.getX() && mouseY > topLeft.getY() && mouseX < topLeft.getX() + topLeft.getWidth() && mouseY < topLeft.getY() + topLeft.getHeight()){
               swapTopRowColors();
               drawBlocks();
           }
           //mouse is in top right
           if (mouseX > topRight.getX() && mouseY > topRight.getY() && mouseX < topRight.getX() + topRight.getWidth() && mouseY < topRight.getY() + topRight.getHeight()){
               swapTopRowColors();
               drawBlocks();
           }
           
           //mouse is in bottom left box
           if (mouseX > botLeft.getX() && mouseY > botLeft.getY() && mouseX < botLeft.getX() + botLeft.getWidth() && mouseY < botLeft.getY() + botLeft.getHeight()){
               swapBottomRowColors();
               drawBlocks();
           }
           //mouse is in bottom right
           if (mouseX > botRight.getX() && mouseY > botRight.getY() && mouseX < botRight.getX() + botRight.getWidth() && mouseY < botRight.getY() + botRight.getHeight()){
               swapBottomRowColors();
               drawBlocks();
           }
        } 
        
	if (e.getButton().equals(MouseButton.SECONDARY)) { //right mouse button pressed
            
            //mouse is in top left box
           if (mouseX > topLeft.getX() && mouseY > topLeft.getY() && mouseX < topLeft.getX() + topLeft.getWidth() && mouseY < topLeft.getY() + topLeft.getHeight()){
               swapLeftColumnColors();
               drawBlocks();
           }
           //mouse is in top right
           if (mouseX > topRight.getX() && mouseY > topRight.getY() && mouseX < topRight.getX() + topRight.getWidth() && mouseY < topRight.getY() + topRight.getHeight()){
               swapRightColumnColors();
               drawBlocks();
           }
           
           //mouse is in bottom left box
           if (mouseX > botLeft.getX() && mouseY > botLeft.getY() && mouseX < botLeft.getX() + botLeft.getWidth() && mouseY < botLeft.getY() + botLeft.getHeight()){
               swapLeftColumnColors();
               drawBlocks();
           }
           //mouse is in bottom right
           if (mouseX > botRight.getX() && mouseY > botRight.getY() && mouseX < botRight.getX() + botRight.getWidth() && mouseY < botRight.getY() + botRight.getHeight()){
               swapRightColumnColors();
               drawBlocks();
           }
        }            
    }

    public String toString() {
        return " ";
    }

    public Canvas getCanvas() {
        return canvas;
    }
    
}
