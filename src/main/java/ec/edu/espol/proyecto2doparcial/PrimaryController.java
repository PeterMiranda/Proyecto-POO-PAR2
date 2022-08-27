package ec.edu.espol.proyecto2doparcial;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
     @FXML
    private void switchToCitas() throws IOException {
        App.setRoot("citas");
    }
    
     @FXML
    private void switchToAtenciones() throws IOException {
        App.setRoot("atenciones");
    }
    
     @FXML
    private void switchToEmpleados() throws IOException {
        App.setRoot("empleados");
    }
    
     @FXML
    private void switchToClientes() throws IOException {
        App.setRoot("clientes");
    }
}


