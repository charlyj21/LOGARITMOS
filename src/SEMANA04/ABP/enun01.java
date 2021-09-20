/*
    Enunciado 01:
    Nos piden crear una matriz de 4x4 de números enteros que 
    inicialmente esta vacía, nos piden hacer un menú con estas 
    opciones:
    • Rellenar TODA la matriz de números, debes pedírselo al usuario.
    • Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
    • Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
    • Sumar la diagonal principal (ver ejemplo)
    • Sumar la diagonal inversa (ver ejemplo)
    • La media de todos los valores de la matriz
    IMPORTANTE: hasta que no se haga la primera opción, el resto de
    opciones no se deberán de ejecutar, simplemente mostrar un mensaje
    donde diga que debes rellenar la matriz.
 */
package SEMANA04.ABP;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class enun01 {
    static Random r = new Random();
    static Scanner leer = new Scanner(System.in);
    static int menu(int m[][]){
        int op;
        mostrar(m);
        System.out.println("\tM E N U");
        System.out.println("Elija una opcion:");
        System.out.println("(1) Rellenar matriz.");
        System.out.println("(2) Sumar una fila.");
        System.out.println("(3) Sumar una columna.");
        System.out.println("(4) Sumar diagonal principal.");
        System.out.println("(5) Sumar diagonal inversa.");
        System.out.println("(6) Mostrar media de la matriz.");
        System.out.println("(7) Salir.");
        System.out.print("-----> ");
        op = leer.nextInt();
        return op;
    }
    static void mostrar(int v[][]){
        System.out.print("\n\t");
        for (int i = 0; i < v.length; i++) {
            System.out.print("["+(i+1)+"]\t"); //columnas
        }
        System.out.println("\n");
        for (int i = 0; i < v.length; i++) {
            System.out.print("["+(i+1)+"]\t"); //filas
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
    static void sumaFila(int m[][]){
        int op, sumaF = 0;
        do{
            System.out.print("Ingrese numero de fila: ");
            op = leer.nextInt();
            if(op<0||op>m.length){
                System.out.print("*Elija una fila correcta ");
                for (int i = 0; i < m.length; i++) {
                    System.out.print("["+(i+1)+"]");
                }
                System.out.println("*");
            }
        }while(op<0||op>m.length);
        System.out.println("\nSumando fila "+op);
        for (int i = 0; i < m[0].length; i++) {
            System.out.print(m[op-1][i]+" + ");
            sumaF += m[op-1][i];
        }
        System.out.println(" = "+sumaF);
    }
    static void sumaColumna(int m[][]){
        int op, sumaC = 0;
        do{
            System.out.print("Ingrese numero de columna: ");
            op = leer.nextInt();
            if(op<0||op>m[0].length){
                System.out.print("*Elija una columna correcta ");
                for (int i = 0; i < m[0].length; i++) {
                    System.out.print("["+(i+1)+"]");
                }
                System.out.println("*");
            }
        }while(op<0||op>m[0].length);
        System.out.println("\nSumando columna "+op);
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][op-1]+" + ");
            sumaC += m[i][op-1];
        }
        System.out.println(" = "+sumaC);
    }
    static void sumaDPrincipal(int m[][]){
        int sumaDP = 0;
        System.out.println("\nSumando diagonal principal");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i==j){
                    System.out.print(m[i][j]+" + ");
                    sumaDP += m[i][j];
                }
            }
        }
        System.out.println(" = "+sumaDP);
    }
    static void sumaDInversa(int m[][]){
        int sumaDI = 0;
        System.out.println("\nSumando diagonal inversa");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if((i+j)==(m.length-1)){
                    System.out.print(m[i][j]+" + ");
                    sumaDI += m[i][j];
                }
            }
        }
        System.out.println(" = "+sumaDI);
    }
    static void media(int m[][]){
        float mediaM = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                mediaM += m[i][j];
            }
        }
        mediaM = (mediaM/((m.length)*(m[0].length)));
        System.out.println("\nLa media de la matriz es: "+mediaM);
    }
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int op;
        do{
            op = menu(matriz);
            if(op!=1&&op!=7)
                System.out.println("Debe rellenar la matriz primero.");
        }while(op!=1&&op!=7);
        while(op!=7){
            switch(op){
                case 1:
                    llenar(matriz);
                    break;
                case 2:
                    sumaFila(matriz);
                    break;
                case 3:
                    sumaColumna(matriz);
                    break;
                case 4:
                    sumaDPrincipal(matriz);
                    break;
                case 5:
                    sumaDInversa(matriz);
                    break;
                case 6:
                    media(matriz);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta"
                            + " [1][2][3][4][5][6][7]");
           }
           op = menu(matriz);
        }
    }
}
