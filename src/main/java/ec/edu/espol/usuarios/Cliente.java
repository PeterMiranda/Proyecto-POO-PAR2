package ec.edu.espol.usuarios;
import java.util.Scanner;

public class Cliente extends Persona{
    //Atributos
    Persona datosRepresentante;
    public Cliente(String cedula, String nombre, String telefono, String email,Persona datosRepresentante) {
        super(cedula,nombre,telefono,email);
        this.datosRepresentante=datosRepresentante;
    }
    //Getters
    //Setters
    //to String

    @Override
    public String toString() {
        return "DATOS CLIENTE: \nCedula: "+cedula+", Nombre: "+nombre+", Telefono: "+telefono+", Email: "+email+"\nDATOS REPRESENTANTE: \n"+datosRepresentante;
    }


    //editar
    @Override
    public void editar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("CLIENTE:");
        System.out.println("Ingrese nuevo nombre: ");
        nombre=sc.nextLine();
        setNombre(nombre);
        System.out.println("Ingrese nuevo teléfono: ");
        telefono=sc.nextLine();
        setTelefono(telefono);
        System.out.println("Ingrese nuevo Email");
        email=sc.nextLine();
        setEmail(email);
        System.out.println("REPRESENTANTE:");
        System.out.println("Ingrese el nombre del Representante:");
        String RepresentanteNombre = sc.nextLine();
        datosRepresentante.setNombre(RepresentanteNombre);
        System.out.println("Ingrese el numero de cedula del Representante:");
        String RepresentanteCedula = sc.nextLine();
        datosRepresentante.setCedula(RepresentanteCedula);
        System.out.println("Ingrese el telefono del Representante:");
        String RepresentanteTelefono = sc.nextLine();
        datosRepresentante.setTelefono(RepresentanteTelefono);
        System.out.println("Ingrese el Email del Representante:");
        String RepresentanteMail = sc.nextLine();
        datosRepresentante.setEmail(RepresentanteMail);
    }
}