package ec.edu.espol.usuarios;
import java.util.Scanner;

public class Persona {
    protected String cedula;
    protected String nombre;
    protected String telefono;
    protected String email;
    //Getters
    public String getCedula(){
        return cedula;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getEmail(){
        return email;
    }
    //Setters
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setEmail(String email){
        this.email=email;
    }
    //to String
    @Override
    public String toString() {
        return "Cedula: "+cedula+", Nombre: "+nombre+", Telefono: "+telefono+", Email: "+email;
    }
    //Constructor
    public Persona(String cedula, String nombre, String telefono, String email){
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    //Métodos
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
    }
}