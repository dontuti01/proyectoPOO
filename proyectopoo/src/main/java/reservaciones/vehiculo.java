/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;

/**
 *
 * @author LENOVO
 */
public class vehiculo extends transporte{
    private int id,capacidad;
    private String marca,modelo,placa,color;
    private boolean estado;
    private double costo;
    private tipoTransmision tipo;
    public vehiculo(int id_serv,String ciudad,double valor,double puntuacion,int id,String marca,String modelo,String placa,String color, int capacidad,boolean estado,double costo,tipoTransmision tipo){
        super(id_serv,ciudad,valor,puntuacion);
    }
}
