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
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.nombre="Luis";
        System.out.println("Nombre: "+emp.nombre);
    }
}                           //Fin de clase
