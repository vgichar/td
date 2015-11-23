/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.injectors;

import java.awt.Point;
import java.util.LinkedList;
import td.game.World;
import td.game.actors.Creep;
import td.game.definitions.types.ICommand;
import td.game.definitions.doables.IInjectable;

/**
 *
 * @author vojda_000
 */
public class SpatialCreepInjector {

    public <TCommand extends ICommand & IInjectable<LinkedList<Creep>>> void injectInto(TCommand c, Point position, double radius) {
        LinkedList<Creep> creeps = new LinkedList<>();
        for(Creep creep : World.creeps.values()){
            if(distance(creep.getPosition(), position) < radius){
                creeps.add(creep);
            }
        }
        c.inject(creeps);
    }
    
    private double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2)+Math.pow(p1.y - p2.y, 2));
    }
}
