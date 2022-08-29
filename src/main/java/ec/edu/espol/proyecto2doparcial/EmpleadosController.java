/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.proyecto2doparcial;

import ec.edu.espol.proyecto2doparcial.usuarios.Empleado;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author irvin
 */
public class EmpleadosController implements Initializable {

    @FXML
    private TableColumn<Empleado, String> columnaCedula;
    @FXML
    private TableColumn<Empleado, String> columnaNombre;
    @FXML
    private TableColumn<Empleado, String> columnaTelefono;
    @FXML
    private TableColumn<Empleado, String> columnaEmail;
    @FXML
    private TableColumn<Empleado, Boolean> columnaEstado;
    @FXML
    private Button agregarEmpleado;
    @FXML
    private Button editarEmpleado;
    @FXML
    private Button eliminarEmpleado;
    @FXML
    private TableView<Empleado> tableviewEmpleado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        columnaCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        columnaEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnaEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        tableviewEmpleado.getItems().setAll(Empleado.cargarlistaEmpleado());
        
    }    

    @FXML
    private void botonAgregarEmpleado(ActionEvent event) throws IOException {
        App.setRoot("empleadoAgregar");
    }

    @FXML
    private void botoneditarEmpleado(ActionEvent event) throws IOException {
        App.setRoot("empleadoEditar");
    }

    @FXML
    private void botonEliminarEmpleado(ActionEvent event) {
        Empleado empleadoSeleccionado = tableviewEmpleado.getSelectionModel().getSelectedItem();

                
        ArrayList<Empleado> lista = Empleado.cargarlistaEmpleado();
                    
                    for (int i=0; i<lista.size();i++){
                        if ((empleadoSeleccionado.getCedula()).equals(lista.get(i).getCedula())){
                            empleadoSeleccionado.setEstado(false);
                        }
                    }
                    
            Empleado.sobreescribirTXT(lista);
            tableviewEmpleado.getItems().setAll(Empleado.cargarlistaEmpleado());
    }


}