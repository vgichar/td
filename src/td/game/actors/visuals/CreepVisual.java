/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.actors.visuals;

import java.awt.Graphics2D;
import td.game.actors.Creep;
import td.game.definitions.actors.IVisual;
import td.game.definitions.doables.IDrawable;

/**
 *
 * @author vojda_000
 */
public class CreepVisual implements IVisual{

    @Override
    public void draw(Graphics2D g, IDrawable owner) {
        Creep creep = (Creep)owner;
    }
}
