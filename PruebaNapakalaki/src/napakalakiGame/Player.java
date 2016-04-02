/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author montse
 */
public class Player {
    static int MAXLEVEL=10;
    private String name;
    private int level;
    private boolean dead=true;
    private BadConsequence pendingBadConsequence= new BadConsequence("vacio",0,0,0);;
    private ArrayList <Treasure> hiddenTreasures = new ArrayList();
    private ArrayList <Treasure> visibleTreasures = new ArrayList();
    
    public Player(String name){
        this.name=name;
    }
    public String getName(){return name;}
    
    private void bringToLife(){
        dead=false;
        level = 1;
        hiddenTreasures.clear();
        visibleTreasures.clear();
    }
    private int getCombatLevel(){
        int combatLevel=level;
        
        for(Treasure v: visibleTreasures){
            combatLevel+=v.getBonus();
        }
        
        return combatLevel;
    }
    private void incrementLevels(int l){
        level += l;
    }
    private void decrementLevels(int l){
        level -= l;
        if(level < 1){
            level = 1;
        }
    }
    private void setPendingBadConsequence(BadConsequence b){
       pendingBadConsequence = new BadConsequence(b);
    }
    //private void applyPrize(Monster m){}
    //private void applyBadConsequence(Monster m){}
    private int howManyVisibleTreasures(TreasureKind tKind){
        int contador=0;      
        for(Treasure v :visibleTreasures){
            if(v.getType() == tKind){
                contador+=1;
            }
        }  
        return contador;
    }
    private void dieIfNoTreasures(){
        if(hiddenTreasures.isEmpty() && visibleTreasures.isEmpty()){
            dead = true;
        }
    }
    public boolean isDead(){
        return dead;
    }
    //public Treasure[] getHiddenTreasures(){}
    //public Treasure[] getVisibleTreasures(){}
    //public CombatResult combat(Monster m){}
    //public void discardVisibleTreasure(Treasure t){}
    //public void discardHiddenTreasure(Treasure t){}
    public boolean validState(){
        if(pendingBadConsequence.isEmpty() && hiddenTreasures.size() <= 4)
            return true;
        else
            return false;
    }
    //public void initTreasures(){}
    public int getLevels(){
        return level;
    }
    //public void discardAllTreasures(){}
}
