package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Minim
 */
public class Napakalaki {
    private static final Napakalaki instance = new Napakalaki();
    private Monster currentMonster;
    private Player currentPlayer;
    private ArrayList <Player> players = new ArrayList();
    private CardDealer dealer;
    //el constructor privado asegura que no se puede instanciar desde 
    //otras clases
    private Napakalaki(){}
    public static Napakalaki getInstance(){
        return instance;
    }
    //private void initPlayers(String[] names){}
    //private Player nextPlayer(){}
    //private boolean nextTurnAllowed(){}
    //public CombatResult developCombat(){}
    //public void discardVisibleTreasures(Treasure[] treasures){}
    //public void discardHiddenTreasures(Treasure[] treasures){}
    //public void makeTreasuresVisible(Treasure[] treasures){}
    //public void initGame(String [] players){}
    //public Player getCurrentPlayer(){}
    //public Monster getCurrentMonster(){}
    //public boolean nextTurn(){}
    //public boolean endOfGame(CombatResult result){}
}
