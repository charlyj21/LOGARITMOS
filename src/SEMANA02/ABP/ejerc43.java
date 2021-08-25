/*
    43) Suponga que tiene usted una tienda y desea registrar
    las ventas en su computadora. Diseñe un algoritmo que lea 
    por cada cliente, el monto total de su compra. Al final del 
    día que escriba la cantidad total de ventas y el numero de 
    clientes atendidos.
 */
package SEMANA02.ABP;

import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc43 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int Nclientes=0;
        float total=0, acumulador=0;
        String entrada = "";
        boolean op=true;
        System.out.println("\tVentas del dia\t");
        do{
            System.out.print("¿Agregar cliente? S/N : ");
            entrada = test.nextLine();
            if(entrada.equalsIgnoreCase("S")){
                System.out.print("Ingrese monto de compra: ");
                acumulador=test.nextFloat();
                test.nextLine(); //limpiar buffer
                total=total+acumulador;
                Nclientes++;
                op=true;
            }else{
                op=false;
            }
        }while(op==true);
        System.out.println("===============");
        System.out.println("\tFin del dia\t");
        System.out.println("Total de venta:\t\t"+total);
        System.out.println("Clientes atendidos:\t"+Nclientes);
    }
}