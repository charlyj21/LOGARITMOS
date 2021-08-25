/*
    32) Un jefe de casilla desea determinar cuantas personas de cada 
    una de las secciones que componen su zona asisten el día de las 
    votaciones. Las secciones son: norte, sur y centro. También desea 
    determinar cual es la sección con mayor numero de votantes.

 */
package SEMANA02.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc32 {
    public static void main(String[] args) {
        Random r = new Random();
        int TotalVot = 1000000;
        int norte, sur, centro;
        
        norte = r.nextInt(TotalVot)+1;
        TotalVot = TotalVot-norte;
        
        sur = r.nextInt(TotalVot)+1;
        centro = TotalVot-sur;
        
        System.out.println("\tVOTOS\t");
        System.out.println("Norte:\t"+norte+" votos");
        System.out.println("Sur:\t"+sur+" votos");
        System.out.println("Centro:\t"+centro+" votos");
        
        if(norte>sur){
            if(norte>centro){
                System.out.println("La zona del norte tuvo mas votantes.");
            }else{
                System.out.println("La zona del centro tuvo mas votantes.");
            }
        }else if(sur>centro){
            System.out.println("La zona del sur tuvo mas votantes.");
        }else{
            System.out.println("La zona del centro tuvo mas votantes.");
        }
    }
}