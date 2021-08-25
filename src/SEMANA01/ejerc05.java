/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA01;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
import java.util.Scanner;
//hallar la distancia sabiendo que v=d/t
public class ejerc05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //variables
        float velocidad, tiempo; //variables de entrada
        float distancia; //variable de salida
        //proceso
        System.out.println("Ingresar velocidad");
        velocidad=sc.nextFloat();
        System.out.println("Ingresar tiempo");
        tiempo=sc.nextFloat();
        distancia=velocidad*tiempo;
        //respuesta
        System.out.println("La distancia es: "+distancia);
    }
}