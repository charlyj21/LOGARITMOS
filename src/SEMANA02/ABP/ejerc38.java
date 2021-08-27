/*
    38) Calcular la suma siguiente:
    100 + 98 + 96 + 94 + . . . + 0 en este orden.
 */
package SEMANA02.ABP;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class ejerc38 {
    public static void main(String[] args) {
        int suma=0;
        System.out.println("La suma de ");
        for(int i=100;i>=0;i=i-2){
            System.out.print(i+" +");
            suma=suma+i;
        }
        System.out.println("es: "+suma);
    }
}