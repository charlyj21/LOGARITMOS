/*
    1-Enunciado 01: crear un ejemplo propuesto, utilizando 
    FileWriter y FileReader para el proceso de almacenamiento.
 */
package SEMANA09.ABP;

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
class registro{
    String vendedor;
    String seccion;
    String formaPago;
    public registro(String vendedor, String seccion, String formaPago) {
        this.vendedor = vendedor;
        this.seccion = seccion;
        this.formaPago = formaPago;
    }
    String formatoArchivo(){
        return this.vendedor+","+this.seccion+","+this.formaPago;
    }
    String mostrar(){
        return "Vendedor@: "+this.vendedor+"\tSeccion: "+this.seccion+"\tPago: "+this.formaPago;
    }
}
class iniciar{
    ArrayList<registro> listaregistro;
    File archivo;
    FileWriter fw;
    FileReader fr;
    public iniciar(){
        listaregistro = new ArrayList<>();
        archivo = new File("d:/FicheroAlgoritmos/registro.txt");
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
                listaregistro.add(new registro(vect[0],vect[1],vect[2]));
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
            for(registro p:listaregistro){
                fw.write(p.formatoArchivo()+"\n");
            }
        }catch(Exception e){
            
        }finally{
            fw.close();
        }
    }
    void mostrar(){
        for(registro p:listaregistro){
            System.out.println(p.mostrar());
        }
    }
    void agregar(registro p){
        listaregistro.add(p);
    }
}
public class ejerc01 {
    public static void main(String[] args)throws IOException{
        iniciar in = new iniciar();
        in.leer();
        in.mostrar();
        in.agregar(new registro("Camila","Limpieza","Contado"));
        in.agregar(new registro("Karen","Perfumes","Tarjeta"));
        in.agregar(new registro("Rocio","Maquillaje","Tarjeta"));
        in.escribir();
    }
}
