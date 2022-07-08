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
    protected int id_serv;
    protected String ciudad;
    protected double valor;
    protected double puntuacion;
    Scanner sc = new Scanner(System.in);
    public servicio(int id_serv,String ciudad,double valor,double puntuacion){
        this.id_serv=id_serv;
        this.ciudad=ciudad;
        this.valor=valor;
        this.puntuacion=puntuacion;
    }
    
    public void reservar(servicio serv){
        System.out.println("/**********MENU**********/\n/*                      */\n/************************/");
        System.out.print("1 Reservar hospedaje\n2. Reservar transporte\n3. Reservar entretenimiento\n4. Consultar reservas\n5. Salir");
    }
        }
    public void pagarReserva(servicio serv){
        
    }
    public String toString(){
        return "";
    }
    
}
