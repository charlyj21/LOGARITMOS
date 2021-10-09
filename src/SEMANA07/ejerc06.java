/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA07;

import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class estudiante{
    String nombre;
    String codigo;

    public estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
}
class evaluaciones{
    Scanner teclado = new Scanner(System.in);
    float nota1;
    float nota2;
    float nota3;
    float nota4;
    float promedio;

    public evaluaciones(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    //es preferible sobreescribir, abierto para la extension
    //cerrado para la modificacion para no afectar el codigo en el main
    public evaluaciones(float nota1, float nota2, float nota3, float nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    
    
    void ingresanotas(){
        System.out.println("Ingresar 3 notas");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();
    }
    void ingresa4notas(){
        System.out.println("Ingresar 4 notas");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();
        nota4 = teclado.nextFloat();
    }
    float promedio(){
        return (nota1+nota2+nota3)/3;
    }
    float promedio4notas(){
        return (nota1+nota2+nota3+nota4)/4;
    }
}
class calificaciones{
    estudiante es1;
    evaluaciones e1;
    public calificaciones(estudiante es, evaluaciones e){
        this.es1 = es;
        this.e1 = e;
    }
}
public class ejerc06 {
    public static void main(String[] args) {
        calificaciones c1 = new calificaciones(new estudiante("Charly","70870856"),new evaluaciones(15,11,10));
        
    }
}
