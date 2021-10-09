/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA07;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
abstract class padre{
    abstract void asiento();
}
class hija extends padre{
    int asiento = 10;
    @Override
    void asiento(){
        System.out.println(asiento);
    }
}
class hija1 extends padre{
    int asiento = 20;
    @Override
    void asiento(){
        System.out.println(asiento);
    }
}
class hija2 extends padre{
    int asiento = 30;
    @Override
    void asiento(){
        System.out.println(asiento);
    }
}
public class ejerc07 {
    public static void main(String[] args) {
        padre p[] = {new hija(),new hija1(), new hija2()};
        for(padre lista:p){
            lista.asiento();
        }
    }
}
