/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.injectors;

import java.util.LinkedList;
import td.game.actors.Tower;
import td.game.definitions.actors.ICommand;
import td.game.definitions.doables.IInjectable;
import td.game.factories.TowerFactory;

/**
 *
 * @author vojda_000
 */
public class TowerInjector implements IInjector<LinkedList<Tower>> {

    @Override
    public <TCommand extends ICommand & IInjectable<LinkedList<Tower>>> void injectInto(TCommand c) {
        LinkedList<Tower> towers = new LinkedList<>();
        towers.add(TowerFactory.createTower().build());
        towers.add(TowerFactory.createTower().build());
        towers.add(TowerFactory.createTower().build());
        
        c.inject(towers);
        c.run();
    }
}
