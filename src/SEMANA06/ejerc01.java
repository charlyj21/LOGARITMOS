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
abstract class equipo{
    int nropersonas;
    String nombre;
    String datos(){
        return this.nombre+this.nropersonas;
    }
    abstract String modoTrabajo();
    abstract String lugar();
}
class gloria extends equipo{
    String modoTrabajo(){
        return "Virtual";
    }
    String lugar(){
        return "ONPE";
    }
}
public class ejerc01 {
    public static void main(String[] args) {
        equipo e1 = new gloria();
        //FALTA1line
    }
}
