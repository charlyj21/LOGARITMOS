/*

    •Enunciado 3
    La clase productos deberá tener los siguientes atributos: Código, descripción, cantidad y precio unitario 
    Crear una aplicación que realice los siguientes cálculos: 
    -Calcular el precio total (cantidad por el precio) 
    -Calcular el igv 
    -Calcular el total

 */
package SEMANA01.ABP;

import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class productos {
    static long codigo;
    static String descripcion;
    static int cantidad;
    static float precioUnitario;
    static void CalTotal(int cant, float precioU){
        float preTotal=cant*precioU;
        float igv=((preTotal*18)/100);
        float pagar= preTotal+igv;
        System.out.println(pagar);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese codigo: ");
        codigo=sc.nextLong();
        sc.nextLine();  //limpiar buffer
        System.out.println("Ingrese la descripcion: ");
        descripcion=sc.nextLine();
        System.out.println("Ingrese la cantidad: ");
        cantidad=sc.nextInt();
        System.out.println("Ingrese el precio unitario: ");
        precioUnitario=sc.nextFloat();
        //////////////////////////////////////////////////
        System.out.println("********************************************");
        System.out.println("Codigo:\t\t\t"+codigo);
        System.out.println("Descripcion:\t\t"+descripcion);
        System.out.println("Cantidad:\t\t"+cantidad);
        System.out.println("Precio por unidad:\t"+precioUnitario);
        System.out.print("Precio total a pagar:\t");
        CalTotal(cantidad,precioUnitario);
        System.out.println("********************************************");
    }
}