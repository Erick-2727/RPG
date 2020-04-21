package juego.rpg;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erick
 */
public class Arma {

    private Dado dado;
    private int cantDados;
    private String tipo;

    public Arma(String tip) {
        switch (tip) {
            case "Hacha":
                tipo = "Hacha";
                dado = new Dado(6);
                cantDados = 2;
                break;
            case "Hechizo":
                tipo = "Hechizo";
                dado = new Dado(3);
                cantDados = 3;
                break;
            case "Espada":
                tipo = "Espada";
                dado = new Dado(6);
                cantDados = 2;
                break;
            case "Arco":
                tipo = "Arco";
                dado = new Dado(2);
                cantDados = 4;
                break;

        }
    }

    public int haceDaño(int dañoPj) {
        
        double b = 0;
        for (int i = 0; i < this.cantDados; i++) {
            b = b + this.dado.tirarDado();
        }
        b = b + dañoPj;
        return (int) b;
    }

    public String getTipo() {
        return this.tipo;
    }

}
