/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javafx.scene.paint.Color;

/**
 *
 * @author mccormick.elliot19
 */
public class Wall extends GameElement{

    public Wall(){
        super();
    }
    
    public Wall(double x, double y, double wid, double ht, Color c){
        super(x, y, wid, ht, c);
    }
    
    @Override
    public void onCollision(GameElement element) {
    }   
}
