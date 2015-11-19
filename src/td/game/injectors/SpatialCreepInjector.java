/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.injectors;

import java.util.LinkedList;
import td.game.actors.Creep;
import td.game.definitions.actors.ICommand;
import td.game.definitions.doables.IInjectable;

/**
 *
 * @author vojda_000
 */
public class SpatialCreepInjector implements IInjector<LinkedList<Creep>> {

    @Override
    public <TCommand extends ICommand & IInjectable<LinkedList<Creep>>> void injectInto(TCommand c) {
        LinkedList<Creep> creeps = new LinkedList<>();
        
        c.inject(creeps);
        c.run();
    }
}
