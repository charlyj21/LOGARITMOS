/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAMEN2;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
abstract class tablet{
    abstract void prender();
    abstract void apagar();
}
class celular extends tablet{
    @Override
    void prender(){
        System.out.println("Prendiendo...");
    }
    @Override
    void apagar(){
        System.out.println("Apagando...");
    }
}
public class ejerc05 {
    public static void main(String[] args) {
        celular c1 = new celular();
        celular c2 = new celular();
        c1.prender();
        c1.apagar();
        c2.prender();
    }
}
