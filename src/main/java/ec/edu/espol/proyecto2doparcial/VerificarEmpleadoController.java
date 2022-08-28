/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.proyecto2doparcial;

import ec.edu.espol.proyecto2doparcial.usuarios.Empleado;
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
public class VerificarEmpleadoController implements Initializable {


    @FXML
    private TextField txtcedula;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void verificar(ActionEvent event) {
        //Debo verificar si existe esta cedula
        String cedula = txtcedula.getText();
        Empleado.cargarlistaEmpleado();
        //if(Integer.parseInt(cedula))
    }

    @FXML
    private void volver(ActionEvent event) throws IOException {
        App.setRoot("empleados");
    }

}
