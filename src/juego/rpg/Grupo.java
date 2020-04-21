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
public class Grupo {

    Personaje[] group;
    String nombre;
    Dado d=new Dado(3);

    public Grupo(Personaje pj1, Personaje pj2, Personaje pj3,String name) {
        Personaje[] p = {pj1, pj2, pj3};
        this.group = p;
        this.nombre=name;
    }
    public void luchaContra(Grupo g2){
        boolean b=true;
        int i=0,g;
        
        System.out.println("Lucharan hasta la muerte los grupos: ");
       System.out.println(this.participantes());
    System.out.println(g2.participantes());
        System.out.println("");
    while (b) {
        if (this.group[i].vivo()) {
        g=d.tirarDado()-1;
        System.out.println(this.group[i].atacaA(g2.group[g]));
        }
        if (g2.group[i].vivo()){
         g=d.tirarDado()-1;
        System.out.println(g2.group[i].atacaA(this.group[g]));
        }
           System.out.println(this.estadoGrupo());
            System.out.println(g2.estadoGrupo());
            System.out.println("");
           i= (i + 1) % 3;
           b=this.vivos()&&g2.vivos();
        }  
    }
    public boolean vivos(){
    return this.group[0].vivo()||this.group[1].vivo()||this.group[2].vivo();
    }

    public Personaje[] getGroup() {
        return group;
    }
    public String participantes(){
    String r,p="";
    
    r=this.nombre + " formado por:";
        for (int i = 0; i < this.group.length; i++) {
            p="el";
            if (this.group[i].getSexo()=='a') {
             p="la";   
            }
         r=r+" " +this.group[i].getNombre() + " "+p + " "
            + this.group[i].getClase() + ", ";  } 
        
    
    return r;
    }

    public String getNombre() {
        return nombre;
    }
    public String estadoGrupo(){
        String r;
        r=" " +this.group[0].estado() + ", "
            + this.group[1].estado() + ", "+ this.group[2].estado(); 
   
    return r;
    }
    
}
