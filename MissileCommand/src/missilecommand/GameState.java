/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

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
    private List<Missile> missiles;
    
    public GameState(){
        renderables = new ArrayList();
        updateables = new ArrayList();
        collideables = new ArrayList();
        missiles = new ArrayList();
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
        if (object instanceof Missile){
            missiles.add((Missile)object);
        }
        
    }
    
    public void add(int index, Object object){
        
        if (object instanceof Renderable){
            renderables.add(index, (Renderable)object);
        }
        if (object instanceof Updateable){
            updateables.add(index, (Updateable)object);
        }
        if (object instanceof GameElement){
            collideables.add(index, (GameElement)object);
        }
         if (object instanceof Missile){
            missiles.add(index, (Missile)object);
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
         if (object instanceof Missile){
            missiles.remove((Missile)object);
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
    
    //IDK IF NECESSARY YET
    public void collideAll(){
        
    }
}
