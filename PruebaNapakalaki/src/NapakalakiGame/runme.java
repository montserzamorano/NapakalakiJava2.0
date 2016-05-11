/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

/**
 *
 * @author Minim
 */
public class runme {
    public static void main(String[] args) {
        BadConsequence bc = new DeathBadConsequence("Estos monstruos son bastante superficiales y"+
        " te aburren mortalmente. Estas muerto.");
        Prize p = new Prize(1,1);
        Player jugador1 = new Player("Jugador 1");
        GoodMonster monstruo1 = new GoodMonster("Los hondos",8,bc,p,0,jugador1);
        Monster monstruo2 = new Monster("Los hondos",8,bc,p);
        System.out.println(jugador1.getOponentLevel(monstruo1)); 
        System.out.println(jugador1.getOponentLevel(monstruo2));
        Cultist cultist = new Cultist("Sectario1",1);
        Player jugador2 = new CultistPlayer(jugador1,cultist);
        GoodMonster monstruo3 = new GoodMonster("Los hondos",8,bc,p,0,jugador2);
        System.out.println(jugador2.getOponentLevel(monstruo3)); 
        System.out.println(jugador2.getOponentLevel(monstruo2));
    }
}
