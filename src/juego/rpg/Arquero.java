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
public class Arquero extends Personaje {

    public Arquero(String nomb, char s) {
        super(nomb, "Arquer" + s, 15, 25, 50, 20, "Arco", s);
    }

}
