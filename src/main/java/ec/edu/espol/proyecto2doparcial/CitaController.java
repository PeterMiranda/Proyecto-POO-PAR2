package ec.edu.espol.proyecto2doparcial;

import java.io.IOException;
import javafx.fxml.FXML;

public class CitaController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
