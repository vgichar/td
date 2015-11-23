/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.injectors;

import java.util.LinkedList;
import td.game.World;
import td.game.actors.Tower;
import td.game.definitions.types.ICommand;
import td.game.definitions.doables.IInjectable;

/**
 *
 * @author vojda_000
 */
public class TowerInjector {

    public <TCommand extends ICommand & IInjectable<LinkedList<Tower>>> void injectInto(TCommand c) {
        c.inject(new LinkedList<>(World.towers.values()));
    }
}
