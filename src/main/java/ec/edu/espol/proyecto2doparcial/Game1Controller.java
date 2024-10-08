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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author PC
 */
public class Game1Controller implements Initializable {

    @FXML
    private Button SiguienteButtom;
    @FXML
    private TextField gameTF;
    @FXML
    private Button validarButtom;
    @FXML
    private ImageView Check;
    @FXML
    private ImageView X;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        SiguienteButtom.setDisable(true);
        X.setVisible(false);
        Check.setVisible(false);
    }    

    @FXML
    private void switchToGame2(ActionEvent event) throws IOException {
        App.setRoot("Game2");
    }
    
    int ingreso;
    
    private void Validar() {
        ingreso = Integer.parseInt(gameTF.getText());
        if (ingreso!=4){
            SiguienteButtom.setDisable(true);
            X.setVisible(true);
            Check.setVisible(false);
            gameTF.clear();
            ResultadosJuegoController.valor1+=1;
            
        }else {
            SiguienteButtom.setDisable(false);    
            X.setVisible(false);
            Check.setVisible(true);
        }
    }

    @FXML
    private void validarAction(ActionEvent event) {
        Validar();
        
    }
    
}
