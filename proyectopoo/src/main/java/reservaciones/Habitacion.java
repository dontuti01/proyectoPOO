/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservaciones;

/**
 *
 * @author Gamer
 */
public class Habitacion {
    public double precio, capacidad, num_hab;
    public TipoHabitacion tipo;
    public EstadoHabitacion estado;
    public Habitacion(int id,TipoHabitacion tipo,double precio, int capacidad, int num_hab, EstadoHabitacion estado) {
        super(id);
        this.precio = precio;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.num_hab = num_hab;
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(double num_hab) {
        this.num_hab = num_hab;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }

 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Habitacion other = (Habitacion) obj;
        if (this.tipo != other.tipo) {
            return false;
        }
        return this.estado == other.estado;
    }

}
