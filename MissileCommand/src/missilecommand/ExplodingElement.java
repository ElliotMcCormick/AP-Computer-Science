/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missilecommand;

/**
 *
 * @author McCormick.Elliot19
 */
public abstract class ExplodingElement extends GameElement{
    private final double EXPLOSION_RADIUS = 0.0;
    
    public double getExplosionRadius(){
        return EXPLOSION_RADIUS;
    }
    
    public abstract void dealWithExplosion(GameElement element);
}
