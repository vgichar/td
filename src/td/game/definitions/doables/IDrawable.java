/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.definitions.doables;

import java.awt.Graphics2D;
import td.game.definitions.types.IVisual;

/**
 *
 * @author vojda_000
 */
public interface IDrawable {
    void draw(Graphics2D g);
    void setVisual(IVisual v);
}
