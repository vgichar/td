/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.factories;

import java.awt.Point;
import td.game.actors.Creep;
import td.game.actors.Tower;
import td.game.definitions.actors.ICommand;
import td.game.definitions.actors.IVisual;

/**
 *
 * @author vojda_000
 */
public class CreepFactory {
    private static int CREEP_ID = 0;
    
    public static CreepBuilder createCreep(){
        return new CreepBuilder(CREEP_ID++);
    }
            
    public static class CreepBuilder{
        private Creep instance;
        
        protected CreepBuilder(int creepId){
            instance = new Creep();
            instance.setId(creepId);
        }
        
        public Creep build(){
            return instance;
        }
        
        public CreepBuilder withPosition(Point p){
            instance.setPosition(p);
            return this;
        }
        
        public CreepBuilder withCommand(ICommand c){
            instance.addCommand(c);
            return this;
        }
        
        public CreepBuilder withVisual(IVisual v){
            instance.setVisual(v);
            return this;
        }
        
        public CreepBuilder withSpeed(Point p){
            instance.setSpeed(p);
            return this;
        }
    }
}