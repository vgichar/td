/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.definitions.doables;

import java.awt.Point;

/**
 *
 * @author vojda_000
 */
public interface IMovable {
    void move();
    void setSpeed(Point v);
    Point getSpeed(Point v);
}
