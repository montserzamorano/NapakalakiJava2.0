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
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList <Monster> monstruos = new ArrayList();
        //monstruos = Cards.initializeMonsters();
        
        /*Monstruos que tienen nivel de combate superior a 10*/
        /*for (Monster monstruo : monstruos) {
            if(monstruo.getCombatLevel() > 10)
                System.out.println(monstruo.toString());
        }*/
        
        /*Monstruos que tienen un mal rollo que implique sólo pérdida de niveles*/
        /*for(Monster monstruo : monstruos) {
            BadConsequence bc = monstruo.getBC();
            if( bc.getLevels() > 0 
                && bc.getnHiddenTreasures() == 0
                && bc.getnVisibleTreasures() == 0
                && bc.getSpecificVisibleTreasures() == null
                && bc.getSpecificHiddenTreasures() == null)
            {
              System.out.println(monstruo.toString());  
            }
        }*/
        
        /*Su buen rollo implique una ganancia de niveles superior a 1*/
        /*for(Monster monstruo : monstruos) {
           Prize p = monstruo.getPrize();
           if(p.getLevel() >=1)
               System.out.println(monstruo.toString()); 
        }*/
        /*Su mal rollo suponga la pérdida de un determinado tipo de tesoros
         ya sea visibles y/o ocultos*/
        /*for(Monster monstruo : monstruos) {
            BadConsequence bc = monstruo.getBadConsequence();
            ArrayList <TreasureKind> vS = bc.getSpecificVisibleTreasures();
            ArrayList <TreasureKind> hS = bc.getSpecificHiddenTreasures();
            
            if(vS != null && vS.size() != 0){
                for(TreasureKind t : vS){
                    if(t == TreasureKind.ARMOR)
                        System.out.println(monstruo.toString());
                }
            }
            if(hS != null && hS.size() != 0){
                for(TreasureKind t : hS){
                    if(t == TreasureKind.ARMOR)
                        System.out.println(monstruo.toString());
                    }
                }
            }*/
        Dice dado = Dice.getInstance();
        for(int i=0; i<10; i++){
            int numero = dado.nextNumber();
            System.out.println(numero);
        }
    }
    
}
