/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.rpg;

import java.util.Random;

/**
 *
 * @author Erick
 */
public class Personaje {

    private int daño;
    private Arma arma;
    private String nombre;
    private int critico;
    private int vida;
    private int evasion;
    private String clase;
    private char sexo;

    public Personaje(String nomb,String clas,int dañ,int critic,int hp,int eva,String weapon,char se) {
        this.nombre = nomb;
        this.clase = clas;
        this.daño = dañ;
        this.critico = critic;
        this.vida = hp;
        this.evasion = eva;
        this.arma = new Arma(weapon);
        this.sexo=se;
        
    }

    public int obtenerDaño() {

        return this.arma.haceDaño(this.daño);
    }

    public void dañoRecibido(int dañoRec) {
        this.vida = this.vida - dañoRec;

    }

    public boolean vivo() {

        return this.vida > 0;
    }

    public String atacaA(Personaje enemigo) {
        String resultado;
        Random aleatorio = new Random();
        int dañ, esquiva = aleatorio.nextInt(100) + 1;
        if (enemigo.vivo()) {
            if (esquiva <= enemigo.evasion) {
                resultado = "El " + enemigo.clase + " " + enemigo.nombre + " esquiva el ataque de el " + this.clase + " " + this.nombre + " como un campeon";
            } else {
                dañ = this.obtenerDaño();
                int probCritico = aleatorio.nextInt(100) + 1;
                if (this.critico >= probCritico) {
                    dañ = (int) (dañ * 1.5);
                    enemigo.dañoRecibido(dañ);
                    resultado = enemigo.nombre + ", " + this.nombre + " te partio la madre con un critico de " + dañ + "";
                } else {
                    enemigo.dañoRecibido(dañ);
                    resultado = "El " + enemigo.clase + " " + enemigo.nombre + " recibe " + dañ + " de daño de el " + this.clase + " " + this.nombre + "";
                }
            }
        } else {
            resultado = enemigo.nombre + " se muricio ";
        }

        return resultado;

    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }

    public char getSexo() {
        return sexo;
    }
    public String estado(){
        String r;
        if (this.vivo()) {
            r= this.nombre+" Vida:" +this.vida;
        }else{
        r= this.nombre+" Muerto";
        }
    return r;
    }
    

}
