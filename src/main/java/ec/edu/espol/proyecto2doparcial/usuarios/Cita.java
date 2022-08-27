package ec.edu.espol.proyecto2doparcial.usuarios;


public class Cita{
    // Atributos
    private String fecha;
    private String hora;
    private Servicio servicio;
    private Cliente cliente;
    private Empleado empleado;
    //Getters
    public String getFecha(){
        return fecha;
    }
    public String getHora(){
        return hora;
    }
    public Servicio getServicio(){
        return servicio;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Empleado getEmpleado(){
        return empleado;
    }
    //Setters
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setHora(String hora){
        this.hora=hora;
    }
    public void setServicio(Servicio servicio){
        this.servicio=servicio;
    }
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public void setEmpleado(Empleado empleado){
        this.empleado=empleado;
    }
    //Constructor
    public Cita(String fecha,String hora,Cliente cliente,Servicio servicio, Empleado empleado){
        this.fecha=fecha;
        this.hora=hora;
        this.cliente=cliente;
        this.servicio=servicio;
        this.empleado=empleado;
    }
    //to String
    @Override
    public String toString() {
        return "Servicio: "+servicio+", Cliente: "+cliente+", Empleado: "+empleado+", Fecha: "+fecha+", Hora: "+hora;
    }
    //Métodos
    
}