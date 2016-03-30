/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author montse
 */
public class CardDealer {
    private static final CardDealer instance = new CardDealer();
    private ArrayList <Treasure> unusedTreasures = new ArrayList();
    private ArrayList <Treasure> usedTreasures = new ArrayList();
    private ArrayList <Monster> unusedMonsters = new ArrayList();
    private ArrayList <Monster> usedMonsters = new ArrayList();
    
    //el constructor privado asegura que no se puede instanciar desde 
    //otras clases
    private CardDealer(){}
    public static CardDealer getInstance(){
        return instance;
    }
    private void initTreasureCardDeck(){
        //unusedTreasures = Cards.initializeTreasures();
        shuffleTreasures();
    }
    private void initMonsterCardDeck(){
        unusedMonsters = Cards.initializeMonsters();
    }
    private void shuffleTreasures(){
        Collections.shuffle(unusedTreasures);
    }
    private void shuffleMonsters(){
        Collections.shuffle(unusedMonsters);
    }
    //public Treasure nextTreasure(){}
    //public Monster nextMonster(){}
    public void giveTreasureBack(Treasure t){
        usedTreasures.add(t);
        unusedTreasures.remove(t);
    }
    public void giveMonsterBack(Monster m){
        usedMonsters.add(m);
        unusedMonsters.remove(m);
    }
    //public void initCards(){}
}
