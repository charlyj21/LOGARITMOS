/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc07 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        Random r = new Random();
        int posi=0,nega=0,cero=0;
        int array[];
        array = new int[10];
        System.out.println("\t10 numeros");
        
        for (int i = 0; i < 10; i++) {
            array[i]=r.nextInt(100)-50;
            System.out.println("Numero "+(i+1)+": "+array[i]);
            
            if(array[i]>0){
                posi++;
            }else if(array[i]<0){
                nega++;
            }else{
                cero++;
            }
        }
        System.out.println("\nPositivos:\t"+posi);
        System.out.println("Negativos:\t"+nega);
        System.out.println("Ceros:\t\t"+cero);
    }
}
