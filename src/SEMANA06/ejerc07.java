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
class pais{
    int x;
    int y;

    public pais(pais p) {
        this.x = p.x;
        this.y = p.y;
    }
    public pais(int a, int b) {
        this.x = a;
        this.y = b;
    }
}
public class ejerc07 {
    public static void main(String[] args) {
        pais p1 = new pais(new pais(5,3));
        System.out.println(p1.toString());
    }
}
