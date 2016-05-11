/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

/**
 *
 * @author Montserrat Rodriguez
 */
public class GoodMonster extends Monster{
    private Player friend;
    public GoodMonster(String name, int level, BadConsequence bc, Prize prize, int lC, Player p){
        super(name,level,bc,prize,lC);
        friend = p;
    }
    @Override
    public int getCombatLevel(Player aPlayer){
        if(aPlayer == friend){
            return 0;
        }
        else{
            return super.getCombatLevel();
        }
    }
    @Override
    public int getCombatLevelAgainstCultistPlayer(Player aPlayer){
        if(aPlayer == friend){
            return 0;
        }
        else{
            return super.getCombatLevelAgainstCultistPlayer();
        }
    }
}
