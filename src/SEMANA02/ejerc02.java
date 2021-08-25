/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA02;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class ejerc02 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int num, sumatoria=0;
        boolean op=true;
        String entrada="";
        while(op){
            System.out.print("Ingresar num: ");
            num=test.nextInt();
            sumatoria+=num;
            test.nextLine();
            System.out.println("¿Desea continuar? S/N");
            entrada=test.nextLine();
            if(entrada.equalsIgnoreCase("S")){
                op=true;
            }else{
                op=false;
            }
        }
        System.out.println("La sumatoria es: "+sumatoria);
    }
}
