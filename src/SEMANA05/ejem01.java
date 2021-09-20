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
public class ejem01 {
    public class Empleado {     //Inicio de la clase
    //Declaración de atributos
    int codigo;
    String nombre;
    int horas;
    double tarifa;
    double sueldo;
    
    //Declaración de métodos
    String datosPersonales(){
        return "Codigo: "+codigo+"\nNombre: "+nombre;
    }
    double calculaSueldo(){
        return horas*tarifa;
    }
    }                           //Fin de clase
    
}
