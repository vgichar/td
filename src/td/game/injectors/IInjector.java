/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.injectors;

import td.game.definitions.actors.ICommand;
import td.game.definitions.doables.IInjectable;

/**
 *
 * @author vojda_000
 */
public interface IInjector<T> {

    <TCommand extends ICommand & IInjectable<T>> void injectInto (TCommand c);
}
