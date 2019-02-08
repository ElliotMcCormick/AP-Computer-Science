/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.Canvas;

/**
 *
 * @author mccormick.elliot19
 */
public class GameState {
    private List<Renderable> renderables;
    private List<Updateable> updateables;
    private List<GameElement> collideables;
    
    public GameState(){
        renderables = new ArrayList();
        updateables = new ArrayList();
        collideables = new ArrayList();
    }
    
    public void add(Object object){
        
        if (object instanceof Renderable){
            renderables.add((Renderable)object);
        }
        if (object instanceof Updateable){
            updateables.add((Updateable)object);
        }
        if (object instanceof GameElement){
            collideables.add((GameElement)object);
        }
        
    }
    
    public void remove(Object object){
        if (object instanceof Renderable){
            renderables.remove((Renderable)object);
        }
        if (object instanceof Updateable){
            updateables.remove((Updateable)object);
        }
        if (object instanceof GameElement){
            collideables.remove((GameElement)object);
        }
    }
   
    public void updateAll(Canvas canvas){
        for (Updateable u : updateables){
            u.update(canvas);
        }
    }
    
    public void drawAll(Canvas canvas){
        for (Renderable r : renderables){
            r.draw(canvas);
        }
    }
    
    public void collideAll(){
        for (int element = 0; element < collideables.size() - 1; element++){
            if ((collideables.get(element).checkCollision(collideables.get(element + 1))) != null){
                if(collideables.get(element) instanceof Ball){
                    System.out.println("Ball Collide?");

                    ((Ball)collideables.get(element)).onCollision(collideables.get(element + 1));
                }
                if(collideables.get(element) instanceof Block){
                    System.out.println("Block Collide?");

                    ((Block)collideables.get(element)).onCollision(collideables.get(element + 1));
                }
            }
            
        }
    }
}
