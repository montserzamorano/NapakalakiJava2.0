package NapakalakiGame;

/**
 *
 * @author Minim
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
    
    public String getStringType(TreasureKind type){
        if(type == TreasureKind.ARMOR)
            return "Armor";
        else if(type == TreasureKind.BOTHHANDS)
            return "Both hands";
        else if(type == TreasureKind.HELMET)
            return "Helmet";
        else if(type == TreasureKind.ONEHAND)
            return "One hand";
        else if(type == TreasureKind.SHOES)
            return "Shoe";
        else
            return "";
    }
    
    @Override
    public String toString(){
        return "Nombre = " + name + " \n " + "Bonus = " + bonus + " \n " + " Tipo = " + type.toString();
    }
}
