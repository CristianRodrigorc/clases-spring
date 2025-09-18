import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        Menu menu = new Menu();
        menu.mostrarMenu(listaVehiculos);
        
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
}
