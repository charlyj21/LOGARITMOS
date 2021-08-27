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
public class displayMatriz2M {
    static void mostrar(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    static void mostrar2(int matriz[][]){
        for(int[] salida:matriz){
            for(int salida2:salida){
                System.out.print(salida2+"\t");
            }
            System.out.println("\n");
        }
    }
}
