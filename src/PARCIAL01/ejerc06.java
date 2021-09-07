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
public class ejerc06 {
    static void Rellenar(int matriz[][]){
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = r.nextInt(99)+1;
            }
            
        }
    }
    static void Mostrar(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    static void RellenarBit(int matriz[][], int bit[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if((matriz[i][j])%2==0){
                    bit[i][j]=1;
                }else{
                    bit[i][j]=0;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int[][] matriz = new int[5][8];
        int[][] bit = new int[matriz.length][matriz[0].length];
        Rellenar(matriz);
        Mostrar(matriz);
        System.out.println("\n");
        RellenarBit(matriz,bit);
        Mostrar(bit);
    }
}
