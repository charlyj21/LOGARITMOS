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
public class ejerc01 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int a, b;
        System.out.print("Ingresar A: ");
        a=test.nextInt();
        System.out.print("Ingresar B: ");
        b=test.nextInt();
        if(a==b){
            System.out.println(a+" es igual a "+b);
        }else{
            if(a>b){
                System.out.println(a+" es mayor a "+b);
            }else{
                System.out.println(b+" es mayor a "+a);
            }
        }
    }
}
