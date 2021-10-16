/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA10;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class recursividad {
    public static void main(String[] args) {
        //la suma de un numero ingresado de N=8 -> suma=8+7+6+5+4+3+2+1=36
        int n = 8;
        int resp = sumar(8);
        System.out.println("La suma es: "+resp);
    }
    static int sumar(int n){
        int sum = 0;
        if(n==1){
            return 1;
        }else{
            sum += n+sumar(n-1);
        }
        
        return sum;
    }
}
