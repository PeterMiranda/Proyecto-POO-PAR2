/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ec.edu.espol.proyecto2doparcial;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class PantallaInicioController implements Initializable {

    @FXML
    private Button regresarButtom;
    @FXML
    private Button iniciarJuegoButtom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void switchToRegistroAtencion(ActionEvent event) throws IOException {
        App.setRoot("RegistroDeAtencion");
        
    }

    @FXML
    private void switchToGame1(ActionEvent event) throws IOException {
        App.setRoot("Game1");
        
    }
    
}
