/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAMEN2;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class computo {
    static void mostrarvec(int vec[]){
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
    static void insercion(int vec[]){
        int temp, cond;
        for (int i = 1; i < vec.length; i++) {
            temp = vec[i];
            cond = i-1;
            while(cond>-1&&vec[cond]>temp){
                vec[cond+1] = vec[cond];
                cond--;
            }
            vec[cond+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] computo = {5,7,8,4,3,2,1};
        mostrarvec(computo);
        insercion(computo);
        System.out.println("\n");
        mostrarvec(computo);
    }
}
