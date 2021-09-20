/*
    1-Crear una matriz de 3×3 con los números del 1 al 9. 
    Mostrar por pantalla, tal como aparece en la matriz
 */
package SEMANA04.ABP;

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
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        mostrar(matriz);
    }
}
