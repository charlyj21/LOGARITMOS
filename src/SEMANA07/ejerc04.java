/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA07;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc04 {
    public enum semana{
        LUNES, MARTES, MIERCOLES, JUEVES, SABADO, DOMINGO;
    }
    public static void main(String[] args) {
        for(semana s:semana.values()){
            System.out.printf("%s\n",s);
        }
        semana dia = semana.LUNES;
        System.out.println(dia.ordinal());
    }
}
