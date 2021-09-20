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
interface saludo{
    void saludo();
    void darsaludo(String x);
}
public class ejerc8 {
    public static void main(String[] args) {
        saludo Espanol = new saludo(){
            @Override
            public void saludo() {
                System.out.println("HOLA");
            }

            @Override
            public void darsaludo(String x) {
                System.out.println("HOLA"+x);
            }
        };
        Espanol.saludo();
        Espanol.darsaludo("CLASES!!!");
    }
}
