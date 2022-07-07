/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

/**
 *
 * @author ricar
 */
public class Cliente extends Usuario {
    private int edad;
    private String num_tarjeta;
    private Cliente tipo;

    public Cliente(int edad, String num_tarjeta, Cliente tipo, int Cedula, String Nombres, String Apellidos, String Usuario, int celular) {
        super(Cedula, Nombres, Apellidos, Usuario, celular);
        this.edad = edad;
        this.num_tarjeta = num_tarjeta;
        this.tipo = tipo;
    }
    
}
