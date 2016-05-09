package NapakalakiGame;

/**
 *
 * @author Montserrat Rodriguez Zamorano
 */
public class Monster {
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence badconsequence;
    private int levelChangeAgainstCultistPlayer;
    
    public Monster(String name, int level, BadConsequence bc, Prize prize){
        this.name = name;
        combatLevel = level;
        this.prize = prize;
        badconsequence = bc;
        levelChangeAgainstCultistPlayer=0;
    }
    
    public Monster(String name, int level, BadConsequence bc, Prize prize, int lC){
        this.name = name;
        combatLevel = level;
        this.prize = prize;
        badconsequence = bc;
        levelChangeAgainstCultistPlayer=lC;
    }
    
    public String getName() {
        return name;
    }

    public int getCombatLevel() {
        return combatLevel;
    }
    
    public int getLevelsGained(){
        return prize.getLevel();
    }
    
    public int getTreasuresGained(){
        return prize.getTreasures();
    }
    
    public BadConsequence getBadConsequence() {
        return badconsequence;
    }
    //toString
    @Override
    public String toString(){
        return "\nCARTA DE MONSTRUO" 
                + "\nNombre: " + name
                + "\nNivel de combate: "+ Integer.toString(combatLevel)
                + "\nPremio: " + prize.toString()
                + "\nMal rollo: " + badconsequence.toString();
    }
    public int getCombatLevelAgainstCultistPlayer(){
        return getCombatLevel()+levelChangeAgainstCultistPlayer;
    }
}
