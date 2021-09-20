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
class Animal{
    String viven;
    boolean pelo;
    int pata;
    public Animal(String v, boolean pe, int pa){
        this.viven = v;
        this.pelo = pe;
        this.pata = pa;
    }
}
class dog extends Animal{
    String name;
    public dog(String v, boolean pe, int pa, String n){
        super(v,pe,pa);
        this.name = n;
    }
}
class conejo extends Animal{
    String name;
    public conejo(String v, boolean pe, int pa, String n){
        super(v,pe,pa);
        this.name = n;
    }
}
public class ejerc {
    public static void main(String[] args) {
        dog d1 = new dog("Tierra", true, 4, "Bobby");
        conejo c1 = new conejo("Tierra", true, 4, "Box");
    }
}
