/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06.ABP;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class Object{
    void iniciar(){
        System.out.println("Iniciando");
    }
}
interface Nomina{
    void terminar();
}
class Empleado extends Object implements Nomina{

    @Override
    public void terminar() {
        System.out.println("Terminando");
    }
    
}
public class enun02 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.iniciar();
        e1.terminar();
    }
}
