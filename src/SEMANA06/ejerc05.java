/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc05 {
    public static void main(String[] args) {
        String cad = LocalDateTime.now().toString();
        Scanner test = new Scanner(cad);
        test.useDelimiter("-");
        while(test.hasNext()){
            System.out.println(test.next());
        }
        System.out.println(cad);
    }
}
