/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PARCIAL01;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc05 {
    static void RellenarUV(int vector[]){
        Random r = new Random();
        int cont = 0, temp;
        
        while(cont<vector.length){
            temp = r.nextInt(99)+1;
            int i;
            for (i = 0; i < ((vector.length)-1); i++) {
                if(temp==vector[i]){
                    break;
                }
            }
            if(temp!=vector[i]){
                vector[cont++]=temp;
            }
        }
    }
    static void Mostrar(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    public static void main(String[] args) {
        int[] vector = new int[10];
        RellenarUV(vector);
        Mostrar(vector);
    }
}
