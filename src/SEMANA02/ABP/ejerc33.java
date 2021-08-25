/*
    33) Un negocio de copias tiene un limite de producción diaria 
    de 10 000 copias si el tipo de impresión es offset y de 50 000 
    si el tipo es estándar. Si hay una solicitud de un el empleado 
    tiene que verificar que las copias pendientes hasta el momento y 
    las copias solicitadas no excedan del limite de producción. Si el 
    limite de producción se excediera el trabajo solicitado no podría 
    ser aceptado. El empleado necesita llevar un buen control de las 
    copias solicitadas hasta el momento para decidir en forma rápida 
    si los trabajos que se soliciten en el día se deben aceptar o no.

 */
package SEMANA02.ABP;

import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc33 {
    public static void main(String[] args) {
        int entrada;
        float limite=10000.0f, estandar=1.0f, offset=0.20f; //1=standar | 0.25=offset
        float variable=0;
        boolean op=true;
        Scanner test = new Scanner(System.in);
        
        do{
            if((limite/offset)<1){
                System.out.println("Limite maximo alcanzado.");
                break;
            }
            variable=0;
            entrada=0;
            System.out.println("\tCOPIAS");
            System.out.println("(1)Agregar copias.");
            System.out.println("(2)Salir.");
            System.out.print("-----> ");
            entrada = test.nextInt();
            if(entrada==1){
                System.out.println("\tTIPO DE COPIA\t");
                System.out.println("(1)Offset.\tSTOCK: ("+(int)(limite/offset)+"/"+"50000)");
                System.out.println("(2)Estandar.\tSTOCK: ("+(int)(limite/estandar)+"/"+"10000)");
                System.out.print("-----> ");
                entrada = test.nextInt();
                if(entrada==1){
                    System.out.print("Ingrese cantidad: ");
                    entrada = test.nextInt();
                    variable=entrada*offset;
                    if(variable<=limite){
                        limite=limite-variable;
                        System.out.println("Copias entregadas. . .");
                    }else{
                        System.out.println("La cantidad excede el limite.");
                    }
                }else if(entrada==2){
                    System.out.print("Ingrese cantidad: ");
                    entrada = test.nextInt();
                    variable=entrada*estandar;
                    if(variable<=limite){
                        limite=limite-variable;
                        System.out.println("Copias entregadas. . .");
                    }else{
                        System.out.println("La cantidad excede el limite.");
                    }
                }else{
                    System.out.println("[ERROR]Ingrese una opcion correcta.");
                }
            }else{
                System.out.println("Saliendo. . .");
                break;
            }
        }while(op=true);
    }
}
