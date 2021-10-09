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
class laptop{
    private String marca;
    private String numSerie;
    private int pulgadas;
    private int precio;

    public laptop(String _marca, String _numSerie, int _pulgadas, int _precio) {
        this.marca = _marca;
        this.numSerie = _numSerie;
        this.pulgadas = _pulgadas;
        this.precio = _precio;
    }
    
}
public class ejerc04 {
    public static void main(String[] args) {
        laptop l1 = new laptop("HP","XAV159",16,2200);
        laptop l2 = new laptop("Lenovo","L500TKL",12,1800);
    }
}
