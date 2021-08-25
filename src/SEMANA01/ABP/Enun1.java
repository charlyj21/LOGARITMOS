/*

    •Enunciado 1 
    Crear una aplicación que calcule la hipotenusa.
    Según su criterio determine la clase (Atributos y/o métodos) 

 */
package SEMANA01.ABP;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Flores Herrera, Carlos Jesús
 */
public class Enun1 {
    static void CalHipo(double c1, double c2){
        double hipo=(Math.sqrt(((Math.pow(c1,2))+(Math.pow(c2,2)))));
        System.out.println(hipo);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double cat1,cat2;    //entrada
        System.out.println("Ingrese primer cateto: ");
        cat1=sc.nextFloat();
        System.out.println("Ingrese segundo cateto: ");
        cat2=sc.nextFloat();
        System.out.println("La hipotenusa es: ");
        CalHipo(cat1,cat2);
    }
}