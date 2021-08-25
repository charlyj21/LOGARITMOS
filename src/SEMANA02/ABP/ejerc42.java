/*
    42) Leer los 250,000 votos otorgados a los 3 candidatos 
    a gobernador e imprimir el numero del candidato ganador
    y su cantidad de votos.
 */
package SEMANA02.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc42 {
    public static void main(String[] args) {
        Random r = new Random();
        int TotalVot = 250000;
        int grupo1, grupo2, grupo3;
        
        grupo1 = r.nextInt(TotalVot)+1;
        TotalVot = TotalVot-grupo1;
        
        grupo2 = r.nextInt(TotalVot)+1;
        grupo3 = TotalVot-grupo2;
        
        System.out.println("Candidato 1:\t"+grupo1+" votos");
        System.out.println("Candidato 2:\t"+grupo2+" votos");
        System.out.println("Candidato 3:\t"+grupo3+" votos");
        
        if(grupo1>grupo2){
            if(grupo1>grupo3){
                System.out.println("El candidato ganador es el n°1");
            }else{
                System.out.println("El candidato ganador es el n°3");
            }
        }else if(grupo2>grupo3){
            System.out.println("El candidato ganador es el n°2");
        }else{
            System.out.println("El candidato ganador es el n°3");
        }
    }
}