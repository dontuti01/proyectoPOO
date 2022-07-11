/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Cliente extends Usuario {
    private int edad;
    private String num_tarjeta;

    public Cliente(String cedula, String nombre, String apellido, String usuario, String contrasenia,String celular,String tipo) {
        super(cedula, nombre, apellido, usuario, contrasenia, celular,tipo);
    }
    public Cliente(String cedula, String nombre, String apellido, String usuario, String contrasenia,String celular,String tipo,int edad,String num_tarjeta) {
        super(cedula, nombre, apellido, usuario, contrasenia, celular,tipo);
        this.edad=edad;
        this.num_tarjeta=num_tarjeta;
    }
    
     
}
