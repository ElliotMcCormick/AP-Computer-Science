/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab20a_pong_project;

import javafx.scene.paint.Color;

/**
 *
 * @author elliot
 */
public class Wall extends Block {
    
    public Wall(){
    }
    
    public Wall(int x, int y, int wid, int ht){
        super(x, y, wid, ht, Color.WHITE);
    }
}
