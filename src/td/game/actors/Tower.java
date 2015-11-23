/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.actors;

import td.game.definitions.doables.IUpdateable;
import td.game.definitions.doables.IVisible;
import td.game.definitions.doables.ICommandable;
import td.game.definitions.doables.IDrawable;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.HashMap;
import td.game.definitions.types.IActor;
import td.game.definitions.types.ICommand;
import td.game.definitions.types.IVisual;

/**
 *
 * @author vojda_000
 */
public class Tower implements IActor, IUpdateable, IDrawable, IVisible, ICommandable{

    private int id;
    private Point position;
    private final HashMap<Integer, ICommand> commands;
    private IVisual towerVisual;
    
    public Tower(){
        position = new Point();
        commands = new HashMap<Integer, ICommand>();
        towerVisual = null;
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void update(Graphics2D g){
        
    }

    @Override
    public void draw(Graphics2D g) {
        towerVisual.draw(g, this);
    }

    @Override
    public void setVisual(IVisual v) {
        towerVisual = v;
    }

    @Override
    public void setPosition(Point p) {
        position = p;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void addCommand(ICommand command) {
        commands.put(id, command);
    }

    @Override
    public void removeCommand(int id) {
        commands.remove(id);
    }

    @Override
    public ICommand getCommand(int id) {
        return commands.get(id);
    }
}
