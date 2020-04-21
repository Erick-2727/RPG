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
public class Mago extends Personaje {

    public Mago(String nomb,char s) {
        super(nomb,"Mag"+s,15, 25,50,10,"Hechizo",s);
    }
    
}
