package napakalaki;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minim
 */
public class BadConsequence {
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private ArrayList <TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList <TreasureKind> specificVisibleTreasures = new ArrayList();
    
    //Constructores
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
        specificHiddenTreasures = null;
        specificVisibleTreasures = null;
    }
    public BadConsequence(String text){
        this.text = text;
        nVisibleTreasures = 10;
        nHiddenTreasures = 10;
        levels = 10;
        specificHiddenTreasures = null;
        specificVisibleTreasures = null;
    }
    public BadConsequence(String text, int levels, 
        ArrayList <TreasureKind> tVisible, ArrayList <TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        nVisibleTreasures = 0;
        nHiddenTreasures = 0;
        for (int i=0; i<tVisible.size(); i++){
           specificVisibleTreasures.set(i, tVisible.get(i));
        }
        for (int i=0; i<tHidden.size(); i++){
           specificHiddenTreasures.set(i, tHidden.get(i));
        }
    }
    
    public String getText() {
        return text;
    }

    public int getLevels() {
        return levels;
    }

    public int getnVisibleTreasures() {
        return nVisibleTreasures;
    }

    public int getnHiddenTreasures() {
        return nHiddenTreasures;
    }
    
    //toString
    @Override
    public String toString(){
        return text + "\nNiveles = " + Integer.toString(levels)
                    + "Tesoros visibles = " + Integer.toString(nVisibleTreasures)
                    + "Tesoros ocultos = " + Integer.toString(nHiddenTreasures)
                    + "Tesoros visibles específicos " 
                    + specificVisibleTreasures.toString()
                    + "Tesoros ocultos específicos " 
                    + specificHiddenTreasures.toString();
    }
}
