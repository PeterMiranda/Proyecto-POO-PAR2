/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.proyecto2doparcial;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
/**
 * FXML Controller class
 *
 * @author irvin
 */
public class ServiciosController implements Initializable {


    @FXML
    private TableColumn<?, ?> columnaNombre;
    @FXML
    private TableColumn<?, ?> columnaDuracion;
    @FXML
    private TableColumn<?, ?> columnaPrecio;
    @FXML
    private TableColumn<?, ?> columnaEstado;
    @FXML
    private Button botonAgregarS;
    @FXML
    private Button botoneditarServicio;
    @FXML
    private Button botonEliminarServicio;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void agregarServicio(ActionEvent event) {
    }

    @FXML
    private void editarServicio(ActionEvent event) {
    }

    @FXML
    private void EliminarServicio(ActionEvent event) {
    }

}
