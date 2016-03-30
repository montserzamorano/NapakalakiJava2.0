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
        bc = new BadConsequence("El primordial bostezo contagioso. Pierdes el "+
        "calzado visible.",0, new ArrayList(Arrays.asList(TreasureKind.SHOES)),
        new ArrayList());
        p = new Prize(1,1);
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
        bc = new BadConsequence("Sientes bichos bajo la ropa. Descarta la "+
        "armadura visible", 0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
        new ArrayList());
        p = new Prize(1,1);
        monsters.add(new Monster("Bichgooth",2,bc,p));
        
        /*El rey de rosa*/
        bc = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",5,3,0);
        p = new Prize(4,2);
        monsters.add(new Monster("El rey de rosa",13,bc,p));
        
        /*La que redacta en las tinieblas*/
        bc = new BadConsequence("Toses los pulmones y pierdes dos niveles", 
        2,0,0);
        p = new Prize(1,1);
        monsters.add(new Monster("La que redacta en las tinieblas",2,bc,p));
        
        /*Los hondos*/
        bc = new BadConsequence("Estos monstruos son bastante superficiales y"+
        " te aburren mortalmente. Estas muerto.");
        p = new Prize(1,1);
        monsters.add(new Monster("Los hondos",8,bc,p));
        
        /*Semillas Cthulhu*/
        bc = new BadConsequence("Pierdes dos niveles y dos tesoros ocultos", 
        2,0,2);
        p = new Prize(2,1);
        monsters.add(new Monster("Semillas Cthulhu",4,bc,p));
        
        /*Dameargo*/
        bc = new BadConsequence("Te intentas escaquear. Pierdes una mano visible.",
        0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
        new ArrayList());
        p = new Prize(2,1);
        monsters.add(new Monster("Dameargo",1,bc,p));
        
        /*Pollipolipo volante*/
        bc = new BadConsequence("Da mucho asquito. Pierdes 3 niveles.",3,0,0);
        p = new Prize(1,1);
        monsters.add(new Monster("Pollipolipo volante",3,bc,p));
        
        /*Yskhtihyssg-Goth*/
        bc = new BadConsequence("No le hace gracia que pronuncien mal su " + 
        "nombre. Estás muerto.");
        p = new Prize(3,1);
        monsters.add(new Monster("Yskhtihyssg-Goth",12,bc,p));
        
        /*Familia feliz*/
        bc = new BadConsequence("La familia te atrapa. Estás muerto.");
        p = new Prize(4,1);
        monsters.add(new Monster("Familia feliz",1,bc,p));
        
        /*Roboggoth*/
        bc = new BadConsequence("Pierdes la armadura visible",
        2, new ArrayList(Arrays.asList(TreasureKind.BOTHHANDS)),
        new ArrayList());
        p = new Prize(2,1);
        monsters.add(new Monster("Roboggoth",8,bc,p));
        
        /*El espia*/
        bc = new BadConsequence("Te asusta en la noche. Pierdes un casco visible.",
        0, new ArrayList(Arrays.asList(TreasureKind.HELMET)),
        new ArrayList());
        p = new Prize(1,1);
        monsters.add(new Monster("El espia",5,bc,p));
        
        /*El lenguas*/
        bc = new BadConsequence("Menudo susto te llevas. Pierdes 2 niveles" + 
        " y 5 tesoros visibles.",2,5,0);
        p = new Prize(1,1);
        monsters.add(new Monster("El lenguas",20,bc,p));
        
        /*Bicefalo*/
        bc = new BadConsequence("Te faltan manos para tanta cabeza. Pierdes 3 "+
                "niveles y tus tesoros visibles de las manos.",
        0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND,TreasureKind.ONEHAND,
        TreasureKind.BOTHHANDS)),new ArrayList());
        p = new Prize(1,1);
        monsters.add(new Monster("Bicefalo",20,bc,p));
        
        return monsters;
    }
    
    public static ArrayList <Treasure>  initializeTreasures(){
        ArrayList <Treasure> treasures = new ArrayList();
        treasures.add(new Treasure("¡Sí, mi amo!", 4, TreasureKind.HELMET));
        treasures.add(new Treasure("Botas de investigación",3,TreasureKind.SHOES));
        treasures.add(new Treasure("Capucha de Cthulhu",3, TreasureKind.HELMET));
        treasures.add(new Treasure("A prueba de babas", 2, TreasureKind.ARMOR));
        treasures.add(new Treasure("Botas de lluvia ácida",1,TreasureKind.BOTHHANDS));
        treasures.add(new Treasure("Casco minero",2,TreasureKind.HELMET));
        treasures.add(new Treasure("Ametralladora Thompson",4,TreasureKind.BOTHHANDS));
        treasures.add(new Treasure("Camiseta de la UGR", 1, TreasureKind.ARMOR));
        treasures.add(new Treasure("Clavo de rail ferroviario",3, TreasureKind.ONEHAND));
        treasures.add(new Treasure("Cuchillo de sushi arcano", 2, TreasureKind.ONEHAND));
        treasures.add(new Treasure("Fez alópodo", 3, TreasureKind.ARMOR));
        treasures.add(new Treasure("Hacha prehistórica",2, TreasureKind.ONEHAND));
        treasures.add(new Treasure("El aparato del Pr.Tesla",4,TreasureKind.ARMOR));
        treasures.add(new Treasure("Gaita",4,TreasureKind.BOTHHANDS));
        treasures.add(new Treasure("Insecticida",2,TreasureKind.ONEHAND));
        treasures.add(new Treasure("Escopeta de 3 cañones",4, TreasureKind.BOTHHANDS));
        treasures.add(new Treasure("Garabato místico",2,TreasureKind.ONEHAND));
        treasures.add(new Treasure("La rebeca metálica",2,TreasureKind.ARMOR));
        treasures.add(new Treasure("Lanzallamas",4,TreasureKind.BOTHHANDS));
        treasures.add(new Treasure("Necro-comicón",1,TreasureKind.ONEHAND));
        treasures.add(new Treasure("Necronomicón",5,TreasureKind.BOTHHANDS));        
        treasures.add(new Treasure("Linterna a 2 manos",3,TreasureKind.BOTHHANDS));
        treasures.add(new Treasure("Necro-gnomicón",2,TreasureKind.ONEHAND));
        treasures.add(new Treasure("Necrotelecom",2,TreasureKind.HELMET));
        treasures.add(new Treasure("Mazo de los antiguos",3,TreasureKind.ONEHAND));        
        treasures.add(new Treasure("Necro-playboycón",3,TreasureKind.ONEHAND));
        treasures.add(new Treasure("Porra preternatural",2,TreasureKind.ONEHAND));
        treasures.add(new Treasure("Shogulador",1,TreasureKind.BOTHHANDS));
        treasures.add(new Treasure("Varita de atizamiento",3,TreasureKind.ONEHAND)); 
        treasures.add(new Treasure("Tentáculo de pega",2,TreasureKind.HELMET));
        treasures.add(new Treasure("Zapato deja-amigos",1,TreasureKind.SHOES));         
        
        return treasures;
    }
    
}
