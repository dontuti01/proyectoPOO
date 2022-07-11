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
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class Datos {
    ArrayList<Hotel> hoteles=  new ArrayList<>();
    ArrayList<Habitacion> habitaciones=  new ArrayList<>();
    static ArrayList<Usuario> usuarios=  new ArrayList<>();
    servicio servicio;
    Scanner sc;
    public Datos(){
        sc=new Scanner(System.in);
        servicio=new servicio();
    }
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
            fr = new FileReader("hoteles.txt",StandardCharsets.UTF_8);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int cont=0;
            while ((linea = br.readLine()) != null) {
                String [] hotelnew=linea.split(",");
                if(cont>=1){
                int codigo=Integer.parseInt(hotelnew[0]);
                int rating=Integer.parseInt(hotelnew[2]);
                boolean desayuno=Boolean.valueOf(hotelnew[4]);
                boolean parqueo=Boolean.valueOf(hotelnew[5]);
                boolean cancelacion=Boolean.valueOf(hotelnew[6]);
                Hotel hotel=new Hotel(codigo,hotelnew[1],rating,hotelnew[3],desayuno,parqueo,cancelacion);
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
    public void crearHabitacion(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("habitaciones.txt");
            fr = new FileReader("habitaciones.txt",StandardCharsets.UTF_8);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int cont=0;
            while ((linea = br.readLine()) != null) {
                String [] habitacionnew=linea.split(",");
                if(cont>=1){
                    int id = Integer.parseInt (habitacionnew[0]);
                    TipoHabitacion tipo=TipoHabitacion.valueOf(habitacionnew[1]);
                    double precio=Double.parseDouble(habitacionnew[2]);
                    int capacidad=Integer.parseInt(habitacionnew[3]);
                    int numero=Integer.parseInt(habitacionnew[4]);
                    EstadoHabitacion estado=EstadoHabitacion.valueOf(habitacionnew[5]);
                    Habitacion habitacion=new Habitacion(id,tipo,precio,capacidad,numero,estado);
                    habitaciones.add(habitacion);
                }
                cont++;
            }
                cont+=1;
        }
        catch (Exception e) {
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

    public servicio getServicio() {
        return servicio;
    }

    public void setServicio(servicio servicio) {
        this.servicio = servicio;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    
    public String login(){
        int cont=0;
        String ced="",nom="",ape="",cel="";
        String tipo="";
        do{
        System.out.println( "/******************************/\n/*   BIENVENIDO AL SISTEMA   */\n/*****************************/");
        System.out.print("USUARIO: ");
        String usuario=sc.nextLine();
        System.out.print("CONTRASEÑA: ");
        String contrasenia=sc.nextLine();
        for(Usuario user:usuarios){
            if(user.getUsuario().equals(usuario) && user.getContrasenia().equals(contrasenia)){
                cont+=1;
                tipo=user.getTipo();
                return tipo;
            }
        }
        System.out.println("¿Desea registrarse como un nuevo cliente? 1=Si/2=No");
        int decision=sc.nextInt();
        sc.nextLine();
            if(decision==1){
                FileWriter fichero = null;
                BufferedWriter bw = null;
                PrintWriter pw = null;

                try {
                    fichero = new FileWriter("clientes.txt",true);
                    bw = new BufferedWriter(fichero);
                    System.out.println("Ingrese su cedula");
                    String cedula=sc.next();
                    System.out.println("Ingrese su nombre");
                    String nombre=sc.next();
                    System.out.println("Ingrese su apellido");
                    String apellido=sc.next();
                    System.out.println("Ingrese su celular");
                    String celular=sc.next();
                    System.out.println("Ingrese su edad");
                    String edad=sc.next();
                    System.out.println("Ingrese su tarjeta de credito");
                    String tarjeta=sc.next();
                    ced=cedula;nom=nombre;ape=apellido;cel=celular;
                    bw.write(cedula+","+edad+","+tarjeta+"\n");
                    System.out.println("ksdsdlsd");
                    tipo="C";

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                    // Nuevamente aprovechamos el finally para 
                    // asegurarnos que se cierra el fichero.
                    if (null != fichero) {
                        //fichero.close();
                        bw.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    }
                }
                FileWriter fichero2 = null;
                BufferedWriter bw2 = null;
                PrintWriter pw2 = null;

                try {
                    fichero2 = new FileWriter("usuarios.txt",true);
                    bw2 = new BufferedWriter(fichero2);
                    bw2.write(ced+","+nom+","+ape+","+usuario+","+contrasenia+","+cel+","+"C"+"\n");
                    System.out.println("ksdsdlsd");

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                    // Nuevamente aprovechamos el finally para 
                    // asegurarnos que se cierra el fichero.
                    if (null != fichero2) {
                        //fichero.close();
                        bw2.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    }
                }
                return tipo;
            }
            
        }while(cont==0);  
        return tipo;
            }
        
    
    public void presentarMenuPrincipal(String tipo){
        if (tipo.equals("C")){
            servicio.reservar();
            System.out.print("\nElija una opcion: ");
            int opcion=sc.nextInt();
            sc.nextLine();
            if(opcion==1){
                hospedaje hospedaje=new hospedaje();
                hospedaje.reservar();
                if(hospedaje.getTipoH().equals("Hotel")){
                    Hotel hotel=new Hotel();
                    System.out.println("/***********************************************************/");
                    hotel.reservar();
                    int cont=1;
                    for(Hotel hotelPrueba:hoteles){
                        System.out.println(cont+"."+hotelPrueba.getNombre());
                        cont++;
                    }
                    System.out.print("Elija una opcion: ");
                    opcion=sc.nextInt();
                    sc.nextLine();
                    hotel.setPuntuacion(hoteles.get(opcion-1).getPuntuacion());
                    System.out.println("/***********************************************************/");
                    System.out.println("Datos de "+hoteles.get(opcion-1).getNombre());
                    System.out.println("Direccion: "+hoteles.get(opcion-1).getDireccion());
                    System.out.println("Costo por noche "+hoteles.get(opcion-1));
                    System.out.println("Estrellas: "+"*".repeat(hoteles.get(opcion-1).getEstrellas()));
                    System.out.println("Incluye desayuno: "+hoteles.get(opcion-1).isDesayuno());
                    System.out.println("Incluye parqueo: "+hoteles.get(opcion-1).isParqueo());
                    System.out.println("Incluye cancelacion gratis: "+hoteles.get(opcion-1).isCancelacion());
                    System.out.println("Elija el tipo de Habitacion que desea: ");
                    
                    cont=1;
                    for (Habitacion habitacion: habitaciones){

                        System.out.print(cont+". "+habitacion.getTipo());
                        if(habitacion.getTipo().equals(TipoHabitacion.INDIVIDUAL)){
                            System.out.println(" - 1 persona - "+habitacion.getPrecio());
                        }
                        if(habitacion.getTipo().equals(TipoHabitacion.DOBLE)){
                            System.out.println(" - 2 personas - "+habitacion.getPrecio());
                        }
                        if(habitacion.getTipo().equals(TipoHabitacion.FAMILIAR)){
                            System.out.println(" - 4 personas - "+habitacion.getPrecio());
                        }
                        cont++;
                    }
                    System.out.println("Elija una opcion: ");
                    opcion=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Usted ha elegido una habitacion " + habitaciones.get(opcion-1).getTipo()+" para un total de ");
                    String []fecha1=hospedaje.getFechaEntr().split("/");
                    int diaInicio=Integer.parseInt(fecha1[0]);
                    String []fecha2=hospedaje.getFechaSal().split("/");
                    int diaFinal=Integer.parseInt(fecha2[0]);
                    System.out.println(diaFinal-diaInicio+" noche.");
                    }
   
                    }
                    
                }
            }
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        Datos newa=new Datos();
        newa.crearHotel();
        newa.crearUsuario();
        newa.crearHabitacion();
        String letra=newa.login();
        newa.presentarMenuPrincipal(letra);
    }
}
