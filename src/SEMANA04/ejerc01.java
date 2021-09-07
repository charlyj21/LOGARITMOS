/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA04;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc01 {
    static void mostrar(int v[][]){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] vector = new int[4][2];
        int[][] vector2 = {{2,3,5},{5,4,7},{7,8,9}};
        System.out.println(vector2[2][2]);
        mostrar(vector2);
    }
}
