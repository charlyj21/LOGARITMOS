/*
    6-Realizar un algoritmo para un programa que lea 15 números 
    y nos diga cuántos de ellos son primos. De cara a la lectura 
    de los números, si el número introducido es negativo se le 
    deberá volver a pedir de nuevo el número hasta que se 
    introduzca uno positivo.
 */
package SEMANA03.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc06 {
    public static void main(String[] args) {
        Random r = new Random();
        int num, nprimos=0, cont;
        System.out.println("\tNUMEROS PRIMOS");
        for (int i = 0; i < 15; i++) {
            cont=0;
            num = r.nextInt(100)+1;
            System.out.println((i+1)+":\t"+num);
            for (int j = 1; j <= num; j++) {
                if((num%j)==0){
                    cont++;
                }
            }
            if(cont==2){
                nprimos++;
            }
        }
        System.out.println("\nHay "+nprimos+" numeros primos.");
    }
}