import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class OperacionVehiculo {


    public static int sumarAnios(Vehiculo vehiculo, Bicicleta bici){
        return vehiculo.getAnio() + bici.getAnio();
    }

    public static int sumarRuedas(Vehiculo vehiculo, Bicicleta bici){
        return vehiculo.getNumRuedas() + bici.getNumRuedas();
    }

    public static String sorpresa(){
        return "Sorpresa!!!!!";
    }

    public static Vehiculo crearVehiculo(String marca, String modelo, int anio, int numRuedas){
        return new Vehiculo(marca, modelo, anio, numRuedas);
    }

    public static String listarVehiculos(ArrayList<Vehiculo> lista){
        if(lista.isEmpty()){
            return "No hay vehículos regitrados";
        }else{
            StringBuilder sb = new StringBuilder();
            int contador = 1;
            for (Vehiculo vehiculo : lista) {
                sb.append("Vehículo"+ contador +": "+vehiculo.toString()+"\n");
                contador++;
            }
            return sb.toString();
        }
    }

    public static Vehiculo crearVehiculo(){
        Scanner sc= new Scanner (System.in);
        boolean condition = true;
        int tipoVehiculo = 0;
        do {
            try {
            System.out.println("Selecciona el tipo de vehículo a crear:");
            System.out.println("1. Coche\n2. Bicicleta");
            tipoVehiculo = sc.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Opción inválida. Por favor, ingrese 1 o 2.");
                sc.next();
                continue;}
        } while (condition);
        sc.nextLine();
        if(tipoVehiculo == 1){
            Coche vehiculo = new Coche();
            System.out.println("Ingrese la marca del vehículo");
            vehiculo.setMarca(sc.nextLine());
            System.out.println("Ingrese el modelo del vehículo");
            vehiculo.setModelo(sc.nextLine());
            System.out.println("Ingrese el año del vehículo");
            vehiculo.setAnio(sc.nextInt());
            System.out.println("Ingrese el número de ruedas del vehículo");
            vehiculo.setNumRuedas(sc.nextInt());
            System.out.println("Ingrese el número de puertas del coche");
            vehiculo.setNumPuertas(sc.nextInt());
            sc.nextLine();
            return vehiculo;
            
        }else{
            Bicicleta vehiculo = new Bicicleta();
            System.out.println("Ingrese la marca del vehículo");
            vehiculo.setMarca(sc.nextLine());
            System.out.println("Ingrese el modelo del vehículo");
            vehiculo.setModelo(sc.nextLine());
            System.out.println("Ingrese el año del vehículo");
            vehiculo.setAnio(sc.nextInt());
            System.out.println("Ingrese el número de ruedas del vehículo");
            vehiculo.setNumRuedas(sc.nextInt());
            System.out.println("Ingrese el número de marchas de la bicicleta");
            vehiculo.setNumMarchas(sc.nextInt());
            return vehiculo;
        }

    }
}
