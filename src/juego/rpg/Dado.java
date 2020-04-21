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
import java.util.Random;

public class Dado {

    private int caras;

    public Dado(int cantCaras) {
        caras = cantCaras;

    }

    public int tirarDado() {
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(this.caras) + 1;
        return resultado;
    }


    
    
    
    
}
