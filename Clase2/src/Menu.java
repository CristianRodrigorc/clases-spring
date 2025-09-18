import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void mostrarMenu(ArrayList<Vehiculo> listaVehiculos) {
        boolean condition = true;
        System.out.println("¡¡¡¡BIENVENIDO AL MENU!!!!");
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean condition2 = true;
        do {
            do {
                try{
                    System.out.println("Seleccione una opción:");
                    System.out.println("1. Listar Vehiculo");
                    System.out.println("2. Registrar Vehiculo");
                    System.out.println("3. Salir\n");
                    
                    option = sc.nextInt();
                    condition2 = false;
                }catch(InputMismatchException e){
                    System.out.println("Opción inválida. Por favor, ingrese un número.");
                    sc.nextLine();
                    continue;
                }
            } while (condition2);
    
            switch (option) {
                case 1:
                    System.out.println("Los vehículos existentes son:");
                    System.out.println(OperacionVehiculo.listarVehiculos(listaVehiculos));
                    System.out.println("\n\n\n");
                    break;
                 case 2:
                    listaVehiculos.add(OperacionVehiculo.crearVehiculo());
                    System.out.println("Vehículo registrado exitosamente");
                    break;
            
                case 3:
                    sc.close();
                    condition = false;
                    System.out.println("Saliendo del menú...");
                    break;
            }
        } while (condition);
    }
}
