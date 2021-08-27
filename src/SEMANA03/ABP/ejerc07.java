/*
    7-Realizar un algoritmo para un programa que se encargue de 
    leer 10 textos y, posteriormente, nos muestre los textos ordenados 
    de menor a mayor número de caracteres. En caso de que dos textos 
    tengan el mismo número de caracteres, se pondrá primero el que 
    tenga mayor número de vocales. Para este algoritmo podemos 
    utilizar la función ObtenerLetra.
 */
package SEMANA03.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc07 {
    static void mostrar(String vector[]){
        for(String mostrar:vector){
            System.out.println(mostrar);
        }
    }
    static void ordenar(String vector[]){
        String temp;
        int cont1, cont2;
        for (int i = 0; i < vector.length; i++) {
            for (int j = (i+1); j < vector.length; j++) {
                if((vector[j].length())==(vector[i].length())){
                    cont1=0;
                    cont2=0;
                    for (int k = 0; k < (vector[j].length()); k++) {
                        if((vector[j].charAt(k)=='a')||(vector[j].charAt(k)=='e')||
                                (vector[j].charAt(k)=='i')||(vector[j].charAt(k)=='o')||
                                (vector[j].charAt(k)=='u')||(vector[j].charAt(k)=='A')||
                                (vector[j].charAt(k)=='E')||(vector[j].charAt(k)=='I')||
                                (vector[j].charAt(k)=='O')||(vector[j].charAt(k)=='U')){
                            cont1++;
                        }
                        if((vector[i].charAt(k)=='a')||(vector[i].charAt(k)=='e')||
                                (vector[i].charAt(k)=='i')||(vector[i].charAt(k)=='o')||
                                (vector[i].charAt(k)=='u')||(vector[i].charAt(k)=='A')||
                                (vector[i].charAt(k)=='E')||(vector[i].charAt(k)=='I')||
                                (vector[i].charAt(k)=='O')||(vector[i].charAt(k)=='U')){
                            cont2++;
                        }
                        if(cont1>cont2){
                            temp=vector[i];
                            vector[i]=vector[j];
                            vector[j]=temp;
                        }else if(cont2<cont1){
                            temp=vector[j];
                            vector[j]=vector[i];
                            vector[i]=temp;
                        }
                    }
                }else if((vector[j].length())<(vector[i].length())){
                    temp=vector[i];
                    vector[i]=vector[j];
                    vector[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Random r = new Random();
        char charRandom;
        String texto;
        int sizecad;
        String cadenas[] = new String[10];
        for (int i = 0; i < 10; i++) {
            texto="";
            sizecad = r.nextInt(25)+10;
            for (int j = 0; j < sizecad; j++) {
                charRandom = (char)(r.nextInt(26)+'a');
                texto+=charRandom;
            }
            cadenas[i]=texto;
            System.out.println("Texto "+(i+1)+":\n"+texto);
        }
        ordenar(cadenas);
        System.out.println("\nOrden de menor a mayor caract:");
        System.out.println("Si tienen igual caracts,\nel que"
                + " tenga mas vocales va primero.\n");
        mostrar(cadenas);
    }
}