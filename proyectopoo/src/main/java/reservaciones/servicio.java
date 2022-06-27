/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;

/**
 *
 * @author LENOVO
 */
public class servicio {
    protected int id_serv;
    protected String ciudad;
    protected double valor;
    protected double puntuacion;
    public servicio(int id_serv,String ciudad,double valor,double puntuacion){
        this.id_serv=id_serv;
        this.ciudad=ciudad;
        this.valor=valor;
        this.puntuacion=puntuacion;
    }
    
}
