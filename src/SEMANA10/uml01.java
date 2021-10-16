/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA10;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class padre{
    String name;
}
class hijo extends padre{
    String profesion;
}
class hija extends padre{
    String profesion;
}
public class uml01 {
    public static void main(String[] args) {
        hijo h1 = new hijo();
        hija h2 = new hija();
    }
}
