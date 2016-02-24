/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author Minim
 */
public class Monster {
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence badconsequence;
    
    public Monster(String name, int level, BadConsequence bc, Prize prize){
        this.name = name;
        combatLevel = level;
        this.prize = prize;
        badconsequence = bc;
    }
    
    public String getName() {
        return name;
    }

    public int getCombatLevel() {
        return combatLevel;
    }
    //toString
    @Override
    public String toString(){
        return "CARTA DE MONSTRUO" 
                + "\tNombre = " + name
                + "\tNivel de combate"+ Integer.toString(combatLevel)
                + "\tPREMIO: " + prize.toString()
                + "\tMAL ROLLO" + badconsequence.toString();
    }
}
