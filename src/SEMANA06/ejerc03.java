/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class miclase<x>{
    x a;
    x b;

    public miclase(x a, x b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "miclase{" + "a=" + a + ", b=" + b + '}';
    }
    
}
public class ejerc03 {
    public static void main(String[] args) {
        miclase<Integer> a1 = new miclase<>(10,5);
        //miclase<String> //se puede comportar de todos los tipos
    }
}
