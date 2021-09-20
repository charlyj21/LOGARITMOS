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
class padre{
    private int a;
    private int b;
    protected int c;
}
class hija extends padre{
    
}
public class ejerc12 {
    public static void main(String[] args) {
        hija h1 = new hija();
        h1.c = 10;
    }
}
