/*
    8-Dado un array de dos dimensiones de 4x6, realizar un programa
    que lea 24 números y los coloque en el array. Posteriormente, se
    ordenará el array de menor a mayor (la posición 1,1 tendrá el
    número más pequeño, mientras que 4,6 tendrá el mayor) y se
    mostrará ordenado.
 */
package SEMANA03.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc08 {
    static void mostrar(int matriz[][]){
        for(int[] salida:matriz){
            for(int salida2:salida){
                System.out.print(salida2+"\t");
            }
            System.out.println("\n");
        }
    }
    static void ordenar(int matriz[][]){
        int temp;
        for (int i = 0; i < matriz.length; i++) { //filas
            for (int j = 0; j < matriz[0].length; j++) { //columnas
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz[0].length; l++) {
                        if((matriz[i][j])<(matriz[k][l])){
                            temp=matriz[k][l];
                            matriz[k][l]=matriz[i][j];
                            matriz[i][j]=temp;
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Random r = new Random();
        int[][] matriz = new int[4][6];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = r.nextInt(99)+1;
            }
        }
        System.out.println("\t\tMATRIZ 4X6");
        mostrar(matriz);
        ordenar(matriz);
        System.out.println("\n\t\tMATRIZ ORDENADA");
        mostrar(matriz);
    }
}