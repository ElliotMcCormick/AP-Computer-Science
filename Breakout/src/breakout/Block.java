/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author mccormick.elliot19
 */
public class Block extends GameElement implements Renderable {
    
    public Block(){
        super();
    }
    
    public Block(double x, double y, double width, double height, Color color){
        super(x, y, width, height, color);
    }
    
    private void destroy(){
        // Breakout GameState state is removed
        Breakout.state.remove(this);
    }
    
    @Override
    public void onCollision(GameElement element){
        if (!checkCollision(element).equals(null)){
            destroy();
        }       
    }
    
    public void draw(Canvas canvas){
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(getColor());
        graphics.fillRect(getXPos(), getYPos(), getWidth(), getHeight());
    }
}
 