/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA03;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class OrdenMatriz {
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
}
