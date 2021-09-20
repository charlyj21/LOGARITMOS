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

//METODOS SOBRECARGADOS
class Laptop{
    String nombre;
    int precio;
    String marca;
    String mostrar(){
        return this.nombre;
    }
    String mostrar(String n){
        return n+this.nombre;
    }
    String mostrar(String n, String m){
        return m+n+this.nombre;
    }
    String mostrar(String n, String m, String r){
        return r+m+n+this.nombre;
    }
}
public class ejerc06 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
    }
}
