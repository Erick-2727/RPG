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

        Personaje a, b,c,d,e,f;
        Grupo g1,g2;
        a = new Arquero("Larita",'a');
        b = new Mago("Dante",'o');
        c = new Guerrero("Mario",'o');
        d = new Mago("Franco",'o');
        e = new Arquero("Agente P",'o');
        f = new Guerrero("La Jesi",'a');
        g1= new Grupo(a,b,c,"Crusados");
        g2= new Grupo(f,e,d,"Imperiales");
        
        g1.luchaContra(g2);
        

    }

}
