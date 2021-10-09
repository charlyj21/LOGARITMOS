/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class perro{
    String nombre;
    String raza;

    public perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    String formatoArchivo(){
        return this.nombre+","+this.raza;
    }
    
    String mostrar(){
        return "Nombre: "+this.nombre+"\tRaza: "+this.raza;
    }
}
class ejecutar{
    ArrayList<perro> listaperro;
    File archivo;
    FileWriter fw;
    FileReader fr;
    public ejecutar(){
        listaperro = new ArrayList<>();
        archivo = new File("d:/FicheroAlgoritmos/perro.txt");
    }
    void leer()throws IOException{
        BufferedReader br = null;
        try{
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            br = new BufferedReader(new FileReader(archivo));
            String tempcad = br.readLine();
            while(tempcad!=null){
                String vect[] = tempcad.split(",");
                listaperro.add(new perro(vect[0],vect[1]));
                tempcad = br.readLine();
            }
        }catch(Exception e){
            
        }finally{
            br.close();
        }
    }
    void escribir()throws IOException{
        try{
            fw = new FileWriter(archivo);
            for(perro p:listaperro){
                fw.write(p.formatoArchivo()+"\n");
            }
        }catch(Exception e){
            
        }finally{
            fw.close();
        }
    }
    void mostrar(){
        for(perro p:listaperro){
            System.out.println(p.mostrar());
        }
    }
    void agregar(perro p){
        listaperro.add(p);
    }
}
public class tarea01 {
    public static void main(String[] args)throws IOException{
        ejecutar eje = new ejecutar();
        eje.leer();
        eje.mostrar();
//        eje.agregar(new perro("Bobby","Mestizo"));
//        eje.agregar(new perro("Pancho","Ovejero"));
//        eje.agregar(new perro("Black","Pequinez"));
        eje.escribir();
    }
}
