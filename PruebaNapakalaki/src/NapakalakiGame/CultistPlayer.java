/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

/**
 *
 * @author Montserrat Rodriguez Zamorano
 */
public class CultistPlayer extends Player{
    private static int totalCultistPlayer = 0;
    private Cultist myCultistCard;
    public CultistPlayer(Player p, Cultist c){
        super(p);
        myCultistCard = c;
        totalCultistPlayer +=1;
    }
    
    public static int getTotalCultistPlayer(){
        return totalCultistPlayer;
    }
    
    @Override
    protected int getOponentLevel(Monster m){
        return m.getCombatLevelAgainstCultistPlayer();
    }
    
    @Override
    protected boolean shouldConvert(){
        return false;
    }
    
    @Override
    protected int getCombatLevel(){
        return (int)(1.5*super.getCombatLevel()+myCultistCard.getGainedLevels());
    }
}
