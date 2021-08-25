/*
    31) Un censador recopila ciertos datos aplicando encuestas para 
    el ultimo Censo Nacional de Población y Vivienda. Desea obtener 
    de todas las personas que alcance a encuestar en un día, que 
    porcentaje tiene estudios de primaria,secundaria, carrera técnica,
    estudios profesionales y estudios de posgrado.
 */
package SEMANA02.ABP;

import java.util.Random;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc31 {
    public static void main(String[] args) {
        Random r = new Random();
        int total = 100;
        int EPrimaria, ESecundaria, ETecnico, EProf, EPost;
        
        EPrimaria = r.nextInt(total)+1;
        total = total-EPrimaria;
        
        ESecundaria = r.nextInt(total)+1;
        total = total-ESecundaria;
        
        ETecnico = r.nextInt(total)+1;
        total = total-ETecnico;
        
        EProf = r.nextInt(total)+1;
        EPost = total-EProf;
        
        System.out.println("\tCENSO NACIONAL DE POBLACION Y VIVIENDA\t");
        System.out.println("E. Primaria:\t\t"+EPrimaria+"%");
        System.out.println("E. Secundaria:\t\t"+ESecundaria+"%");
        System.out.println("Carrera tecnica:\t"+ETecnico+"%");
        System.out.println("E. Profesionales:\t"+EProf+"%");
        System.out.println("E. de postgrado:\t"+EPost+"%");
    }
}
