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
interface valor{
    default void suspendido(){
        
    }
}
class computo implements valor{

    String marca;
    float precio;

    void prender() {

    }

    void apagar() {

    }
}

public class ejerc09 {

    public static void main(String[] args) {
        computo c1 = new computo() {
            @Override
            void prender() {
                System.out.println("PRENDIDO");
            }
            @Override
            void apagar() {
                System.out.println("APAGADO");
            }
            public void suspendido(){
                System.out.println("SUSPENDER");
            }
        };
        c1.suspendido();
    }
}
