/*
    4-	Mostrar la diagonal principal de una matriz, sabiendo
    que la diagonal solo se encuentra en una matriz cuadrática. 
 */
package SEMANA04.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc04 {
    static Random r = new Random();
    static void diagonalB(int m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i==j)
                    System.out.print("["+m[i][j]+"]\t");
            }
        }
    }
    static void diagonalA(int m[][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i==j)
                    System.out.print(m[i][j]+"\t");
                else
                    System.out.print(" \t");
            }
            System.out.println("\n");
        }
    }
    static void mostrar(int v[][]){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                System.out.print(v[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    static void llenar(int v[][]){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                v[i][j] = r.nextInt(99)+1;
            }
        }
    }
    public static void main(String[] args) {
        int n = r.nextInt(6)+3;
        int[][] matriz = new int[n][n];
        llenar(matriz);
        mostrar(matriz);
        System.out.println("\n");
        diagonalA(matriz);
        System.out.println("\n");
        diagonalB(matriz);
        System.out.println("\n");
    }
}
