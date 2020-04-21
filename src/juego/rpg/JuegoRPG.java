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
public class JuegoRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Personaje a, b;
        a = new Cazador("Larita");
        b = new Mago("Dante");
        boolean vivos;
        vivos = true;
        System.out.println("El " + a.getClase() + " " + a.getNombre() + " y el " + b.getClase() + " " + b.getNombre() + " van a luchar");
        while (vivos) {
            System.out.println(a.atacaA(b));
            System.out.println(b.atacaA(a));
            vivos = (a.vivo() && b.vivo());
        }
        if (a.vivo()) {
            System.out.println(b.getNombre() + " esta muerto, " + a.getNombre() + " le corto la garganta de aqui a aca");

        } else {
            System.out.println(a.getNombre() + " esta muerto, " + b.getNombre() + " le corto la garganta de aqui a aca");
        }

    }

}
