/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.proyecto2doparcial;

import ec.edu.espol.proyecto2doparcial.usuarios.Constantes;
import ec.edu.espol.proyecto2doparcial.usuarios.Empleado;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author irvin
 */
public class EmpleadoAgregarController implements Initializable {


    @FXML
    private TextField txtCedula;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtEmail;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void volver(ActionEvent event) throws IOException {
        App.setRoot("empleados");
    }

    
    
    @FXML
    private void registrar(ActionEvent event) throws IOException {
        
    //Recuperando lo pedido
    //Cedula pedida
    //int cedula = txtCedula.
    String cedula = txtCedula.getText();
    //recuperando nombre
    String nombre = txtNombre.getText();
    //recuperando telefono
    String telefono = txtTelefono.getText();
    //recuperando email
    String email = txtEmail.getText();
    
    
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(Constantes.rutaEmpleados,true));){
            bw.newLine();
            bw.write(cedula+","+nombre+","+telefono+","+email+","+true);
        }catch (IOException e){
            System.out.println("error");
        }
        //tablaEmpleados.getItems().setAll() = Empleado.cargarlistaEmpleado());
         App.setRoot("empleados");
    
    /*
    Empleado e1 = new Empleado(Integer.parseInt(cedula), nombre,Integer.parseInt(telefono), email, true);
    Empleado.registrarEmpleado(e1);
    App.setRoot("empleados");
    System.out.println(Empleado.cargarlistaEmpleado());
*/
    }

}
