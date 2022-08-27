package ec.edu.espol.proyecto2doparcial;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {

    @FXML
    private Button RegistrarAtencionButton;
    @FXML
    private Button secondaryButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void switchToRegistroAtencion(ActionEvent event) throws IOException {
        App.setRoot("RegistroDeAtencion");
    }
}