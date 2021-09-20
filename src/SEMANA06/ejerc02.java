/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

import java.util.ArrayList;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(8);
        lista.add(4);
        lista.add(9);
        lista.add(2);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)+" ");
        }
    }
}
