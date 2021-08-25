/*
    El numero seria : -2
 */
package SEMANA02;

import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class tarea05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x=0, p;
        p = leer.nextInt();
        while(p<=7){
            x=x+1;
            p=p+1;
        }
        System.out.println("El valor de x es: "+x);
    }
}