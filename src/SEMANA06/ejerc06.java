/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA06;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class continente{
    int x;
    int y;

    @Override
    public String toString() {
        return "continente{" + "x=" + x + ", y=" + y + '}';
    }
}
public class ejerc06 {
    public static void main(String[] args) {
        //continente c1 = new continente();
        //System.out.println(c1.toString());
        String cad = "mango";
        String cad1 = "MANGO";
        if(cad.equalsIgnoreCase(cad1)){
            System.out.println("cadena iguales");
        }else{
            System.out.println("Son distintos");
        }
    }
}
