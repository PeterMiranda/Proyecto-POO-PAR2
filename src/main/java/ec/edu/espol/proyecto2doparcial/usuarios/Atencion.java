package ec.edu.espol.proyecto2doparcial.usuarios;

public class Atencion{
    private Servicio servicio;
    private Cita cita;
    private int duracion;
    private Empleado empleado;
    //Getters
    public Servicio getServicio(){
        return servicio;
    }
    public Cita getCita(){
        return cita;
    }
    public int getDuracion(){
        return duracion;
    }
    public Empleado getEmpleado(){
        return empleado;
    }
    //Setters
    public void setServicio(Servicio servicio){
        this.servicio=servicio;
    }
    public void setCita(Cita cita){
        this.cita=cita;
    }
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    public void setEmpleado(Empleado empleado){
        this.empleado=empleado;
    }
    //Constructor
    public Atencion(Servicio servicio,Cita cita,int duracion,Empleado empleado){
        this.servicio=servicio;
        this.cita=cita;
        this.duracion=duracion;
        this.empleado=empleado;
    }
    @Override
    public String toString() {
        return "Servicio: "+servicio+", Empleado: "+empleado+", Cita: "+cita+", Duración: "+duracion;
    }
}