/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class teclado{
    String leer() throws IOException{
        String cad = "";
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        cad = br.readLine();
        br.close();
        return cad;
    }
}
public class excp04 {
    public static void main(String[] args) throws IOException{
        teclado tecla = new teclado();
        System.out.println("Escribir su nombre");
        String cad = tecla.leer();
        System.out.println("Buenos dias "+cad);
    }
}
