/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package SEMANA10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Carlos Jesus Flores Herrera
 
class frutas{
    String name;
    float peso;

    public frutas(String name, float peso) {
        this.name = name;
        this.peso = peso;
    }
    String mostrar(){
        return "Nombre: \t"+this.name+" Peso:\t"+this.peso;
    }

    public String getName() {
        return name;
    }

    public float getPeso() {
        return peso;
    }
    
}
class metodo{
    LinkedList<frutas> lista = new LinkedList<>();
    DataInputStream dis;
    DataOutputStream dos;
    File arch;
    public metodo(){
        arch = new File("d:/FicheroAlgoritmos/frutas.txt");
    }
    void leer()throws IOException{
        String n;
        float p;
        if(!arch.exists()){
            arch.createNewFile();
        }
        dis = new DataInputStream(new FileInputStream(arch));
        try{
            while(dis.readLine()!=null){
                p = dis.readFloat();
                //agregar(new fruta(n,p));
                System.out.println(n+"\t"+p);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            dis.close();
        }
    }
    void escribir()throws IOException{
        dos = new DataOutputStream(new FileOutputStream(arch));
        try{
            for(frutas f:lista){
                dos.writeBytes(f.getName());
                dos.writeChar('\t');
                dos.writeFloat(f.getPeso());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            dos.close();
        }
    }
    void agregar(frutas f){
        lista.add(f);
    }
    void mostrar(){
        for(frutas f:lista){
            
        }
    }
}
public class UML02 {
    public static void main(String[] args)throws IOException {
        metodo met = new metodo();
        met.leer();
        met.agregar(new frutas("Mango", 12));
        met.agregar(new frutas("Fresa", 6));
        met.agregar(new frutas("Mandarina", 11));
        met.escribir();
    }
}
*/                                                          