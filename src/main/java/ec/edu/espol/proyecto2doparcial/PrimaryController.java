package ec.edu.espol.proyecto2doparcial;
import ec.edu.espol.proyecto2doparcial.usuarios.Empleado;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class PrimaryController implements Initializable {

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
    @Override
    public void initialize(URL url, ResourceBundle rb){
       
    }
}


