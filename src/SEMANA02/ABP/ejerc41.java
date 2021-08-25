/*
    41) El profesor de una materia desea conocer la cantidad de 
    sus alumnos que no tienen derecho al examen de nivelación.
    Diseñe un algoritmo que lea las calificaciones obtenidas en 
    las 5 unidades por cada uno de los 40 alumnos y escriba la 
    cantidad de ellos que no tienen derecho al examen de nivelación.
 */
package SEMANA02.ABP;

import java.util.Random;

/**
 *
 * @author carlo
 */
public class ejerc41 {
    public static void main(String[] args) {
        Random r = new Random();
        int NAlumnos = 40, unidades= 5, promedio=0, variable, cont=0;
        for(int i=0;i<NAlumnos;i++){
            promedio=0;
            System.out.println("Alumno "+(i+1));
            for(int j=0;j<unidades;j++){
                System.out.print("Unidad"+(j+1)+": ");
                variable=r.nextInt(20)+1;
                System.out.println(variable);
                promedio=promedio+variable;
            }
            promedio=promedio/unidades;
            System.out.println("Promedio: "+promedio+"\n");
            if(promedio<8){
                cont++;
            }
        }
        System.out.println("Cant. de alum. sin derecho: "+cont);
    }
}