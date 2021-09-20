/*
    3-	Crear dos matrices de nxn y sumar sus valores, los 
    resultados se deben almacenar en otra matriz. Los valores 
    y la longitud, seran insertados por el usuario. Mostrar las 
    matrices originales y el resultado.
 */
package SEMANA04.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc03 {
    static Random r = new Random();
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
                v[i][j] = r.nextInt(49)+1;
            }
        }
    }
    static void sumarM(int mA[][], int mB[][], int mC[][]){
        for (int i = 0; i < mC.length; i++) {
            for (int j = 0; j < mC[0].length; j++) {
                mC[i][j] = mA[i][j] + mB[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int n = r.nextInt(10)+2;
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];
        int[][] matrizC = new int[n][n];
        llenar(matrizA);
        llenar(matrizB);
        mostrar(matrizA);
        System.out.println("\n");
        mostrar(matrizB);
        System.out.println("\n");
        sumarM(matrizA,matrizB,matrizC);
        mostrar(matrizC);
    }
}
