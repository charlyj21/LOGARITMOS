/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA05;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class Lapiz{
    String marca;
    String size;
    public Lapiz(String m, String s){
        this.marca = m;
        this.size = s;
    }
    void pinta(){
        System.out.println("Pintando");
    };
}
class Lapicero extends Lapiz{
    String color;
    public Lapicero(String m, String s, String t){
        super(m,s);
        this.color = t;
    }
}
public class tarea01 {
    public static void main(String[] args) {
        Lapiz o1 = new Lapiz("Fabber Castell","Mediano");
        Lapicero l1 = new Lapicero("Pilot","Pequeño","Negro");
        l1.pinta();
    }
}
