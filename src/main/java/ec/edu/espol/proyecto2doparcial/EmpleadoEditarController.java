/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.proyecto2doparcial;

import ec.edu.espol.proyecto2doparcial.usuarios.Constantes;
import ec.edu.espol.proyecto2doparcial.usuarios.Empleado;
import ec.edu.espol.proyecto2doparcial.usuarios.LectorEstado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author irvin
 */
public class EmpleadoEditarController implements Initializable {


    @FXML
    private TextField txtcedula;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtTelefono;
    @FXML
    private ComboBox<String> comboboxEstado;
    @FXML
    private TextField txtEmail;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ArrayList<String> estados = LectorEstado.generarListaEstado();
        
        comboboxEstado.getItems().addAll(estados);
    }    
    
    @FXML
    private void volver(ActionEvent event) throws IOException {
        App.setRoot("empleados");
        System.out.println(Empleado.cargarlistaEmpleado());
    }

    @FXML
    private void botonEditar(ActionEvent event) throws IOException {
        
        //ArrayList<Empleado> listadeRetorno = new ArrayList<>();
        //lector
        /*
        try(BufferedReader lector =  new BufferedReader(new FileReader (Constantes.rutaEmpleados))){
            //lector.readLine();
            String linea = null;
            while ((linea = lector.readLine())!=null){
                String[] datos = linea.split(","); 
                //listadeRetorno.add(new Empleado(datos[0],datos[1],datos[2],datos[3],Boolean.parseBoolean(datos[4])));
        */
                
                String cedulaIngresada = txtcedula.getText();
                
                //Empleado.cargarlistaEmpleado().get(i).setCedula(txtcedula.getText());
                    ArrayList<Empleado> lista = Empleado.cargarlistaEmpleado();
                    
                    for (int i=0; i<lista.size();i++){
                        if (cedulaIngresada.equals(lista.get(i).getCedula())){
                            lista.get(i).setNombre(txtNombre.getText());
                            lista.get(i).setTelefono(txtTelefono.getText());
                            lista.get(i).setEmail(txtEmail.getText());
                            // COMBOBOX
                        }
                    }
                    
                Empleado.sobreescribirTXT(lista);
                App.setRoot("empleados");
                System.out.println(lista);
            }
                    
    }

        /*
         //Recuperando lo pedido
    //Cedula pedida
    //int cedula = txtCedula.
    String cedula = txtcedula.getText();
    //recuperando nombre
    String nombre = txtNombre.getText();
    //recuperando telefono
    String telefono = txtTelefono.getText();
    //recuperando email
    String email = txtEmail.getText();
    //Estado
    //String estado = comboboxEstado.getItems();
        for(int i=0;i<Empleado.cargarlistaEmpleado().size();i++){
            if((Empleado.cargarlistaEmpleado().get(i).getCedula()) == Integer.parseInt(cedula)){
                Empleado.cargarlistaEmpleado().get(i).setCedula(Integer.parseInt(cedula));
                Empleado.cargarlistaEmpleado().get(i).setNombre(nombre);
                Empleado.cargarlistaEmpleado().get(i).setTelefono(Integer.parseInt(telefono));
                Empleado.cargarlistaEmpleado().get(i).setEmail(email);
                App.setRoot("empleados");
            }else{
                System.out.println("Cedula no existe");
            } 
        }
  */
