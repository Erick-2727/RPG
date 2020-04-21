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

    public Personaje(String nomb, String clase) {
        this.nombre = nomb;
        switch (clase) {
            case "Guerrero":
                this.clase = "Guerrero";
                this.daño = 20;
                this.critico = 15;
                this.vida = 100;
                this.evasion = 15;
                this.arma = new Arma("Hacha");
                break;
            case "Hechicero":
                this.clase = "Hechicero";
                this.daño = 15;
                this.critico = 25;
                this.vida = 100;
                this.evasion = 10;
                this.arma = new Arma("Hechizo");
                break;
            case "Cazador":
                this.clase = "Cazador";
                this.daño = 10;
                this.critico = 25;
                this.vida = 100;
                this.evasion = 20;
                this.arma = new Arma("Arco");
                break;
            case "Asesino":
                this.daño = 10;
                this.critico = 15;
                this.vida = 100;
                this.evasion = 15;
                this.arma = new Arma("Hacha");
                break;
        }
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
        return this.vida;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getClase() {
        return this.clase;
    }

}
