/*
    40) Leer por cada alumno de Diseño estructurado de algoritmos 
    su numero de control y su calificación en cada una de las 5 
    unidades de la materia. Al final que escriba el numero de 
    control del alumno que obtuvo mayor promedio. 
    Suponga que los alumnos tienen diferentes promedios.
 */
package SEMANA02.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc40 {
    public static void main(String[] args) {
        Random r = new Random();
        int NControl, promedio=0, NAlumnos = 10, unidades= 5, variable, mayor=0, CodeMayor=0;
        for(int i=0;i<NAlumnos;i++){
            promedio=0;
            NControl = r.nextInt(888888)+111111;
            System.out.println("Num. Control:  "+NControl);
            for(int j=0;j<unidades;j++){
                System.out.print("Unidad"+(j+1)+": ");
                variable=r.nextInt(20)+1;
                System.out.println(variable);
                promedio=promedio+variable;
            }
            promedio=promedio/unidades;
            System.out.println("Promedio: "+promedio+"\n");
            if(promedio>mayor){
                mayor=promedio;
                CodeMayor=NControl;
            }
        }
        System.out.println("Mayor promedio: "+CodeMayor);
    }
}