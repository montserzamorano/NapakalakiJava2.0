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
public class PruebaP4 {
    public static void main(String[] args) {
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
        
        ArrayList <Treasure> v1 = new ArrayList();
        ArrayList <Treasure> h1 = new ArrayList();
        
        v1.add(new Treasure("Tesoro",3,TreasureKind.ONEHAND));
        v1.add(new Treasure("Tesoro",3,TreasureKind.HELMET));
        v1.add(new Treasure("Tesoro",3,TreasureKind.ARMOR));
        
        h1.add(new Treasure("Tesoro",3,TreasureKind.ARMOR));
        h1.add(new Treasure("Tesoro",3,TreasureKind.SHOES));
        h1.add(new Treasure("Tesoro",3,TreasureKind.HELMET));
        
        p1.setVisibleTreasures(v1);
        p1.setHiddenTreasures(h1);
        
        p2.setVisibleTreasures(v1);
        p2.setHiddenTreasures(h1);
        
        System.out.println("Estado del jugador 1");
        System.out.println(p1.toString());
        System.out.println("Estado del jugador 2");
        System.out.println(p2.toString());
        
        Cultist cultist = new Cultist("Sectario1",1);
        Player p3 = new CultistPlayer(p1,cultist);
        System.out.println("El jugador 1 se ha convertido en sectario con éxito.");
        System.out.println(p3.toString());
        
        Cultist cultist2 = new Cultist("Sectario2",2);
        Player p4 = new CultistPlayer(p2,cultist2);
        System.out.println("El jugador 2 se ha convertido en sectario con éxito.");
        System.out.println(p4.toString());
        
        ArrayList <Treasure> v2 = new ArrayList();
        ArrayList <Treasure> h2 = new ArrayList();
        
        p3.setVisibleTreasures(v2);
        p3.setHiddenTreasures(h2);
        
        p4.setVisibleTreasures(v2);
        p4.setHiddenTreasures(h2);
        
        System.out.println("Estado del sectario 1");
        System.out.println(p3.toString());
        System.out.println("Estado del sectario 2");
        System.out.println(p4.toString());
        
        //probamos el adjust to fit
        
        //visibles
        BadConsequence bc = new NumericBadConsequence("numeric",0,2,0);
        System.out.println("BC sin ajustar");
        System.out.println(bc.toString());
        System.out.println("BC ajustado");
        BadConsequence bc1 = bc.adjustToFitTreasureLists(v1,h1);
        System.out.println(bc1.toString());
        
        
        //especificos
        ArrayList <TreasureKind> vis = new ArrayList();
        ArrayList <TreasureKind> hid = new ArrayList();
        
        vis.add(TreasureKind.ONEHAND);
        vis.add(TreasureKind.ONEHAND);
        vis.add(TreasureKind.BOTHHANDS);
        
        BadConsequence bc2 = new SpecificBadConsequence("specific",0,vis,hid);
        System.out.println("BC sin ajustar");
        System.out.println(bc2.toString());
        System.out.println("BC ajustado");
        BadConsequence bc3 = bc2.adjustToFitTreasureLists(v1,h1);
        System.out.println(bc3.toString());
        
        //Muerte
        BadConsequence bc4 = new DeathBadConsequence("muerte");
        System.out.println("BC sin ajustar");
        System.out.println(bc4.toString());
        System.out.println("BC ajustado");
        BadConsequence bc5 = bc4.adjustToFitTreasureLists(v1,h1);
        System.out.println(bc5.toString());
        
    }   
}
