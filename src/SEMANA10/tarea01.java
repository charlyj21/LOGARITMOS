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
public class tarea01 {
    public static void main(String[] args) {
        float n = 5;
        float salida = factorial(n);
        System.out.println("Fact: "+salida);
    }
    static float factorial(float n){
        float res = 1;
        if(n==0){
            return 1;
        }else{
            res = n*factorial(n-1);
        }
        return res;
    }
}
