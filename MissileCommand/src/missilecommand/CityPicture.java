/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

import javafx.scene.canvas.Canvas;

/**
 *
 * @author mccormick.elliot19
 */
public class CityPicture extends ExplodingElement implements Renderable{

    public CityPicture() {
    }

    public CityPicture(double x, double y, double wid, double ht) {
        super(x, y, wid, ht);
    }

    @Override
    public void explodeElement(Canvas canvas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Canvas canvas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
