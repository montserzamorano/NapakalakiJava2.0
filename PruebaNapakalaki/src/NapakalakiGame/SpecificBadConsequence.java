/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import java.util.ArrayList;

/**
 *
 * @author montse
 */
public class SpecificBadConsequence extends BadConsequence{
    private ArrayList <TreasureKind> specificVisibleTreasures;
    private ArrayList <TreasureKind> specificHiddenTreasures;
    
    public SpecificBadConsequence(String text, int levels, 
      ArrayList <TreasureKind> tVisible, ArrayList <TreasureKind> tHidden){
      super(text,levels);
      for (TreasureKind t : tVisible){
        specificVisibleTreasures.add(t);
      }
      for (TreasureKind t : tHidden){
        specificHiddenTreasures.add(t);
      }
    }
    
    
    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
      return specificHiddenTreasures;
    }

    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
      return specificVisibleTreasures;
    }
    
    
    
    //to_s
    
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
    
    public String toString(){
        String text;
        text = super.toString();
        if(specificVisibleTreasures != null && specificVisibleTreasures.size() != 0){
            text += "\nTesoros visibles específicos: \n" 
                 + getStringTreasures(specificVisibleTreasures);
        }
        if(specificHiddenTreasures != null 
           && specificHiddenTreasures.size() != 0){
            text += "\nTesoros ocultos específicos \n" 
                    + getStringTreasures(specificHiddenTreasures);
        }
        return text;
    }
    
    
    @Override
    public boolean isEmpty(){
        return (specificVisibleTreasures.isEmpty() && specificHiddenTreasures.isEmpty());
    }
    
    @Override
    public void substractVisibleTreasure (Treasure t){
        if (!specificVisibleTreasures.isEmpty())
            specificVisibleTreasures.remove(t.getType());
    }
    
    @Override
    public void substractHiddenTreasure (Treasure t){
        if (!specificHiddenTreasures.isEmpty())
            specificHiddenTreasures.remove(t.getType());
    }
    
    @Override
    public SpecificBadConsequence adjustToFitTreasureLists(ArrayList <Treasure> visible, ArrayList <Treasure> hidden){
        ArrayList <Treasure> cvisible = new ArrayList<>(visible);
        ArrayList <Treasure> chidden = new ArrayList<>(hidden);
        ArrayList <TreasureKind> newSpecificVisibleTreasures = new ArrayList<>();
        ArrayList <TreasureKind> newSpecificHiddenTreasures = new ArrayList<>();
        
        if (specificVisibleTreasures.size() != 0 && specificHiddenTreasures.size() == 0){ //Caso en el que el mal rollo quita tesoros especificos.
            boolean found;
            int i;
            
            for (TreasureKind tk: specificVisibleTreasures){
                i = 0;
                found = false;
                
                while(i < cvisible.size() && !found){
                    if (cvisible.get(i).getType() == tk){
                        found = true;
                    }
                    else
                        i = i + 1;
                }
                
                if (found){
                    newSpecificVisibleTreasures.add(tk);
                    cvisible.remove(i);
                }
            } 
        }
        else if (specificVisibleTreasures.size() == 0 && specificHiddenTreasures.size() != 0){
            boolean found;
            int i;
            
            for (TreasureKind tk: specificHiddenTreasures){
                i = 0;
                found = false;
                
                while(i < chidden.size() && !found){
                    if (chidden.get(i).getType() == tk){
                        found = true;
                    }
                    else
                        i = i + 1;
                }
                
                if (found){
                    newSpecificHiddenTreasures.add(tk);
                    chidden.remove(i);
                }
            }
        }
        else if (specificVisibleTreasures.size() != 0 && specificHiddenTreasures.size() != 0){
            boolean found;
            int i;
            
            for (TreasureKind tk: specificVisibleTreasures){
                i = 0;
                found = false;
                
                while(i < cvisible.size() && !found){
                    if (cvisible.get(i).getType() == tk){
                        found = true;
                    }
                    else
                        i = i + 1;
                }
                
                if (found){
                    newSpecificVisibleTreasures.add(tk);
                    cvisible.remove(i);
                }
            }
            
            for (TreasureKind tk: specificHiddenTreasures){
                i = 0;
                found = false;
                
                while(i < chidden.size() && !found){
                    if (chidden.get(i).getType() == tk){
                        found = true;
                    }
                    else
                        i = i + 1;
                }
                
                if (found){
                    newSpecificHiddenTreasures.add(tk);
                    chidden.remove(i);
                }
            }
        }
            
        return new SpecificBadConsequence(super.getText(),0,newSpecificVisibleTreasures,newSpecificHiddenTreasures);
    }
    
    
    
}
