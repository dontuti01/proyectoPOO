/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class hospedaje extends servicio{
    private String fechaEntr;
    private String fechaSal;
    private String tipoH;
    private Scanner sc;
    
    public hospedaje(int puntuacion){
        super(puntuacion);
    }
    public hospedaje(){
        sc=new Scanner(System.in);
    }
    @Override
    public void reservar(){
        System.out.println("/****RESERVACION****/\n/*                              /\n/***********/");
    
        System.out.print("Ingrese fecha de entrada (formato dd/mm/yy): ");
        String fechaE = sc.nextLine();
        this.setFechaEntr(fechaE);
        System.out.print("Ingrese fecha de salida (formato dd/mm/yy): ");
        String fechaS = sc.nextLine();
        this.setFechaSal(fechaS);
        System.out.print("Que tipo de hospedaje busca?\n1. Hotel\n2.Departamento\nElija una opcion: ");
        int reserva = sc.nextInt();
        sc.nextLine();
        if (reserva==1){
            this.setTipoH("Hotel");
        }
        else
            this.setTipoH("Departamento");
        System.out.print("Ingrese el nombre de la ciudad donde se alojara: ");
        String ciudad = sc.nextLine();
    }

    public String getFechaEntr() {
        return fechaEntr;
    }

    public void setFechaEntr(String fechaEntr) {
        this.fechaEntr = fechaEntr;
    }

    public String getFechaSal() {
        return fechaSal;
    }

    public void setFechaSal(String fechaSal) {
        this.fechaSal = fechaSal;
    }

    public String getTipoH() {
        return tipoH;
    }

    public void setTipoH(String tipoH) {
        this.tipoH = tipoH;
    }
    
    
}
