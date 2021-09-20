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
class Perro{
    String nombre;
    int edad;
    String raza;
    public Perro(){
        this.nombre = " ";
        this.edad = 0;
    }
    public Perro(String n){
        this.nombre = n;
        this.edad = 0;
    }
    public Perro(String n, int e){
        this.nombre = n;
        this.edad = e;
    }
    public Perro(String n, int e, String r){
        this.nombre = n;
        this.edad = e;
        this.raza = r;
    }
    String MostrarDato(){
        return "Nombre: "+this.nombre+"Edad: "+this.edad;
    }
}
public class ejerc04 {
    Perro p1 = new Perro();
    Perro p2 = new Perro("Fido");
    Perro p3 = new Perro("Luna",8);
    Perro p4 = new Perro("Bobby",1,"Criollo");
}
