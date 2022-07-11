/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class servicio {
    private int id_serv;
    private String ciudad;
    private double valor;
    protected int puntuacion;
    Scanner sc = new Scanner(System.in);
    public servicio(int puntuacion){
        this.puntuacion=puntuacion;
    }
    public servicio(){

    }
    public void reservar(){
        System.out.println("/**********MENU**********/\n/*                      */\n/************************/");
        System.out.print("1. Reservar hospedaje\n2. Reservar transporte\n3. Reservar entretenimiento\n4. Consultar reservas\n5. Salir");
        
    }

}
