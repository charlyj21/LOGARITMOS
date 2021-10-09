/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEMANA09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Jesus Flores Herrera
 */
class metodo{
    ArrayList<String> carpinteria;
    File archivo;
    BufferedReader br;
    public metodo(){
        archivo = new File("D:/FicheroAlgoritmos/archivo.txt");
        carpinteria = new ArrayList<String>();
    }
    void leer() throws IOException{
        try{
            if(!archivo.exists()){
                archivo.createNewFile();
            }
            br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo)));
            String cad = br.readLine();
            String Listaproductos[] = cad.split(",");
            for(String x:Listaproductos){
                carpinteria.add(x);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            br.close();
        }
    }
    void escribir() throws IOException{
        FileOutputStream fos;
        fos = new FileOutputStream(archivo);
        try{
            fos.write(listarproductos().getBytes());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            fos.close();
        }
    }
    String listarproductos(){
        String cad="";
        int contador = 0;
        for(String x:carpinteria){
            contador++;
            if(contador==carpinteria.size()){
                cad += x;
            }else{
                cad += x + ",";
            }
        }
        return cad;
    }
    void agregar(String cad){
        carpinteria.add(cad);
    }
    void mostrar(){
        System.out.println("\nLista de productos");
        for(String x:carpinteria){
            System.out.println(x+" ");
        }
    }
}
public class note01 {
    public static void main(String[] args)throws IOException {
        metodo aplicacion = new metodo();
        Scanner sc = new Scanner(System.in);
        boolean band = true;
        int op;
        aplicacion.leer();
        do{
            System.out.println("\nQue desea realizar [1]agregar[2]mostrar[3]salir");
            op = sc.nextInt();
            switch(op){
                case 1 : {
                    System.out.println("Ingresar un producto!!");
                    aplicacion.agregar(sc.next());
                    break;
                }
                case 2 :{
                    aplicacion.mostrar();
                    break;
                }
                case 3 : {
                    band=false;
                    aplicacion.escribir();
                    break;
                }default:System.out.println("Caracter desconocido");
            }
        }while(band);
    }
}
