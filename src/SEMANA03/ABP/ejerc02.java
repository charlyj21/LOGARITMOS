package SEMANA03.ABP;


import java.util.Scanner;

/*
    2-Diseñar un algoritmo que lea dos números y realice la suma 
    de todos los números pares comprendidos entre ambos números.
 */

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc02 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int num1, num2, menor=0, mayor=0, acum=0;
        System.out.println("\tSUMA DE PARES ENTRE DOS NUMEROS");
        System.out.println("Ingrese dos num: ");
        num1 = test.nextInt();
        num2 = test.nextInt();
        if(num1==num2){
            System.out.println("[ERROR]Los numeros"
                    + " son iguales");
        }else if(num1>num2){
            mayor=num1;
            menor=num2;
        }else{
            mayor=num2;
            menor=num1;
        }
        System.out.println("Suma:");
        for (int i = (menor+1); i < mayor; i++) {
            if((i%2)==0){
                System.out.println(i+"+");
                acum+=i;
            }
        }
        System.out.println("= "+acum);
    }
}