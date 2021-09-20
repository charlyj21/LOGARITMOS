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
final class configuracion{
    String user;
    String pass;
    final int estado = 100;
    void setestado(int x){
        //this.estado = x;
    }
}
class Automotriz{
    String motor;
    String nroruedas;
    int nroasientos;
    String datos(){
        return this.motor+this.nroruedas+this.nroasientos;
    }
    final String saludo(){
        return "Dios te bendiga";
    }
}
class Auto extends Automotriz{
    String color;
}
public class ejerc11 {
    
}
