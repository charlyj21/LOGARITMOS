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
class mayoredad{
    private boolean mayoredad;
}
class Userlogin extends mayoredad{
    private String user;
    private String pass;
    private boolean mayoredad;
    void login(){
        System.out.println("Iniciando sesion "+user);
    }

    public Userlogin(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public Userlogin(String user, String pass, boolean mayoredad) {
        this.user = user;
        this.pass = pass;
        this.mayoredad = mayoredad;
    }
    
    
}
class Correo{
    void enviar(){
        System.out.println("Escriba su mensaje");
    }
}

public class ejerc07 {
    
}
