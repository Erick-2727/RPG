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

    private int cantCaras;
    private int dados;
    private String tipo;

    public Arma(String tip) {
        switch (tip) {
            case "Hacha":
                tipo = "Hacha";
                cantCaras = 6;
                dados = 2;
                break;
            case "Hechizo":
                tipo = "Hechizo";
                cantCaras = 3;
                dados = 3;
                break;
            case "Espada":
                tipo = "Espada";
                cantCaras = 6;
                dados = 2;
                break;
            case "Arco":
                tipo = "Arco";
                cantCaras = 2;
                dados = 4;
                break;

        }
    }

    public int haceDaño(int dañoPj) {
        Dado d = new Dado(this.cantCaras);
        double b = 0;
        for (int i = 0; i < this.dados; i++) {
            b = b + d.tirarDado();
        }
        b = b + dañoPj;
        return (int) b;
    }

    public String getTipo() {
        return this.tipo;
    }

}
