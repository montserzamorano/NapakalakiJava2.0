/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author montse
 */
public class Player {
    protected int MAXLEVEL=10;
    private String name;
    private int level;
    private boolean dead=true;
    
    public Player(String name){this.name=name;}
    public String getName(){return name;}
    private void bringToLife(){dead=false;}
    private int getCombatLevel(){return level;}
    private void incrementLevels(int l){}
    private void decrementLevels(int l){}
    private void setPendingBadConsequence(BadConsequence b){}
    private void applyPrize(Monster m){}
    private void applyBadConsequence(Monster m){}
    private int howManyVisibleTreasures(TreasureKind tKind){}
    private void dieIfNoTreasures(){}
    public boolean isDead(){}
    public Treasure[] getHiddenTreasures(){}
    public Treasure[] getVisibleTreasures(){}
    public CombatResult combat(Monster m){}
    public void discardVisibleTreasure(Treasure t){}
    public void discardHiddenTreasure(Treasure t){}
    public boolean validState(){}
    public void initTreasures(){}
    public int getLevels(){}
    public void discardAllTreasures(){}
}
