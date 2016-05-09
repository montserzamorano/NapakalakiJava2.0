package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author Minim
 */
public class Napakalaki {
    private static final Napakalaki instance = new Napakalaki();
    private static final int MAXPLAYERS = 3;
    private int currentPlayerIndex = -1;
    private Monster currentMonster = null;
    private Player currentPlayer = null;
    private ArrayList <Player> players = new ArrayList();
    private CardDealer dealer;
    //el constructor privado asegura que no se puede instanciar desde 
    //otras clases
    private Napakalaki(){}
    public static Napakalaki getInstance(){
        return instance;
    }
    private void initPlayers(ArrayList <String> names){
        if(names.size() > MAXPLAYERS) {
            System.out.println("Ha introducido demasiados jugadores");
        } 
        else {
            for (String n : names) {
                Player p;
                p = new Player(n);
                players.add(p);
            }
        } 
    }
    
    private Player nextPlayer(){
        if(currentPlayerIndex == -1)
            currentPlayerIndex = new Double(Math.random() *players.size()).intValue();
        else{
            if(currentPlayerIndex == players.size() - 1)
                currentPlayerIndex = 0;
            else
                currentPlayerIndex += 1;
        }
        currentPlayer = players.get(currentPlayerIndex);
        return currentPlayer;
    }
    private boolean nextTurnAllowed(){
        if(currentPlayer==null){
            return true;
        }
        else{
            return currentPlayer.validState();
        }
    }
    public CombatResult developCombat(){
        CombatResult combatResult = currentPlayer.combat(currentMonster);
        CardDealer dealer = CardDealer.getInstance();
        dealer.giveMonsterBack(currentMonster);
        if(combatResult == CombatResult.LOSEANDCONVERT){
            Cultist cultist_card = dealer.nextCultist();
            CultistPlayer cultist_player = new CultistPlayer(currentPlayer,cultist_card);
            currentPlayer = cultist_player;
            players.set(currentPlayerIndex,cultist_player);
        }
            
        return combatResult;
    }
    public void discardVisibleTreasures(ArrayList <Treasure> treasures){}
    public void discardHiddenTreasures(ArrayList <Treasure> treasures){}
    public void makeTreasureVisible(Treasure t){
        currentPlayer.makeTreasureVisible(t);
    }
    public void initGame(ArrayList <String> players){
        initPlayers(players);
        CardDealer dealer = CardDealer.getInstance();
        dealer.initCards();
        
    }
    public Player getCurrentPlayer(){
        return currentPlayer;
    }
    public Monster getCurrentMonster(){
        return currentMonster;
    }
    public boolean nextTurn(){
        boolean stateOK = false;
        if(currentPlayer!=null){
            stateOK = nextTurnAllowed();
        }
        if(stateOK){
            CardDealer dealer = CardDealer.getInstance();
            currentMonster = dealer.nextMonster();
            currentPlayer = nextPlayer();
            boolean dead = currentPlayer.isDead();
            if(dead)
                currentPlayer.initTreasures();
        }
        return stateOK;
    }
    
    public boolean endOfGame(CombatResult result){
        return result == CombatResult.WINGAME;
    }
}
