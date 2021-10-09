/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXAMEN2;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
interface githubData{
    void add();
    void remove();
}
interface githubEdit{
    void status();
    void push();
}
interface git extends githubData, githubEdit{

}
class data implements git{
    @Override
    public void add() {
        System.out.println("Añadiendo archivo");
    }
    @Override
    public void remove() {
        System.out.println("Removiendo archivo");
    }
    @Override
    public void status() {
        System.out.println("Status");
    }
    @Override
    public void push() {
        System.out.println("Subido con exito");
    }
}
public class ejerc06 {
    public static void main(String[] args) {
        data d1 = new data();
        data d2 = new data();
        d1.add();
        d1.push();
        d2.remove();
        d2.status();
    }
}
