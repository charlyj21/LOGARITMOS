/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01;

/**
 *
 * @author carlo
 */
import java.util.Scanner;
//hallar el area y perimetro de un cuadrado

//PARA SCANNER: CONTROL + BARRA ESPACIADORA SIN LIBRERIA
public class ejerc06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //variables
        float lado;
        float area, perimetro;
        //proceso
        System.out.println("Ingrese lado del cuadrado: ");
        lado=sc.nextFloat();
        area=lado*lado;
        perimetro=lado*4;
        //respuesta
        System.out.println("El area es: "+area+" u^2");
        System.out.println("El perimetro es: "+perimetro+" u");
    }
}
