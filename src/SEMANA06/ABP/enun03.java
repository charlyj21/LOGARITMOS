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
class ClaseBase{
    void loggin(){
        System.out.println("Iniciando");
    }
}
interface Interface1{
    void user();
}
interface Interface2{
    void pass();
}
interface Interface3{
    void error();
}
class ClaseDerivada extends ClaseBase implements Interface1,Interface2,Interface3{

    @Override
    public void user() {
        System.out.println("Ingrese usuario: ");
    }

    @Override
    public void pass() {
        System.out.println("Ingrese password: ");
    }

    @Override
    public void error() {
        System.out.println("Error al iniciar sesion.");
    }
    
}
public class enun03 {
    public static void main(String[] args) {
        ClaseDerivada cd = new ClaseDerivada();
        cd.user();
        cd.pass();
        cd.loggin();
        cd.error();
    }
}
