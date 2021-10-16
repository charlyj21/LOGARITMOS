/*
    Multiplicacion entera
 */
package SEMANA10.ABP;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
public class enun01 {
    public static void main(String[] args) {
        int a=5,b=3;
        int res = producto(a,b);
        System.out.println("El producto es: "+res);
    }
    static int producto(int a, int b){
        int mul = 0;
        if(b==0){
            return 0;
        }else{
            mul = a + producto(a,b-1);
        }
        return mul;
    }
}
