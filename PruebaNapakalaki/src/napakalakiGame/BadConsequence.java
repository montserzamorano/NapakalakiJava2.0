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
    public void substractVisibleTreasure(Treasure t){
        //si son tesoros especificos
        if(!specificVisibleTreasures.isEmpty()){
          getSpecificVisibleTreasures().remove(t.getType());
        }
        else{//si no hay tesoros especificos
          if(nVisibleTreasures > 0){
            nVisibleTreasures = nVisibleTreasures-1;
          }   
        }
    }
    public void substractHiddenTreasure(Treasure t){
        //si son tesoros especificos
        if(!specificHiddenTreasures.isEmpty()){
          getSpecificHiddenTreasures().remove(t.getType());
        }
        else{//si no hay tesoros especificos
          if(nHiddenTreasures > 0){
            nHiddenTreasures = nHiddenTreasures-1;
          }   
        }
    }
    public BadConsequence adjustToFitTreasureLists(ArrayList <Treasure> v, ArrayList <Treasure> h){
        ArrayList <TreasureKind> visible = new ArrayList();
        ArrayList <TreasureKind> hidden = new ArrayList();
        BadConsequence bc = null;
        
        if(!specificVisibleTreasures.isEmpty() || !specificHiddenTreasures.isEmpty()){
        
            //TESOROS ESPECÍFICOS
            int contOneHand = 0;
            boolean both = false;

            for(int i=0; i<v.size() && !both && contOneHand < 2; i++){
                if(v.get(i).getType() == TreasureKind.ONEHAND)
                    contOneHand++;
                if(v.get(i).getType() == TreasureKind.BOTHHANDS)
                    both = true;
            }
            for(TreasureKind vis :this.getSpecificVisibleTreasures()){
         
                if(vis == TreasureKind.ONEHAND && contOneHand != 0){
                    visible.add(vis);
                    contOneHand--;
                }
                else if(vis == TreasureKind.BOTHHANDS){
                    if(both)
                    visible.add(vis);
                }
                else{
                    for(Treasure t :v){
                        if(t.getType() == vis){
                            visible.add(vis);
                        }
                    }
                }
            }
       
            contOneHand = 0;
            both = false;
            //comprobamos si hay ONEHAND o BOTHANDS en el array de tesoros
            for(int i=0; i<h.size() && !both && contOneHand < 2; i++){
                if(h.get(i).getType() == TreasureKind.ONEHAND)
                    contOneHand++;
                if(h.get(i).getType() == TreasureKind.BOTHHANDS)
                    both = true;
            }
            for(TreasureKind hid :this.getSpecificHiddenTreasures()){

                if(hid == TreasureKind.ONEHAND && contOneHand != 0){
                    hidden.add(hid);
                    contOneHand--;
                }
                else if(hid == TreasureKind.BOTHHANDS){
                    if(both)
                        hidden.add(hid);
                }
                //si contiene el elemento
                else{
                    for(Treasure t :h){
                        if(t.getType() == hid)
                            hidden.add(hid);
                    }
                }
            }
            bc = new BadConsequence(this.getText(), this.getLevels(), visible, hidden);
        }
        else{//si no hay tesoros especificos
            int minV = 0;
            int minH = 0;
        
            if(v.size() < this.getnVisibleTreasures()){
                minV = v.size();
            }
            else{
                minV = this.getnVisibleTreasures();
            }
        
            if(h.size() < this.getnHiddenTreasures()){
                minH = h.size();
            }
            else{
                minH = this.getnHiddenTreasures();
            }
           
            bc = new BadConsequence(this.getText(), this.getLevels(), minV, minH);
        }
        
        return bc;
    }
}
