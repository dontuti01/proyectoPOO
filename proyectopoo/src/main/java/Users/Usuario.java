/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Usuario {
    protected String cedula,nombre,apellido,usuario,contrasenia,celular,tipo;

    public Usuario(String cedula, String nombre, String apellido, String usuario, String contrasenia,String celular,String tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia=contrasenia;
        this.celular = celular;
        this.tipo=tipo;
    }


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     public void Acceder(){
        System.out.println("BIenvenido al sistema");
        Scanner sc =  new Scanner(System.in);
        String nick =  sc.nextLine();
        String pass =  sc.nextLine();
        System.out.println("Ingresar usuario: " + nick);
        System.out.println("Ingrese contrasena: " + pass );
        
        ArrayList<String> lineas =  new ArrayList<>();
        File archivo =  null;
        FileReader fr = null;
        BufferedReader br =  null;
        
        try{
        archivo = new File("usuarios.txt");
        fr = new FileReader(archivo, StandardCharsets.UTF_8);
        br = new BufferedReader(fr);
        
        String linea;
        while((linea = br.readLine()) != null){
            lineas.add(linea);
        }
        }catch (Exception e){
            e.printStackTrace();
        } finally{
            try{
                if(null != fr){
                    fr.close();
                }
                } catch (Exception e2){
                        e2.printStackTrace();
                }
            } 
     }
    }
    
    public void ConsultarReservas(){
        for (int i: ListaReservas){
            System.out.println(i);
        }
    }
}

    
}
