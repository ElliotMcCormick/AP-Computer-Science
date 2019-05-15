/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

import javafx.scene.canvas.Canvas;

/**
 * interface for things that need to move
 * 
 * @author elliot
 */
public interface Updateable {

    /**
     * all ubdateables need to be able to be updated
     * 
     * @param canvas
     */
    public abstract void update(Canvas canvas);
}
