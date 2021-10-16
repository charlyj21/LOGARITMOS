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
public class tarea02 {
    public static void main(String[] args) {
        int x = 4, n = 2;
        int salida = func(5,4);
        System.out.println(salida);
    }
    static int func(int x,int n){
        int res = 1;
        if(n==1){
            return 4;
        }else{
            res = ((int)Math.pow(x,n))*func(x,n-1);
        }
        return res;
    }
}
