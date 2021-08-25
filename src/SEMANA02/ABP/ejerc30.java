/*
    30) Una persona que va de compras a la tienda “Enano, S.A.”, 
    decide llevar un control sobre lo que va comprando, para saber 
    la cantidad de dinero que tendrá que pagar al llegar a la caja. 
    La tienda tiene una promoción del 20% de descuento sobre aquellos 
    artículos cuya etiqueta sea roja. Determinar la cantidad de dinero 
    que esta persona deberá pagar.
 */
package SEMANA02.ABP;

import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc30 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        String tienda = "Enano. S.A.";
        float total=0, acumulador=0, variable=0;
        float descuento=20;
        int entrada;
        
        do{
            variable = 0;
            acumulador = 0;
            System.out.println("\n"+tienda+"\tCarrito: "+total);
            System.out.println("1.Agregar producto.");
            System.out.println("2.Terminar compra.");
            System.out.print("-----> ");
            entrada = test.nextInt();
            
            if(entrada==1){
                System.out.print("Ingrese costo: ");
                acumulador = test.nextFloat();
                do{
                    System.out.println("¿Tiene etiqueta roja? (1)SI (2)NO");
                    entrada = test.nextInt();
                    if(entrada==1){
                        variable = ((acumulador*descuento)/100);
                        acumulador = acumulador-variable;
                        total = total+acumulador;
                        System.out.println("Aplicando descuento. . .");
                        break;
                    }else if(entrada==2){
                        total = total+acumulador;
                        break;
                    }else{
                        System.out.println("[ERROR]Ingrese una opcion correcta.");
                    }   
                }while(true);
            }else if(entrada==2){
                System.out.println("Terminando compra. . .");
                System.out.println("Monto total a pagar: "+total);
                break;
            }else{
                System.out.println("[ERROR]Ingrese una opcion correcta.");
            }
        }while(true);
    }
}