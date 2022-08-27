package ec.edu.espol.proyecto2doparcial.usuarios;
import java.util.Scanner;

public class Servicio{
    private String nombre;
    private int duracion; //En minutos
    private double precio;
    private boolean estado; //True=activo False=inactivo
    //Se brindan los servicios de Terapia de lenguaje y Terapia psicopedagogica
    public Servicio(String nombre, int duracion, double precio, boolean estado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.precio = precio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //mostrarInformacion del servicio
    @Override
    public String toString(){
    return "Nombre del servicio:"+this.nombre+"; Duracion:"+this.duracion+"; Precio:"+this.precio+"; Estado:"+this.estado;
    }

    /*Nose como hacerlo xdxd AYUDAAAAAA
    okokokokokok i can handle it primero pediremos el servicio que se quiere editar*/
   
    public void editar(){
        System.out.println("Quieres modificar el tiempo de duracion?");
        Scanner sc = new Scanner(System.in);
        String resp1 = sc.nextLine();
        if(resp1.toLowerCase().equals("si")){
            System.out.print("Ingrese el nuevo tiempo de duracion:");
            int tiempoN = sc.nextInt();
            sc.nextLine();
            setDuracion(tiempoN);
        }
        System.out.println("Quieres modificar el precio?");
        String resp2 = sc.nextLine();
        if(resp2.toLowerCase().equals("si")){
            System.out.print("Ingrese el nuevo precio:");
            double plata = sc.nextDouble();
            sc.nextLine();
            setPrecio(plata);
        }
        System.out.println("Quieres modificar el estado?");
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