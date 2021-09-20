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
class Puntos{
    private int a;
    private int b;
    private int c;
    private int d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    int sumatoria(){
        int sum;
        sum = this.a+this.b+this.c+this.d;
        return sum;
    }
}
public class ejerc02 {
    public static void main(String[] args) {
        Puntos p1 = new Puntos();
        p1.setA(22);
        p1.setB(22);
        p1.setC(22);
        p1.setD(22);
        System.out.println(p1.getA());
        System.out.println(p1.sumatoria());
    }
}
