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
public class transporte extends servicio{
    private String fechaEnt;
    private String fechaSal;
    Scanner sc;
    public transporte(){
        sc=new Scanner(System.in);
    }
    public void reservar(){
        System.out.print("Ingrese fecha de inicio de Reserva (formato dd/mm/yy): ");
        String fechaEnt = sc.nextLine();
        System.out.print("Ingrese fecha de finalizacion de Reserva (formato dd/mm/yy): ");
        String fechaSal = sc.nextLine();
        
    }
}
