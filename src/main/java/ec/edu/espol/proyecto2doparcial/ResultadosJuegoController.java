/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.proyecto2doparcial;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author PC
 */
public class ResultadosJuegoController implements Initializable {

    public static int valor1=0;
    
    @FXML
    private Label resultados;
    @FXML
    private Label equivocaciones;
    @FXML
    private Label cantidad;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cantidad.setText(String.valueOf(valor1));
    }    
    
}
