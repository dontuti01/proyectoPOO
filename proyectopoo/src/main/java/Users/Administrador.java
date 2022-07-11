/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;


import java.util.ArrayList;
import java.util.Scanner;
import reservaciones.servicio;

/**
 *
 * @author ricar
 */
public class Administrador {
        
    public void Acceder(){
        for(String n: Usuario.lineas){
            if(n.equals(nick)&& n.equals(pass)){
                if(lineas.get(7).equals("A")){
                    System.out.println("Bienvinido Administrador");
                    System.out.println("1. COnsultar Reservas");
                    System.out.println("2. Salir");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Elija una opcion" + sc.nextInt());
                    
                    if(sc.equals(1)){
                        System.out.println("-----"+ listaReservas[
                                ]);
                    }
                }
            } 
        }    
    }
 }
