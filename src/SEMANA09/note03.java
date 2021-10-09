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
import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class persona{
    String name;
    int edad;
    char sexo;

    public persona(String name, int edad, char sexo) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
    }
    String formatoArch(){
        return this.name+","+this.edad+","+this.sexo;
    }
    String mostrar(){
        return "Nombre: "+this.name+"\tEdad: "+this.edad+"\tSexo: "+this.sexo;
    }
}
class methodo{
    ArrayList<persona> listaper;
    File arch;
    FileWriter fw;
    FileReader fr;
    public methodo(){
        listaper = new ArrayList<>();
        arch = new File("d:/FicheroAlgoritmos/persona.txt");
    }
    void leer()throws IOException{
        BufferedReader br = null;
        try{
            if(!arch.exists()){
                arch.createNewFile();
            }
            br = new BufferedReader(new FileReader(arch));
            String tempcad = br.readLine();
            while(tempcad!=null){
                String vect[] = tempcad.split(",");
                listaper.add(new persona(vect[0],Integer.parseInt(vect[1]),vect[2].charAt(0)));
                tempcad = br.readLine();
            }
        }catch(Exception e){
            
        }finally{
            br.close();
        }
    }
    void escribir()throws IOException{
        try{
            fw = new FileWriter(arch);
            for(persona p:listaper){
                fw.write(p.formatoArch()+"\n");
            }
        }catch(Exception e){
            
        }finally{
            fw.close();
        }
    }
    void mostrar(){
        for(persona p:listaper){
            System.out.println(p.mostrar());
        }
    }
    void agregar(persona p){
        listaper.add(p);
    }
    persona buscar(String name){
        persona person = null;
        for(persona p:listaper){
            if(p.name.equalsIgnoreCase(name)){
                person = p;
                break;
            }
        }
        return person;
    }
}
public class note03 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        methodo met = new methodo();
        met.leer();
        met.mostrar();
        System.out.println("Ingresar nombre a buscar");
        String n = sc.next();
        persona p;
        if((p=met.buscar(n))!=null){
            System.out.println(p.mostrar());
        }else{
            System.out.println("No lo encontro");
        }
//        met.agregar(new persona("Juan",13,'M'));
//        met.agregar(new persona("Maria",11,'F'));
//        met.agregar(new persona("Manuel",10,'M'));
        met.escribir();
    }
}
