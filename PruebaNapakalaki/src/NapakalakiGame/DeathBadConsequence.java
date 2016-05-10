/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author montse
 */
public class DeathBadConsequence extends NumericBadConsequence{
     public DeathBadConsequence(String text){
        super(text, Player.MAXLEVEL, MAXTREASURES, MAXTREASURES);
    }
     
    @Override
    public boolean isEmpty(){
        return true;
    }
    
    @Override
    public void substractVisibleTreasure (Treasure t){}
    
    @Override
    public void substractHiddenTreasure (Treasure t){}
    
    
    @Override
    public BadConsequence adjustToFitTreasureLists(ArrayList <Treasure> visible, ArrayList <Treasure> hidden){
        return super.adjustToFitTreasureLists(visible,hidden);
    }
    
    @Override
    public String toString(){        
        String texto = " Mueres.";
        return super.toString() + texto;
    }
    
}
