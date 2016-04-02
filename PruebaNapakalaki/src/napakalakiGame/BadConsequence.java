package napakalakiGame;

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
    static int MAXTREASURES = 10;
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
    }
    public BadConsequence(String text){
        this.text = text;
        nVisibleTreasures = MAXTREASURES;
        nHiddenTreasures = MAXTREASURES;
        levels = Player.MAXLEVEL;
    }
    public BadConsequence(String text, int levels, 
        ArrayList <TreasureKind> tVisible, ArrayList <TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        nVisibleTreasures = 0;
        nHiddenTreasures = 0;
        for (TreasureKind t : tVisible){
           specificVisibleTreasures.add(t);
        }
        for (TreasureKind t : tHidden){
           specificHiddenTreasures.add(t);
        }
    }
    
    public BadConsequence(BadConsequence b){
        text = b.getText();
        levels = b.getLevels();
        nVisibleTreasures = b.getnVisibleTreasures();
        nHiddenTreasures = b.getnHiddenTreasures();
        for (TreasureKind t : b.getSpecificVisibleTreasures()){
            specificVisibleTreasures.add(t);
        }
        
        for (TreasureKind t : b.getSpecificHiddenTreasures()){
            specificHiddenTreasures.add(t);
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

    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }

    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }
    
    public String getStringTreasures(ArrayList <TreasureKind> treasure){
        String s = "";
        for(TreasureKind t :treasure){
            if(t == TreasureKind.ARMOR)
                s += "\t-Armadura.\n";
            else if(t == TreasureKind.BOTHHANDS)
                s += "\t-Dos manos.\n";
            else if(t == TreasureKind.HELMET)
                s += "\t-Casco.\n";
            else if(t == TreasureKind.ONEHAND)
                s += "\t-Mano.\n";
            else if(t == TreasureKind.SHOES)
                s += "\t-Calzado\n";
           }
        return s;
    }
    
    //toString
    @Override
    public String toString(){
        String texto = text + "\nNiveles = " + Integer.toString(levels)
                    + "\nTesoros visibles = " + Integer.toString(nVisibleTreasures)
                    + "\nTesoros ocultos = " + Integer.toString(nHiddenTreasures);
                    
        if(specificVisibleTreasures != null
            && specificVisibleTreasures.size() != 0){
            text += "\nTesoros visibles específicos: \n" 
                 + getStringTreasures(specificVisibleTreasures);
        }
        if(specificHiddenTreasures != null 
           && specificHiddenTreasures.size() != 0){
            text += "\nTesoros ocultos específicos \n" 
                    + getStringTreasures(specificHiddenTreasures);
        }
        
        return texto;
    }
    
    public boolean isEmpty(){
        if(specificHiddenTreasures.size()==0 && specificVisibleTreasures.size()==0
           && nHiddenTreasures == 0 && nVisibleTreasures == 0)
            return true;
        else
            return false;
    }
    //public void substractVisibleTreasure(Treasure t){}
    //public void substractHiddenTreasure(Treasure t){}
    //public BadConsequence adjustToFitTreasureLists(ArrayList <Treasure> v, ArrayList <Treasure> h){}
}
