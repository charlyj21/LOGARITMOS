/*
    Suma de elementos de un vector
 */
package SEMANA10.ABP;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class enun02 {
    public static void main(String[] args) {
        int vect[] = {2,13,18,23};
        int res = sumaVect(vect,vect.length);
        System.out.println("La suma de elementos es: "+res);
    }
    static int sumaVect(int a[], int size){
        int sum = 0;
        if(size==0){
            return 0;
        }else{
            sum = a[size-1]+sumaVect(a,size-1);
        }
        return sum;
    }
}
