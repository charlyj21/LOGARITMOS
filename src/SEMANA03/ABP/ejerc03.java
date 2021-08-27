/*
    3-Diseña un algoritmo para la lectura de 20 números y 
    que nos muestre la suma de los pares por un lado y la 
    de los impares por otro.
 */
package SEMANA03.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc03 {
    public static void main(String[] args) {
        Random r = new Random();
        int var, sumapar=0, sumaimpar=0;
        for (int i = 0; i < 20; i++) {
            var = r.nextInt(100)+1;
            System.out.println(var);
            if((var%2)==0){
                sumapar+=var;
            }else{
                sumaimpar+=var;
            }
        }
        System.out.println("Sum. pares:\t"+sumapar);
        System.out.println("Sum. impares:\t"+sumaimpar);
    }
}