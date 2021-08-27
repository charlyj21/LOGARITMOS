/*
    5-Diseñar un algoritmo para la lectura de 20 números y que 
    nos muestre la media de todos los números leídos y cuál ha 
    sido el más pequeño.
 */
package SEMANA03.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc05 {
    public static void main(String[] args) {
        Random r = new Random();
        int num, media=0, menor=99999;
        System.out.println("Ingrese 20 numeros:");
        for (int i = 0; i < 20; i++) {
            num = r.nextInt(100)+1;
            System.out.println((i+1)+":\t"+num);
            media+=num;
            if(num<menor){
                menor=num;
            }
        }
        media/=20;
        System.out.println("\nMedia:\t"+media);
        System.out.println("Menor:\t"+menor);
    }
}