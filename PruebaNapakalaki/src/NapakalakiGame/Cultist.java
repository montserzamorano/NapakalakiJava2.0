package NapakalakiGame;

/**
 *
 * @author Montserrat Rodriguez Zamorano
 */
public class Cultist {
    private String name;
    private int gainedLevels;
    public Cultist(String name, int gainedLevels){
        this.name=name;
        this.gainedLevels=gainedLevels;
    }
    
    public int getGainedLevels(){
        return gainedLevels;
    }
    
    @Override
    public String toString(){
        return "(" + name + "," + Integer.toString(gainedLevels) + ")";
    }
    
}
