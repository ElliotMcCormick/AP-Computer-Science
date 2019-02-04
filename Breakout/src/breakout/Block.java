/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

/**
 *
 * @author mccormick.elliot19
 */
public class Block extends GameElement implements Renderable {
    
    public Block(){
        super();
    }
    
    public Block(double x, double y, double width, double height){
        super(x, y, width, height);
    }
    
    private void destroy(){
        setWidth(0.0);
        setHeight(0.0);
    }
    
    @Override
    public void onCollision(GameElement element){
        if (!checkCollision(element).equals(null)){
            
        }
        
    }
}
