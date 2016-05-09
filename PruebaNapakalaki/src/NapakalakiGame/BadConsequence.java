package NapakalakiGame;

import java.util.ArrayList;


/**
 *
 * @author Montserrat Rodriguez Zamorano
 */
public abstract class BadConsequence {
    static int MAXTREASURES = 10;
    private String text;
    private int levels;
    
    //Constructores
    public BadConsequence(String text, int levels){
        this.text = text;
        this.levels = levels;
    }
    
    public String getText() {
        return text;
    }

    public int getLevels() {
        return levels;
    }
  
    
    //toString
    @Override
    public String toString(){
        String texto = text + "\nNiveles = " + Integer.toString(levels);
                    
        
        return texto;
    }

    public abstract boolean isEmpty();
    public abstract void substractVisibleTreasure (Treasure t);
    public abstract void substractHiddenTreasure (Treasure t);
    public abstract BadConsequence adjustToFitTreasureLists(ArrayList <Treasure> visible, ArrayList <Treasure> hidden);
}
