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
class Persona{
    //atributos
    String name;
    int old;
    //metodos
    void saludar(){
            
    }
    void caminar(){
        
    }
}
public class ejerc01 {
    public static void main(String[] args) {
        Persona p1 = new Persona();     //objeto o instancia de persona
        Persona p2 = new Persona();
        Object o1 = p1;
        p1.caminar();
        p2.caminar();
    }
}
