package ec.edu.espol.usuarios;
import java.util.Scanner;


public class Empleado extends Persona {
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
    
    @Override
    public String getCedula(){
        return cedula;
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

}
