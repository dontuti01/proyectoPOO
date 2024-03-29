/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;

import Users.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Gamer
 */
public class Hotel extends hospedaje{
    protected int id,estrellas;
    protected String nombre, direccion;
    protected boolean desayuno, parqueo, cancelacion;
    public Hotel(int id, String nombre,int estrellas,String direccion,boolean desayuno,boolean parqueo,boolean cancelacion){
        this.estrellas=estrellas;
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
        this.desayuno=desayuno;
        this.parqueo=parqueo;
        this.cancelacion=cancelacion;
    }
    public Hotel(int id){
        this.id=id;
    }
    public Hotel(){
        
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isDesayuno() {
        return desayuno;
    }

    public void setDesayuno(boolean desayuno) {
        this.desayuno = desayuno;
    }

    public boolean isParqueo() {
        return parqueo;
    }

    public void setParqueo(boolean parqueo) {
        this.parqueo = parqueo;
    }

    public boolean isCancelacion() {
        return cancelacion;
    }

    public void setCancelacion(boolean cancelacion) {
        this.cancelacion = cancelacion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
    @Override
    public void reservar(){
        System.out.println("Estos son los hoteles disponibles: ");
        
    }
}
