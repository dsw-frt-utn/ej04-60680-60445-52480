package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.IngresarVehiculo;
import views.ListarVehiculosView;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        ListarVehiculosView view = new ListarVehiculosView();
        view.setVisible(true);
        IngresarVehiculo vista = new IngresarVehiculo();
        vista.setVisible(true);
        
    }
}
