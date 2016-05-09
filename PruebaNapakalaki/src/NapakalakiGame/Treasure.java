package NapakalakiGame;

/**
 *
 * @author Montserrat Rodriguez Zamorano
 */
public class Treasure {
    private String name;
    private int bonus;
    TreasureKind type;
    
    public Treasure(String n, int bonus, TreasureKind t){
        name = n;
        this.bonus = bonus;
        type = t;
    }
    public String getName(){return name;}
    public int getBonus(){return bonus;}
    public TreasureKind getType(){return type;}
}
