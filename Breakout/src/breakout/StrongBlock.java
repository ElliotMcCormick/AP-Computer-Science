/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javafx.scene.paint.Color;

/**
 *
 * @author elliot
 */
public class StrongBlock extends Block{
    private int count = 2;
    
    public StrongBlock(){
        super();
    }
    
    public StrongBlock(double x, double y, double width, double height, Color color){
        super(x, y, width, height, color);
    }
    
    private void destroy(){
        // Breakout GameState state is removed
        
        
        if(count > 0){
            count--;
            if (count == 1){
                setColor(Color.RED);
            }
            if (count == 0){
                setColor(Color.GRAY);
            }
        }
        else {
            Breakout.state.remove(this);
        }
    }
    
    @Override
    public void onCollision(GameElement element){
        if (checkCollision(element) != (null)){
            destroy();
        }
    }
}
