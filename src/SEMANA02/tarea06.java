/*
    bucle
 */
package SEMANA02;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class tarea06 {
    public static void main(String[] args) {
        int a=15, b=15, x=100, y=100, z=0;
        while(a==b){
            a=a+3;  //18
            while(x==y){
                x=x+z;  //100
            }
            b=b+3;
        }
        System.out.println(x);
    }
}