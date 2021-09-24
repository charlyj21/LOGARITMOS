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
interface InterfaceA{
    void ejecutar();
}
interface InterfaceB{
    void leer();
}
class ClassA{
    void editar(){
        System.out.println("Editando");
    }
}
class ClassB extends ClassA implements InterfaceA,InterfaceB{
    void probando(){
        System.out.println("Prueba");
    }
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando");
    }

    @Override
    public void leer() {
        System.out.println("Leyendo");
    }
}
public class enun01 {
    public static void main(String[] args) {
        ClassB o1 = new ClassB();
        o1.probando();
        o1.ejecutar();
        o1.leer();
        o1.editar();
    }
}
