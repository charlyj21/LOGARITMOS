/*
    Enunciado 2:
    Un profesor imparte dos asignaturas, FPI y FPII, con 4 alumnos

    De cada una de ellas, se obtiene la nota final mediante la media
    ponderada de distintas partes, a saber: 
    • El examen final: 50% 
    • Las prácticas: 25%
    • La exposición de un trabajo: 15%
    • La participación en clase: 10%

    Además, tanto en teoría como en prácticas se debe tener una nota
    mínima de 4 sobre 10 para hacer media; si no se cumple, la nota
    final será de un 3. 

    Las cuatro notas de cada alumno de cada asignatura se tienen 
    almacenadas en un fichero de texto, donde cada línea contiene
    cuatro números reales: el primer valor es la nota del examen 
    final; el segundo, la de las prácticas; el tercero, la del 
    trabajo, y el cuarto, la de la participación en clase. 

    El archivo de las notas de FPI se llama “notas_FPI.txt”; el 
    archivo con las notas de FPII se llama “notas_FPII.txt”.

    Se pide realizar un programa JAVA, correctamente modularizado,
    que realice lo siguiente:

    1. Cargue los datos necesarios en memoria en las estructuras de 
    datos adecuadas.
    2. Calcular las notas finales de las dos asignaturas, teniendo
    en cuenta que quien no haya aprobado FPI no podrá ser calificado 
    en FPII
    3. Mostrar las notas de todos los alumnos, así como el número
    de aprobados y de suspensos de cada asignatura

 */
package SEMANA04.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class enun02 {
    static Random r = new Random();
    static final int alum = 4;
    //Examen final = 50
    //Practicas = 25
    //Exposicion trabajo = 15
    //Participacion clase = 10
    static boolean condicion(){
        return true;
    }
    static void obtenerPP(int n[][], int p[], int pn[]){
        int temp;
        for (int i = 0; i < alum; i++) {
            temp = 0;
            for (int j = 0; j < pn.length; j++) {
                temp += (pn[j]*n[i][j]);
            }
            p[i] = temp/100;
            if(((n[i][1])<4)||((n[i][2])<4)){
                p[i] = 3;
            }
        }
    }
    static void obtenerPPCC(int n[][], int p[], int pn[], int pC[]){
        int temp;
        for (int i = 0; i < alum; i++) {
            temp = 0;
            for (int j = 0; j < pn.length; j++) {
                temp += (pn[j]*n[i][j]);
            }
            if(pC[i]>=6){
                p[i] = temp/100;
                if(((n[i][1])<4)||((n[i][2])<4)){
                    p[i] = 3;
                }
            }else{
                p[i] = 0;
            }
        }
    }
    static void llenar(int v[][]){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                v[i][j] = r.nextInt(10)+1;
            }
        }
    }
    static void mostrar(int v[][], String t[]){
        for (int i = 0; i < v.length; i++) {
            System.out.println("Alumno "+(i+1));
            for (int j = 0; j < v[0].length; j++) {
                System.out.print(t[j]+":\t");
                System.out.println(v[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    static void mostrarvec(int vec[]){
        System.out.println("Promedio ponderado");
        for (int i = 0; i < vec.length; i++) {
            System.out.print("Alumno "+(i+1)+":\t");
            System.out.println(vec[i]+"\t");
        }
    }
    static void resultadoFinal(int p1[], int p2[]){
        int apro = 0, desapro = 0;
        System.out.println("\n");
        System.out.println("********************");
        System.out.println("Asignatura FPI");
        for (int i = 0; i < p1.length; i++) {
            if(p1[i]>=6){
                apro++;
            }else{
                desapro++;
            }
        }
        System.out.println("Aprobados:\t"+apro);
        System.out.println("Desaprobados:\t"+desapro);
        apro = 0;
        desapro = 0;
        System.out.println("********************");
        System.out.println("Asignatura FPII");
        for (int i = 0; i < p2.length; i++) {
            if(p2[i]>=6){
                apro++;
            }else{
                desapro++;
            }
        }
        System.out.println("Aprobados:\t"+apro);
        System.out.println("Desaprobados:\t"+desapro);
        System.out.println("********************");
    }
    public static void main(String[] args) {
        int[] pesoNota = {50,25,15,10};
        String[] textPesoNota = {"Examen final","Practicas",
            "Exp de trabajo","Part en clase"};
        int[][] arrFPI = new int[alum][pesoNota.length];
        int[][] arrFPII = new int[alum][pesoNota.length];
        int[] prom1 = new int[alum];
        int[] prom2 = new int[alum];
        llenar(arrFPI);
        llenar(arrFPII);
        System.out.println("\nnotas_FPI.txt");
        mostrar(arrFPI,textPesoNota);
        obtenerPP(arrFPI,prom1,pesoNota);
        mostrarvec(prom1);
        System.out.println("\nnotas_FPII.txt");
        mostrar(arrFPII,textPesoNota);
        obtenerPPCC(arrFPII,prom2,pesoNota,prom1);
        mostrarvec(prom2);
        resultadoFinal(prom1,prom2);
    }
}
