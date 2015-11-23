/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.game.factories;

import java.awt.Point;
import td.game.actors.Tower;
import td.game.definitions.types.ICommand;
import td.game.definitions.types.IVisual;

/**
 *
 * @author vojda_000
 */
public class TowerFactory {
    private static int TOWER_ID = 0;
    
    public static TowerBuilder createTower(){
        return new TowerBuilder(TOWER_ID++);
    }
            
    public static class TowerBuilder{
        private Tower instance;
        
        protected TowerBuilder(int towerId){
            instance = new Tower();
            instance.setId(towerId);
        }
        
        public Tower build(){
            return instance;
        }
        
        public TowerBuilder withPosition(Point p){
            instance.setPosition(p);
            return this;
        }
        
        public TowerBuilder withCommand(ICommand c){
            instance.addCommand(c);
            return this;
        }
        
        public TowerBuilder withVisual(IVisual v){
            instance.setVisual(v);
            return this;
        }
    }
}
