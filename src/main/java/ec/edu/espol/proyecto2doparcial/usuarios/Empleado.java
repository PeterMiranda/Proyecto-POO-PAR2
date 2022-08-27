package ec.edu.espol.proyecto2doparcial.usuarios;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

//import javax.swing.text.StyledEditorKit.BoldAction;

public class Empleado extends Persona implements Serializable {
    boolean estado;
//Constructor
    public Empleado(String cedula, String nombre, String telefono, String email,boolean estado) {
        super(cedula, nombre, telefono, email);
        this.estado = estado;
    }
    //Getters

    public boolean getEstado(){
        return estado;
    }
    //Setters

    public void setEstado(boolean estado){
        this.estado=estado;
    }

    //to String
    @Override
    public String toString() {
        return "Cedula: "+cedula+", Nombre: "+nombre+", Telefono: "+telefono+", Email: "+email+", Estado: "+estado;
    }


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

    public boolean eliminar(){
        //Cambiara el estado a inactivo osea false
        return estado=false;
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
            System.out.println("Error inseperado");
        }
        return listadeRetorno;
    }
    
    public static void registrarEmpleado(Empleado e){
        ArrayList<Empleado> listaActualizada = cargarlistaEmpleado();
        
        listaActualizada.add(e);
        //ecribir
        try(ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Constantes.rutaEmpleados))){
            escritor.writeObject(listaActualizada);
        }catch(IOException ex){
            ex.getStackTrace();
        }
    
    
    }    

}
