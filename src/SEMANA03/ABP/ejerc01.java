/*
    1-Realiza el algoritmo correspondiente a un programa
    que lea un número y muestre un texto indicando si el número 
    es o no primo.
 */
package SEMANA03.ABP;

import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc01 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int numero, cont=0;
        System.out.println("\tNUMERO PRIMO O NO");
        do{
            System.out.print("Ingrese un numero: ");
            numero = test.nextInt();
            if(numero<=0){
                System.out.println("[ERROR]Ingrese un numero positivo");
            }
        }while(numero<=0);
        for (int i = 1; i <= numero; i++) {
            if((numero%i)==0){
                cont++;
            }
        }
        if(cont==2){
            System.out.println("El numero es primo.");
        }else{
            System.out.println("El numero no es primo.");
        }
    }
}