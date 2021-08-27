/*
    4-Diseña un algoritmo para un programa que lea 10 textos y nos 
    muestre aquel que tenga el mayor número de caracteres. Si hay 
    más de un texto con el mismo número de caracteres, mostrará el 
    último de ellos. Puedes utilizar la función Longitud para este 
    ejercicio.
 */
package SEMANA03.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc04 {
    public static void main(String[] args) {
        Random r = new Random();
        char charRandom;
        String texto, mayor="";
        int sizecad, menor=0;
        for (int i = 0; i < 10; i++) {
            texto="";
            sizecad = r.nextInt(25)+10;
            for (int j = 0; j < sizecad; j++) {
                charRandom = (char)(r.nextInt(26)+'a');
                texto+=charRandom;
            }
            System.out.println("Texto "+(i+1)+":\n"+texto);
            if((texto.length())>=menor){
                mayor=texto;
                menor=(texto.length());
            }
        }
        System.out.println("\nTexto con mas caracteres:");
        System.out.println(mayor+"\nTiene "+menor+" caracteres.");
    }
}