/*
    39) Leer 50 calificaciones de un grupo de alumnos. 
    Calcule y escriba el porcentaje de reprobados. Tomando 
    en cuenta que la calificación mínima aprobatoria es de 70.
 */
package SEMANA02.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc39 {
    public static void main(String[] args) {
        Random r = new Random();
        int alumnos=50, nota, acumulador=0, porcen;
        
        for(int i=0;i<alumnos;i++){
            nota = r.nextInt(100)+1;
            System.out.println("Alumno "+(i+1));
            System.out.println("Nota: "+nota+"\n");
            if(nota<70){
                acumulador++;
            }
        }
        porcen=((acumulador*100)/alumnos);
        System.out.println("Alum. desaprobados: "+porcen+"%");
    }
}
