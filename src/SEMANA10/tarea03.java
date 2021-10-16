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
public class tarea03 {
    public static void main(String[] args) {
        int n = 4;
        int salida = fib(n);
        System.out.println(salida);
    }
    static int fib(int n){
        int res=0;
        if((n==0)||(n==1)){
            return 1;
        }else{
            res = n + fib(n-1)+fib(n-2);
        }
        return res;
    }
}
