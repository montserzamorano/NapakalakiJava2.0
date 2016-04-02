package napakalakiGame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author montse
 */
public class PruebaNapakalaki2 {
    public static void main(String[] args) {
        
         ////////////////////////////////////////
        
        System.out.println("PRUEBA DADO");
        Dice dado = Dice.getInstance();
        for(int i=0; i<10; i++){
            System.out.println(dado.nextNumber());
        }
        
        ////////////////////////////////////////
        
        System.out.println("\n\nPRUEBA MONSTER");
        BadConsequence bc= new BadConsequence("Pierdes tu armadura visible yotra oculta",
                0,new ArrayList(Arrays.asList(TreasureKind.ARMOR)), 
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        Prize p2 = new Prize(1,1);
        Monster m= new Monster("El sopor de Dunwich",2,bc,p2);
        System.out.println(m.toString());
        
        ////////////////////////////////////////
        
        System.out.println("\n\nPPRUEBA PRIZE");
        Prize p = new Prize(1,1);
        System.out.println(p.getLevel());
        System.out.println(p.getTreasures());
        System.out.println(p.toString());

        ////////////////////////////////////////
        
        System.out.println("\n\nPPRUEBA TREASURES");
        Treasure t = new Treasure("Tesoro 1",10,TreasureKind.ARMOR);
        System.out.println(t.getName());
        System.out.println(t.getBonus());
        System.out.println(t.getType());
        
        ////////////////////////////////////////
        
        System.out.println("\n\nPRUEBA BAD CONSEQUENCE");
        BadConsequence b1 = new BadConsequence("Esto es un mal rollo de muerte");
        BadConsequence b2 = new BadConsequence("Esto es un mal rollo de numero",1,1,1);
        BadConsequence b3 = new BadConsequence("Esto es un mal rollo vacio",0,0,0);
        BadConsequence b4 = new BadConsequence("Esto es un mal rollo vacio",0, new ArrayList(), new ArrayList());
        
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        
        System.out.println(b2.isEmpty());
        System.out.println(b3.isEmpty());
        System.out.println(b4.isEmpty());
        
        ////////////////////////////////////////
        
        System.out.println("\n\nPRUEBA PLAYER");
        Player jugador = new Player("Jugador1");
        //para probar esto, importante cambiar visibilidad de los metodos!
        //System.out.println(jugador.validState());
        //System.out.println(jugador.isDead());
        //jugador.bringToLife();
        System.out.println(jugador.isDead());
        //jugador.dieIfNoTreasures();
        System.out.println(jugador.isDead());
        //System.out.println(jugador.getLevels());
        //jugador.incrementLevels(1);
        //System.out.println(jugador.getLevels());
        //jugador.decrementLevels(3);
        System.out.println(jugador.getLevels());
        //System.out.println(jugador.getCombatLevel());
    }
}
