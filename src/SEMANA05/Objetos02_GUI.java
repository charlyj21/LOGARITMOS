/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package SEMANA05;
//
//import java.awt.*;
//import java.awt.event.*;
//import java.applet.*;
//
///**
// *
// * @author Carlos Jesus Flores Herrera
// */
//public class Objetos02_GUI extends Applet{
//    Button btnMostrar;
//    TextArea txtResultado;
//    public void init(){
//        btnMostrar = new Button("Mostrar");
//        btnMostrar.addActionListener(l);
//        txtResultado = new TextArea();
//        
//        add(btnMostrar);
//        add(txtResultado);
//    }
//    public void actionPerformed(ActionEvent e){
//    Empleado objEmple = new Empleado();
//    //Le damos valores a los atributos del objeto 
//    objEmple.codigo = 1234;
//    objEmple.nombre = "Juan Pablo";
//    objEmple.horas = 90;
//    objEmple.tarifa = 12;
//    //Mostramos en pantalla los datos del objeto
//    txtResultado.setText("Código: "+ 
//    objEmple.codigo);
//    txtResultado.append("\nNombre: "+ 
//    objEmple.nombre);
//    txtResultado.append("\nHoras: "+ 
//    objEmple.horas);
//    txtResultado.append("\nTarifa: "+ 
//    objEmple.tarifa);
//    //hacemos uso de uno de sus métodos
//    txtResultado.append("\nSueldo: "+
//    objEmple.calculaSueldo());
//    }
//}
