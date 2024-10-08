package ec.edu.espol.proyecto2doparcial.usuarios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

//import javax.swing.text.StyledEditorKit.BoldAction;

public class Empleado implements Serializable {
    public String cedula;
    public String nombre;
    public String telefono;
    public String email;
    public boolean estado;
//Constructor

    public Empleado(String cedula, String nombre, String telefono, String email, boolean estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
    }
//getters

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public boolean getEstado() {
        return estado;
    }
    
    // Setters

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    


    @Override
    public String toString() {
        return "Empleado{" + "cedula=" + cedula + ", nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", estado=" + estado + '}';
    }
/*

    //Editar
    @Override
    public void editar(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Ingrese nueva cedula: ");
    cedula=sc.nextLine();
    System.out.println("Ingrese nuevo nombre: ");
    nombre=sc.nextLine();
    setNombre(nombre);
    System.out.println("Ingrese nuevo teléfono: ");
    telefono=sc.nextLine();
    setTelefono(telefono);
    System.out.println("Ingrese nuevo Email");
    email=sc.nextLine();
    setEmail(email);
    System.out.println("¿Quieres modificar el estado?");
    String resp3 = sc.nextLine();
    if(resp3.toLowerCase().equals("si")){
    if(getEstado()){
    eliminar();
    }
    else{
    setEstado(true);
    }
    }
    }
    
    public boolean eliminar() {
        //Cambiara el estado a inactivo osea false
        return estado=false;
    }
    //Metodo para crear el archivo
    public static void crearArchivoEmpleado(){
    try(ObjectOutputStream archivo =  new ObjectOutputStream(new FileOutputStream (Constantes.rutaEmpleados))){
        
       ArrayList<Empleado> listaEmpleado = new ArrayList<>(); 
       
       archivo.writeObject(listaEmpleado);
       archivo.flush();    
    }catch(IOException e){
        e.printStackTrace();
    }catch(Exception e){
        System.out.println("----err0r");
    }
}
    public static ArrayList<Empleado> cargarlistaEmpleado(){
        ArrayList<Empleado> listadeRetorno = new ArrayList<>();
        //leer
        try(ObjectInputStream lector =  new ObjectInputStream(new FileInputStream (Constantes.rutaEmpleados))){
            listadeRetorno = (ArrayList<Empleado>) lector.readObject();
            
        }catch(FileNotFoundException e){
                System.out.println("No se encontro el archivo");
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("Error inesperado");
        }
        return listadeRetorno; 
    }
    
        //ArrayList<Empleado> listaActualizada = cargarlistaEmpleado();
    
    public static void registrarEmpleado(Empleado e){
        ArrayList<Empleado> listaActualizada = cargarlistaEmpleado();
        
        
        listaActualizada.add(e);
        
        //ecribir en object serializando no domino eso asi que lo cambiare a buffered
        
        try(ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Constantes.rutaEmpleados))){
            escritor.writeObject(listaActualizada);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
   
    /*public static void verificarEmpleado(int cedula){
       
    }*/
    
    public static ArrayList<Empleado> cargarlistaEmpleado(){
        ArrayList<Empleado> listadeRetorno = new ArrayList<>();
        //lector
        try(BufferedReader lector =  new BufferedReader(new FileReader (Constantes.rutaEmpleados))){
            lector.readLine();
            String linea;
            while ((linea = lector.readLine())!=null){
                String[] datos = linea.split(","); 
                listadeRetorno.add(new Empleado(datos[0],datos[1],datos[2],datos[3],Boolean.parseBoolean(datos[4])));
            }
        }catch (IOException e){
            
        }
        return listadeRetorno;
    }
    
    public static void sobreescribirTXT(ArrayList<Empleado> empleados){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Constantes.rutaEmpleados, false));){
            //bw.write("Cédula,nombre,telefono,email,estado");
            for(Empleado e:empleados){
                bw.newLine();
                bw.write(e.getCedula()+","+e.getNombre()+","+e.getTelefono()+","+e.getEmail()+","+e.estado);
            }
        }catch (IOException e){
            System.out.println("error");
        }
    }
}