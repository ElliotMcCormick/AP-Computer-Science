/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

import javafx.scene.canvas.Canvas;

/**
 * interface for things that need to be drawn
 * 
 * @author elliot
 */
public interface Renderable {

    /**
     * all Renderables need to be able to be drawn
     * 
     * @param canvas
     */
    public abstract void draw(Canvas canvas);
}
