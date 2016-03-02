/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Baraja de cartas de monstruos
 * @author Minim
 */
public class Cards {
    private static final int MAX =10;
    
    public static ArrayList <Monster> initializeMonsters(){
        ArrayList <Monster> monsters = new ArrayList();
        BadConsequence bc;
        Prize p;
        
        /*3 byakhees de bonanza*/
        bc = new BadConsequence("Pierdes tu armadura visible y otra oculta",
        0,new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        p = new Prize(2,1);
        monsters.add(new Monster("3 byakhees de bonanza",8,bc,p));
        
        /*Chibithulhu*/
        bc = new BadConsequence("Embobados con el lindo primigenio te "+
        "descartas de tu casco visible.",0, 
        new ArrayList(Arrays.asList(TreasureKind.HELMET)),new ArrayList());
        p = new Prize(1,1);
        monsters.add(new Monster("Chibithulhu",2,bc,p));
        
        /*El sopor de Dunwich*/
        monsters.add(new Monster("El sopor de Dunwich",2,bc,p));
        
        /*Angeles de la noche ibicenca*/
        bc = new BadConsequence("Te atrapan para llevarte de fiesta y te " + 
        "dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",
        0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
        new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        p = new Prize(4,1);
        monsters.add(new Monster("Ángeles de la noche ibicenca",14,bc,p));
        
        /*El gorrón en el umbral*/
        bc = new BadConsequence("Pierdes todos tus tesoros visibles",0,MAX,0);
        p = new Prize(3,1);
        monsters.add(new Monster("El gorrón en el umbral",10,bc,p));
        
        /*H.P Munchcraft*/
        bc = new BadConsequence("Pierdes la armadura visible",
        0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList());
        p = new Prize(2,1);
        monsters.add(new Monster("H.P Munchcraft",6,bc,p));
        
        /*Bichgooth*/
        monsters.add(new Monster("Bichgooth",2,bc,p));
        bc = new BadConsequence("Sientes bichos bajo la ropa. Descarta la"+
        "armadura visible", 0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList());
        p = new Prize(1,1);
        /*El rey de rosa*/
        bc = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
        p = new Prize(4,2);
        monsters.add(new Monster("El rey de rosa",13,bc,p));
        
        /*La que redacta en las tinieblas*/
        monsters.add(new Monster("La que redacta en las tinieblas",2,bc,p));
        
        /*Los hondos*/
        monsters.add(new Monster("Los hondos",8,bc,p));
        
        /*Semillas Cthulhu*/
        monsters.add(new Monster("Semillas Cthulhu",4,bc,p));
        
        /*Dameargo*/
        monsters.add(new Monster("Dameargo",1,bc,p));
        
        /*Pollipolipo volante*/
        monsters.add(new Monster("Pollipolipo volante",3,bc,p));
        
        /*Yskhtihyssg-Goth*/
        monsters.add(new Monster("Yskhtihyssg-Goth",12,bc,p));
        
        /*Familia feliz*/
        monsters.add(new Monster("Familia feliz",1,bc,p));
        
        /*Roboggoth*/
        monsters.add(new Monster("Roboggoth",8,bc,p));
        
        /*El espia*/
        monsters.add(new Monster("El espia",5,bc,p));
        
        /*El lenguas*/
        monsters.add(new Monster("El lenguas",20,bc,p));
        
        /*Bicefalo*/
        monsters.add(new Monster("Bicefalo",20,bc,p));
        
        return monsters;
    }
}
