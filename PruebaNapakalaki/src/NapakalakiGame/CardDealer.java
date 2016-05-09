
package NapakalakiGame;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Montserrat Rodriguez Zamorano
 */
public class CardDealer {
    private static final CardDealer instance = new CardDealer();
    private ArrayList <Treasure> unusedTreasures = new ArrayList();
    private ArrayList <Treasure> usedTreasures = new ArrayList();
    private ArrayList <Monster> unusedMonsters = new ArrayList();
    private ArrayList <Monster> usedMonsters = new ArrayList();
    private ArrayList <Cultist> unusedCultists = new ArrayList();
    
    //el constructor privado asegura que no se puede instanciar desde 
    //otras clases
    private CardDealer(){}
    public static CardDealer getInstance(){
        return instance;
    }
    private void initTreasureCardDeck(){
        unusedTreasures = Cards.initializeTreasures();
        shuffleTreasures();
    }
    private void initMonsterCardDeck(){
        unusedMonsters = Cards.initializeMonsters();
        shuffleMonsters();
    }
    private void initCultistCardDeck(){
        unusedCultists = Cards.initializeCultists();
        shuffleCultists();
    }  
    private void shuffleTreasures(){
        Collections.shuffle(unusedTreasures);
    }
    private void shuffleMonsters(){
        Collections.shuffle(unusedMonsters);
    }
    private void shuffleCultists(){
        Collections.shuffle(unusedCultists);
    }
    public Treasure nextTreasure(){
        if(unusedTreasures.isEmpty()){
            unusedTreasures = (ArrayList<Treasure>) usedTreasures.clone();
            usedTreasures.clear();
            shuffleTreasures();
        }
        
        Treasure t = unusedTreasures.get(0);
        unusedTreasures.remove(0);
        usedTreasures.add(t);
        return t;
    }
    public Monster nextMonster(){
        if(unusedMonsters.isEmpty()){
            unusedMonsters = (ArrayList<Monster>) usedMonsters.clone();
            usedMonsters.clear();
            shuffleMonsters();
        }   
        Monster m = unusedMonsters.get(0);
        unusedMonsters.remove(0);
        usedMonsters.add(m);
        return m;
    }
    public Cultist nextCultist(){
        Cultist c = unusedCultists.get(0);
        unusedCultists.remove(0);
        return c;
    }
    public void giveTreasureBack(Treasure t){
        usedTreasures.add(t);
        unusedTreasures.remove(t);
    }
    public void giveMonsterBack(Monster m){
        usedMonsters.add(m);
        unusedMonsters.remove(m);
    }
    public void initCards(){
        initTreasureCardDeck();
        initMonsterCardDeck();
        initCultistCardDeck();
    }
}
