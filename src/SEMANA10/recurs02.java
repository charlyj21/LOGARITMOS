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
public class recurs02 {
    public static void main(String[] args) {
        int resp = func(8);
        System.out.println(resp);
    }
    static int func(int n){
        int resp;
        resp = n*func(n-1);
        return resp;
    }
}
