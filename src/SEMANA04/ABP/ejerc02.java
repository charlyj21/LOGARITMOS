/*
    2-Crear una matriz de 5 filas y n columnas (se pide al usuario). 
    Rellenarlo con números aleatorios entre 0 y 10.
 */
package SEMANA04.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc02 {
    static Random r = new Random();
    static void mostrar(int v[][]){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.println("");
        }
    }
    static void llenar(int v[][]){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                v[i][j] = r.nextInt(9)+1;
            }
        }
    }
    public static void main(String[] args) {
        int n = r.nextInt(10)+1;
        int[][] matriz = new int[5][n];
        llenar(matriz);
        mostrar(matriz);
    }
}
