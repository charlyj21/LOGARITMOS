/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA05;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class Variables{
    //Variables de clase
    static int x;
    //Variables de instancia
    int y;
    int z;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Variables.x = x;
    }
    
}
public class ejerc05 {
    public static void main(String[] args) {
        Variables.x = 10;
        Variables v1 = new Variables();
        //System.out.println();
    }
}
