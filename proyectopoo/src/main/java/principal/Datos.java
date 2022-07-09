/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import Users.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import reservaciones.*;

/**
 *
 * @author LENOVO
 */
public class Datos {
    ArrayList<Hotel> hoteles=  new ArrayList<>();
    ArrayList<Usuario> usuarios=  new ArrayList<>();
    public void crearUsuario(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("usuarios.txt");
            fr = new FileReader(archivo,StandardCharsets.UTF_8);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int cont=0;
            while ((linea = br.readLine()) != null) {
                String [] usuarionew=linea.split(",");
                Usuario user=new Usuario(usuarionew[0],usuarionew[1],usuarionew[2],usuarionew[3],usuarionew[4],usuarionew[5],usuarionew[6]);
                if(cont>=1){
                    usuarios.add(user);
                }
                cont+=1;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
               
    }
    public void crearHotel(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("hoteles.txt");
            fr = new FileReader(archivo,StandardCharsets.UTF_8);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int cont=0;
            while ((linea = br.readLine()) != null) {
                String [] hotelnew=linea.split(",");
                    if(cont>=1){
                    int id = Integer.parseInt (hotelnew[0]);
                    int rating = Integer.parseInt (hotelnew[2]);
                    boolean desayuno = Boolean.parseBoolean(hotelnew[4]);
                    boolean parqueo = Boolean.parseBoolean(hotelnew[5]);
                    boolean canc = Boolean.parseBoolean(hotelnew[6]);

                    Hotel hotel=new Hotel(rating,id,hotelnew[1],hotelnew[3],desayuno,parqueo,canc);
                    hoteles.add(hotel);
                }
                cont+=1;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
               
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Hotel> getHoteles() {
        return hoteles;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Datos newa=new Datos();
        newa.crearHotel();
        newa.crearUsuario();
        for (Usuario hotel:newa.getUsuarios()){
            System.out.println(hotel.getTipo());
        }
        
    }
}
