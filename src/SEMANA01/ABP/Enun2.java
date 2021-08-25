/*

    •Enunciado 2 
    Crear una aplicación que calcule el área de un círculo.
    Según su criterio determine la clase (Atributos y/o métodos)

 */
package SEMANA01.ABP;

import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Flores Herrera, Carlos Jesús
 */
public class Enun2 {
    static double pi= 3.1416;
    static void CalAreaCir(float r){
        double area=(pi*(Math.pow(r,2)));
        System.out.println(area);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float radio;
        System.out.println("Ingrese el radio del circulo: ");
        radio=sc.nextFloat();
        System.out.println("El area del circulo es: ");
        CalAreaCir(radio);
    }
}
