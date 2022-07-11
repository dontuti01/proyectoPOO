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
    
     public static void EscribirArchivoClientes(String Clientes, ArrayList usuarios) {
        
        FileWriter fichero = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(Clientes,true);
            bw = new BufferedWriter(fichero);
            bw.write(cedula +"," + edad + "," + num_tarjeta );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    //fichero.close();
                    bw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
     
     public void Acceder(){
        for(String n: Usuario.lineas){
            if(n.equals(nick)&& n.equals(pass)){
                if(lineas.get(7).equals("A")){
                    System.out.println("Bievenido cliente");
                    System.out.println("1. Reservar hospedaje");
                    System.out.println("2. Reservar transporte");
                    System.out.println("3. Reservar entrenamiento");
                    System.out.println("4. Pagar reserva");
                    System.out.println("5.Consultar Reserva");
                    System.out.println("6. Salir");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Elija una opcion" + sc.nextInt());
                
                }
            } 
        }    
    }
}
