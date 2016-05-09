package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author montse
 */
public class NumericBadConsequence extends BadConsequence{
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    public NumericBadConsequence(String text, int someLevels, int someV, int someH){
       super(text,someLevels);
       this.nHiddenTreasures = someH;
       this.nVisibleTreasures = someV;
       
    }
    
    public int getnVisibleTreasures() {
      return nVisibleTreasures;
    }

    public int getnHiddenTreasures() {
       return nHiddenTreasures;
    }
    
    
    @Override
    public boolean isEmpty(){
        return (nVisibleTreasures == 0 && nHiddenTreasures == 0);
    }
    
    @Override
    public void substractVisibleTreasure (Treasure t){
        if (nVisibleTreasures != 0)
            nVisibleTreasures--;
    }
    
    @Override
    public void substractHiddenTreasure (Treasure t){
        if (nHiddenTreasures != 0)
            nHiddenTreasures--;
    }
    
    @Override
    public NumericBadConsequence adjustToFitTreasureLists(ArrayList <Treasure> visible, ArrayList <Treasure> hidden){
        int nVisible, nHidden;
        
        if (nVisibleTreasures == 0)
            nVisible = 0;
        else
            if (nVisibleTreasures < visible.size())
                nVisible = nVisibleTreasures;
            else
                nVisible = visible.size();
        
        if (nHiddenTreasures == 0)
                nHidden = 0;
            else
                if (nHiddenTreasures < hidden.size())        
                    nHidden = nHiddenTreasures;
                else
                    nHidden = hidden.size();
            
        return new NumericBadConsequence(super.getText(),super.getLevels(),nVisible,nHidden);
    }
    
    
    public String toString(){
        String texto=super.toString();
        texto += " Número de tesoros visibles perdidos = " + Integer.toString(nVisibleTreasures) + " \n " + " Número de tesoros ocultos perdidos = " + Integer.toString(nHiddenTreasures);
        return texto;
    }
    
}
