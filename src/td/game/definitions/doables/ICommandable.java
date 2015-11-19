/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.definitions.doables;

import td.game.definitions.actors.ICommand;
/**
 *
 * @author vojda_000
 */
public interface ICommandable {
    void addCommand(ICommand command);
    void removeCommand(int id);
    ICommand getCommand(int id);
}
