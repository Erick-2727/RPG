/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.rpg;

/**
 *
 * @author Erick
 */
public class Guerrero extends Personaje {

    public Guerrero(String nomb, char s) {
        super(nomb, "Guerrer" + s, 20, 15, 50, 15, "Hacha", s);
    }

}
