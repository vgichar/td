/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.actors;

import java.awt.Graphics2D;
import java.awt.Point;
import java.util.HashMap;
import td.game.definitions.actors.IActor;
import td.game.definitions.actors.ICommand;
import td.game.definitions.actors.IVisual;
import td.game.definitions.doables.ICommandable;
import td.game.definitions.doables.IDrawable;
import td.game.definitions.doables.IMovable;
import td.game.definitions.doables.IUpdateable;
import td.game.definitions.doables.IVisible;

/**
 *
 * @author vojda_000
 */
public class Creep implements IActor, IUpdateable, IDrawable, IVisible, ICommandable, IMovable{

    private int id;
    private Point position;
    private final HashMap<Integer, ICommand> commands;
    private IVisual towerVisual;
    private Point speed;
    
    public Creep(){
        position = new Point();
        commands = new HashMap<>();
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

    @Override
    public void move() {
        position.x += speed.x;
        position.y += speed.y;
    }

    @Override
    public void setSpeed(Point v) {
        speed = v;
    }

    @Override
    public Point getSpeed(Point v) {
        return speed;
    }
}