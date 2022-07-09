/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;

/**
 *
 * @author LENOVO
 */
public class hospedaje extends servicio{
    private String fechaEntr;
    private String fechaSal;
    public hospedaje(int puntuacion){
        super(puntuacion);
    }
    public void reservar(){
        System.out.println("/**********RESERVACION**********/\n/*                              /\n/*******************************/");
    
        System.out.print("Ingrese fecha de entrada (formato dd/mm/yy): ");
        String fechaE = sc.nextLine();
        System.out.print("Ingrese fecha de salida (formato dd/mm/yy): ");
        String fechaS = sc.nextLine();
        System.out.print("Que tipo de hospedaje busca?\n1. Hotel\n2.Departamento\nElija una opcion: ");
        int reserva = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el nombre de la ciudad donde se alojara: ");
        String ciudad = sc.nextLine();
        if(reserva==1){
            
        }
    }
}
