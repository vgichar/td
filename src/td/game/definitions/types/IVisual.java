/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.definitions.types;

import java.awt.Graphics2D;
import td.game.definitions.doables.IDrawable;

/**
 *
 * @author vojda_000
 */
public interface IVisual {
    void draw(Graphics2D g, IDrawable owner);
}
