package NapakalakiGame;

/**
 *
 * @author Montserrat Rodriguez Zamorano
 */
public class Prize {
    private int treasures;
    private int level;
    
    public Prize(int treasures, int level){
      this.treasures = treasures;
      this.level = level;
    }
    
    public int getTreasures(){
        return treasures;
    }
    public int getLevel(){
        return level;
    }
    
    //toString
    @Override
    public String toString(){
        return "\nTesoros = " + Integer.toString(treasures)
               + "\nNiveles = " + Integer.toString(level);
    }
}
