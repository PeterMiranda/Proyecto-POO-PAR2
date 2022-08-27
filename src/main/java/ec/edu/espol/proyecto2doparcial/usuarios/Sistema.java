package ec.edu.espol.proyecto2doparcial.usuarios;
import java.util.Scanner;
import java.util.ArrayList;


public class Sistema {
    public static ArrayList<Cliente> listaClientes;
    public static ArrayList<Empleado> listaEmpleados;
    public static ArrayList<Servicio> listaServicios;
    public static ArrayList<Cita> listaCitas;
    public static ArrayList<Atencion> listaAtencion;

    public void inicializarSistema(){
        Scanner sc=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\nMenu:");
            System.out.println("[1] Servicios");
            System.out.println("[2] Empleados");
            System.out.println("[3] Clientes");
            System.out.println("[4] Citas");
            System.out.println("[5] Atenciones");
            System.out.println("[6] Salir\n");
            System.out.println("Seleccione una opción: ");
            opcion=sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    int opcion1;
                    do{
                        System.out.println("\nServicios:");
                        System.out.println("[1] Mostrar Información");
                        System.out.println("[2] Agregar");
                        System.out.println("[3] Editar");
                        System.out.println("[4] Eliminar");
                        System.out.println("[5] Atrás");
                        System.out.println("Seleccione una opción: ");
                        opcion1=sc.nextInt();
                        sc.nextLine(); 
                        switch (opcion1) {
                            case 1:
                                mostrarInformacionServicio();
                                break;
                            case 2:
                                agregarServicio();
                                
                                break;
                            case 3:
                                editarServicio();
                                break;
                            case 4:
                                eliminarServicio();
                                break;
                            case 5:
                        }
                    }
                    while(opcion1!=5);
                    break;
                case 2:
                    int opcion2;
                    do{
                        System.out.println("\nEmpleados:");
                        System.out.println("[1] Mostrar Información");
                        System.out.println("[2] Agregar");
                        System.out.println("[3] Editar");
                        System.out.println("[4] Eliminar");
                        System.out.println("[5] Atrás");
                        System.out.println("Seleccione una opción: ");
                        opcion2=sc.nextInt();
                        sc.nextLine(); 
                        switch (opcion2) {
                            case 1:
                                mostrarInformacionEmpleados();
                                break;
                            case 2:
                                agregarEmpleado();
                                break;
                            case 3:
                                editarEmpleado();
                                break;
                            case 4:
                                eliminarEmpleado();
                                break;
                            case 5:
                        }
                    }
                    while(opcion2!=5);
                    break;
                case 3:
                    int opcion3;
                    do{
                        System.out.println("\nClientes:");
                        System.out.println("[1] Mostrar Información");
                        System.out.println("[2] Agregar");
                        System.out.println("[3] Editar");
                        System.out.println("[4] Atrás");
                        System.out.println("Seleccione una opción: ");
                        opcion3=sc.nextInt();
                        sc.nextLine(); 
                        switch (opcion3) {
                            case 1:
                                mostrarInformacionClientes();
                                break;
                            case 2:
                                agregarCliente();
                                break;
                            case 3:
                                editarCliente();
                                break;
                            case 4:
                        }
                    }
                    while(opcion3!=4);                    
                    break;
                case 4:
                    int opcion4;
                    do{
                        System.out.println("\nCitas:");
                        System.out.println("[1] Crear");
                        System.out.println("[2] Eliminar");
                        System.out.println("[3] Consultar por fecha");
                        System.out.println("[4] Atrás");
                        System.out.println("Seleccione una opción: ");
                        opcion4=sc.nextInt();
                        sc.nextLine(); 
                        switch (opcion4) {
                            case 1:
                                crearCita();
                                break;
                            case 2:
                                eliminarCita();
                                break;
                            case 3:
                                consultarCita();
                                break;
                            case 4:
                        }
                    }
                    while(opcion4!=4);                   
                    break;
                case 5:
                    int opcion5;
                    do{
                        System.out.println("\nAtenciones:");
                        System.out.println("[1] Registrar");
                        System.out.println("[2] Consultar");
                        System.out.println("[3] Atrás");
                        System.out.println("Seleccione una opción: ");
                        opcion5=sc.nextInt();
                        sc.nextLine(); 
                        switch (opcion5) {
                            case 1:
                                registrarAtencion();
                                break;
                            case 2:
                                consultarAtencion();
                                break;
                            case 3:
                        }
                    }
                    while(opcion5!=4);
                    break;
                case 6:

            }
        }
        while(opcion!=6);
        sc.close();
       }



       
       //Mostrar informaciones
       public void  mostrarInformacionServicio(){
        if (!listaServicios.isEmpty()){
            System.out.println("Servicios:");
            for (int i=0;i<listaServicios.size();i++){
                System.out.println(listaServicios.get(i).toString());
            }
        }
        else{
            System.out.println("No existen elementos");
        }
       }
       public void  mostrarInformacionEmpleados(){
        if (!listaEmpleados.isEmpty()){
            System.out.println("Empleados:");
            for (int i=0;i<listaEmpleados.size();i++){
                System.out.println(listaEmpleados.get(i).toString());
            }
        }
        else{
            System.out.println("No existen elementos");
        }
       }
       public void  mostrarInformacionClientes(){
        if (!listaClientes.isEmpty()){
            System.out.println("Clientes:");
            for (int i=0;i<listaClientes.size();i++){
                System.out.println(listaClientes.get(i).toString());
            }
        }
        else{
            System.out.println("No existen elementos");
        }
       }
       //Agregar
       public void agregarServicio(){
        Scanner sc=new Scanner(System.in);
        Servicio servicio;
        boolean estado=false;
        System.out.println("Ingrese Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese duracion: ");
        int duracion=sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese precio: ");
        double precio=sc.nextDouble();
        sc.nextLine();
        int n=0;
        do{
            System.out.println("Ingrese estado (ACTIVO o INACTIVO): ");
            String estadoString=sc.nextLine();
            if (estadoString.toUpperCase().equals("ACTIVO")){
                estado=true;
                n=1;
            }
            else if(estadoString.toUpperCase().equals("INACTIVO")){
                estado=false;
                n=1;
            }
        }
        while(n!=1);
        servicio=new Servicio(nombre,duracion,precio,estado);
        listaServicios.add(servicio);
       }

    public void agregarEmpleado(){
        Scanner sc = new Scanner(System.in);
        Empleado empleado;
        boolean estado = false;
        System.out.println("Ingrese Nombre del Empleado: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese Cedula del Empleado: ");
        String cedula=sc.nextLine();
        System.out.println("Ingrese Telefono del Empleado: ");
        String telefono=sc.nextLine();
        System.out.println("Ingrese Email del Empleado: ");
        String email=sc.nextLine();
        int n=0;
        do{
            System.out.println("Ingrese estado del Empleado (ACTIVO o INACTIVO): ");
            String estadoString=sc.nextLine();
            if (estadoString.toUpperCase().equals("ACTIVO")){
                estado=true;
                n=1;
            }
            else if(estadoString.toUpperCase().equals("INACTIVO")){
                estado=false;
                n=1;
            }
        }
        while(n!=1);
        empleado = new Empleado(cedula,nombre,telefono,email,estado);
        listaEmpleados.add(empleado);
       }

    public static void agregarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("CLIENTE:");
        System.out.println("Ingrese el nombre del nuevo cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el numero de cedula:");
        String cedula = sc.nextLine();
        System.out.println("Ingrese el telefono:");
        String telefono = sc.nextLine();
        System.out.println("Ingrese su email:");
        String email = sc.nextLine();
        System.out.println("REPRESENTANTE:");
        System.out.println("Ingrese el nombre del Representante:");
        String RepresentanteNombre = sc.nextLine();
        System.out.println("Ingrese el numero de cedula del Representante:");
        String RepresentanteCedula = sc.nextLine();
        System.out.println("Ingrese el telefono del Representante:");
        String RepresentanteTelefono = sc.nextLine();
        System.out.println("Ingrese el Email del Representante:");
        String RepresentanteMail = sc.nextLine();
        Persona r1 = new Persona(RepresentanteCedula,RepresentanteNombre,RepresentanteTelefono, RepresentanteMail);
        //String cedula, String nombre, String telefono, String email,Persona datosRepresentante
        Cliente c1 = new Cliente(cedula,nombre,telefono,email,r1);
        listaClientes.add(c1);
    }

    public void crearCita(){
        Servicio servicio=null;
        Cliente cliente=null;
        Empleado empleado=null;
        String fecha;
        String hora;
        Scanner sc=new Scanner(System.in);
        int n=0;
        do{
            System.out.println("Ingrese fecha (DD/MM/AA): ");
            fecha=sc.nextLine();
            System.out.println("Ingrese hora (HH:MM): ");
            hora=sc.nextLine();
            if(!listaCitas.isEmpty()){
                for (int i=0;i<listaCitas.size();i++){
                    if(!fecha.equals(listaCitas.get(i).getFecha())){
                        if (!hora.equals(listaCitas.get(i).getHora())){
                            int s=0;
                            int c=0;
                            int e=0;
                            do{
                                int inactivo=0;
                                System.out.println("Ingrese nombre del Servicio: ");
                                String nombreServicio=sc.nextLine();
                                for (int is=0;is<listaServicios.size();is++){
                                    if(nombreServicio.toUpperCase().equals(listaServicios.get(is).getNombre().toUpperCase())){
                                        
                                        if(listaServicios.get(is).getEstado()==true){
                                            s=1;
                                            servicio=listaServicios.get(is);
                                        }
                                        else{
                                            System.out.println("El servicio está inactivo. No se puede crear cita.");
                                            s=0;
                                            inactivo=1;
                                        }
                                    }        
                                }
                                if(s==0 && inactivo==0){
                                    System.out.println("El servicio no está registrado");
                                }
                                }
                            while(s!=1);

                            do{
                                System.out.println("Ingrese nombre del Cliente: ");
                                String nombreCliente=sc.nextLine();
                                for (int ic=0;ic<listaClientes.size();ic++){
                                    if(nombreCliente.toUpperCase().equals(listaClientes.get(ic).getNombre().toUpperCase())){
                                        cliente=listaClientes.get(ic);
                                        c=1;
                                    }
                                        
                                }
                                if(c==0){
                                    System.out.println("El cliente no está registrado");
                                }
                                }
                            while(c!=1);

                            do{
                                int inactivo=0;
                                System.out.println("Ingrese nombre del Empleado: ");
                                String nombreEmpleado=sc.nextLine();
                                for (int ie=0;ie<listaEmpleados.size();ie++){
                                    if(nombreEmpleado.toUpperCase().equals(listaEmpleados.get(ie).getNombre().toUpperCase())){
                                        
                                        
                                        if(listaEmpleados.get(ie).getEstado()==true){
                                            empleado=listaEmpleados.get(ie);
                                            e=1;
                                        }
                                        else{
                                            System.out.println("El empleado está inactivo. No se puede crear cita.");
                                            e=0;
                                            inactivo=1;
                                        }
                                        n=1;
                                        }
                                        
                                    }
                                if(e==0 && inactivo==0){
                                    System.out.println("El empleado no está registrado");
                                }                
                                }
                            while(e!=1);
                        }
                    }
                    else{
                        System.out.println("No se puede registrar cita. Ya esxiste una cita registrada para esa fecha y hora.");
                    }
                }
            }
            else{
                int s=0;
                int c=0;
                int e=0;
                do{
                    int inactivo=0;
                    System.out.println("Ingrese nombre del Servicio: ");
                    String nombreServicio=sc.nextLine();
                    for (int is=0;is<listaServicios.size();is++){
                        if(nombreServicio.toUpperCase().equals(listaServicios.get(is).getNombre().toUpperCase())){
                            
                            if(listaServicios.get(is).getEstado()==true){
                                servicio=listaServicios.get(is);
                                s=1;
                            }
                            else{
                                System.out.println("El servicio está inactivo. No se puede crear cita.");
                                inactivo=1;
                            }
                            }
                            
                        }
                    if(s==0 && inactivo==0){
                        System.out.println("El servicio no está registrado");
                    }
                    }
                while(s!=1);

                do{
                    System.out.println("Ingrese nombre del Cliente: ");
                    String nombreCliente=sc.nextLine();
                    for (int ic=0;ic<listaClientes.size();ic++){
                        if(nombreCliente.toUpperCase().equals(listaClientes.get(ic).getNombre().toUpperCase())){
                            cliente=listaClientes.get(ic);
                            c=1;
                            }
                            
                        }
                    if(c==0){
                        System.out.println("El cliente no está registrado");
                    }
                    }
                while(c!=1);

                do{
                    int inactivo=0;
                    System.out.println("Ingrese nombre del Empleado: ");
                    String nombreEmpleado=sc.nextLine();
                    for (int ie=0;ie<listaEmpleados.size();ie++){
                        if(nombreEmpleado.toUpperCase().equals(listaEmpleados.get(ie).getNombre().toUpperCase())){
                            
                            if(listaEmpleados.get(ie).getEstado()==true){
                                empleado=listaEmpleados.get(ie);
                                e=1;
                            }
                            else{
                                System.out.println("El empleado está inactivo. No se puede crear cita.");
                                inactivo=1;
                            }
                            n=1;
                            }
                            
                        }
                    if(e==0 && inactivo==0){
                        System.out.println("El empleado no está registrado");
                    }                
                    }
                while(e!=1);
            }
        }
        while(n!=1);
        Cita cita=new Cita(fecha, hora, cliente, servicio, empleado);
        listaCitas.add(cita);
    }


public void registrarAtencion(){
    Cita cita=null;
    Servicio servicio=null;
    Empleado empleado=null;
    int duracion; 
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese numero de Cedula para Atención:");
    String InCedulaA = sc.nextLine();
    int n = 0;

    for(int i=0;i<listaCitas.size();i++){
        if(InCedulaA.equals(listaCitas.get(i).getCliente().getCedula())){
            cita = listaCitas.get(i);
            servicio = listaCitas.get(i).getServicio();
            System.out.println("¿El empleado que se le asignó a su cita fué el empleado que atendió su cita? ");
            String respuesta = sc.nextLine();
            if(respuesta.toLowerCase().equals("no")){
                do{
                    System.out.println("Ingrese nombre del Empleado que atendió: ");
                    String NewEmpleado=sc.nextLine();
                    for (int ic=0;ic<listaClientes.size();ic++){
                        if(NewEmpleado.toUpperCase().equals(listaEmpleados.get(ic).getNombre().toUpperCase())){
                            empleado=listaEmpleados.get(ic);
                            n=1;
                            }
                        }
                    if(n==0){
                        System.out.println("El Empleado no está registrado");
                    }
                }
                while(n!=1);
            }
            else{
                empleado = listaCitas.get(i).getEmpleado();
            } 
        }
    }
    System.out.println("Ingrese duración del Servicio: ");
    duracion = sc.nextInt();
    sc.nextLine();

    Atencion atencion = new Atencion(servicio, cita, duracion, empleado);
    listaAtencion.add(atencion);

    String fecha = atencion.getCita().getFecha();
    String hora = atencion.getCita().getHora();
    for (int i=0;i<listaCitas.size();i++){
        if(fecha.toUpperCase().equals(listaCitas.get(i).getFecha().toUpperCase())){
            if(hora.toUpperCase().equals(listaCitas.get(i).getHora())){
                listaCitas.remove(listaCitas.get(i));
            }
        }
    }
}

       //EDITAR

    public void editarServicio(){
        System.out.println("Ingrese un Servicio");
        Scanner sc = new Scanner(System.in);
        String InServicio = sc.nextLine();
        for (int i=0;i<listaServicios.size();i++){
            if(InServicio.toUpperCase().equals(listaServicios.get(i).getNombre().toUpperCase())){
                listaServicios.get(i).editar();
            }
        }
    }

    public void editarCliente(){
        System.out.println("Ingrese el numero de Cedula del Cliente");
        Scanner sc = new Scanner(System.in);
        String InCedulaC = sc.nextLine();
        for (int i=0;i<listaClientes.size();i++){
            if(InCedulaC.toUpperCase().equals(listaClientes.get(i).getCedula().toUpperCase())){
                listaClientes.get(i).editar();
            }
        }
    }

    public void editarEmpleado(){
        System.out.println("Ingrese el numero de Cedula del Empleado");
        Scanner sc = new Scanner(System.in);
        String InCedulaE = sc.nextLine();
        for (int i=0;i<listaEmpleados.size();i++){
            if(InCedulaE.toUpperCase().equals(listaEmpleados.get(i).getCedula().toUpperCase())){
                listaEmpleados.get(i).editar();
            }
        }
    }



       //Eliminar
    public void eliminarServicio(){
        System.out.println("Ingrese el nombre del servicio:");
        Scanner sc = new Scanner(System.in);
        String InServicio = sc.nextLine();
        for (int i=0;i<listaServicios.size();i++){
            if(InServicio.toUpperCase().equals(listaServicios.get(i).getNombre().toUpperCase())){
                listaServicios.get(i).eliminar();
            }
        }
    }

    public void eliminarEmpleado(){
        System.out.println("Ingrese el numero de Cedula del Empleado:");
        Scanner sc = new Scanner(System.in);
        String inEmpleString = sc.nextLine();
        for (int i=0;i<listaEmpleados.size();i++){
            if(inEmpleString.toUpperCase().equals(listaEmpleados.get(i).getCedula().toUpperCase())){
                listaEmpleados.get(i).eliminar();
            }
        }
    }

    public void eliminarCita(){
        System.out.println("Ingrese numero de cédula del cliente:");
        Scanner sc = new Scanner(System.in);
        String cedula = sc.nextLine();
        ArrayList<Cita> citasCliente=new ArrayList<>();
        System.out.println("Citas del cliente: ");
        for (int i=0;i<listaCitas.size();i++){
            if(cedula.toUpperCase().equals(listaCitas.get(i).getCliente().getCedula().toUpperCase())){
                citasCliente.add(listaCitas.get(i));
            }
        }
        for (int i=0;i<citasCliente.size();i++){
            System.out.println(citasCliente.get(i).toString());
        }
        if(!citasCliente.isEmpty()){
            System.out.println("Ingrese fecha de la cita que desea eliminar: ");
            String fecha=sc.nextLine();
            System.out.println("Ingrese hora de la cita que desea eliminar: ");
            String hora=sc.nextLine();
            for (int i=0;i<listaCitas.size();i++){
                if(fecha.toUpperCase().equals(listaCitas.get(i).getFecha().toUpperCase())){
                    if(hora.toUpperCase().equals(listaCitas.get(i).getHora())){
                    listaCitas.remove(listaCitas.get(i));
                    citasCliente.remove(listaCitas.get(i));
                    }
                }
            }
        }
        else{
            System.out.println("El cliente no tiene citas.");
        }


    }

       //Consultar
       
       public void consultarCita(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese fecha: ");
        String fecha=sc.nextLine();
        System.out.println("Ingrese hora: ");
        String hora=sc.nextLine();
        for (int i=0;i<listaCitas.size();i++){
            if(fecha.toUpperCase().equals(listaCitas.get(i).getFecha().toUpperCase())){
                if(hora.toUpperCase().equals(listaCitas.get(i).getHora())){
                    System.out.println(listaCitas.get(i).toString());
                }
                
            }
            else{
                System.out.println("No hay citas registradas para esa fecha y hora.");
            }
        }
       }

       public void consultarAtencion(){
            Scanner sc = new Scanner(System.in);
            int opcion;
            do{
                System.out.println("Como desea hacer la consulta?");
                System.out.println("[1] Cedula de empleado");
                System.out.println("[2] Cedula de cliente");
                System.out.println("[3] Fecha");
                System.out.println("[4] Atras");
                opcion = sc.nextInt();
                sc.nextLine();
                switch(opcion){
                    case 1:   
                        System.out.println("Ingrese la cedula del empleado:");
                        String cedu = sc.nextLine();
                        for(Cita citita : listaCitas){
                            if(citita.getEmpleado().getCedula().equals(cedu)){
                                System.out.println("Informacion:"+citita.toString());    
                            }
                        }    
                        break;  
                    case 2:
                        System.out.println("Ingrese la cedula del cliente:");
                        String cedu2 = sc.nextLine();
                        for(Cita citita : listaCitas){
                            if(citita.getCliente().getCedula().equals(cedu2)){
                                System.out.println("Informacion:"+citita.toString());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese la fecha:");
                        String cedu3 = sc.nextLine();
                        for(Cita citita : listaCitas){
                            if(citita.getFecha().equals(cedu3)){
                                System.out.println("Informacion:"+citita.toString());
                            }
                        }
                        break;
                    case 4:

                    default: 
                       System.out.println("No a realizado citas esta persona");
                }
            }
            while(opcion!=4);
        }
    
       public static void main(String[] args) {
        Sistema sistema=new Sistema();
        listaClientes=new ArrayList<>();
        listaEmpleados=new ArrayList<>();
        listaServicios=new ArrayList<>();
        listaCitas=new ArrayList<>();
        listaAtencion=new ArrayList<>();

        Persona r1 = new Persona("09", "Alex", "09954546", "pmp12072002@outlook.com");
        Cliente c1 =new Cliente("0956798490", "Peter", "0981318003", "eraul2002", r1);
        Persona r2 = new Persona("08", "Jeremy", "09954678", "example@outlook.com");
        Cliente c2 =new Cliente("0956798490", "Paul", "0981318003", "eraul2002", r2);
        listaClientes.add(c1);
        listaClientes.add(c2);

        Empleado e1 = new Empleado("098451632", "Cereza", "0420133181", "acm1pt@yahoo.com", true);
        Empleado e2 = new Empleado("091231231", "Petrus", "0457281734", "aaaaaa@hotmail.com", true);
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);

        Servicio s1=new Servicio("Medicina General", 60, 20, true);
        Servicio s2 = new Servicio("Psicologia", 120, 15, true);
        Servicio s3 = new Servicio("Fisoterapia", 20, 10, true);
        listaServicios.add(s1);
        listaServicios.add(s2);
        listaServicios.add(s3);
        
        Cita cv1 = new Cita("17/07/2022","20:30",c1,s1,e1);
        Cita cv2 = new Cita("10/07/2022","19:30",c2,s2,e2);
        listaCitas.add(cv1);
        listaCitas.add(cv2);
        
        Atencion aten = new Atencion(s1,cv1,30,e1);
        listaAtencion.add(aten);

        sistema.inicializarSistema();
    }
}

