package napakalakiGame;
import java.util.Random;
         
/**
 *
 * @author Minim
 */
public class Dice {
    private static final Dice instance = new Dice();
    //el constructor privado asegura que no se puede instanciar desde 
    //otras clases
    private Dice(){}
    public static Dice getInstance(){
        return instance;
    }
    public int nextNumber(){
        return (int)(Math.random() * 6 + 1);
    }
}
