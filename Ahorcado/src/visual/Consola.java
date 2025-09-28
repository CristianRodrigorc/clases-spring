package visual;

import java.util.Scanner;

import model.Ahorcado;
import model.Palabra;
import utils.UtilitiesLines;
import model.Jugador;

public class Consola {
    private static Scanner sc = new Scanner(System.in);

    public void bienvenido(){
        System.out.println("**********BIENVENIDO**********");
    }

    public void mostrarEstado(Ahorcado ahorcado){
        Palabra palabra = ahorcado.getPalabra();
        Jugador jugador = ahorcado.getJugador();
        System.out.print("Letras acertadas: "+ palabra.getLetrasAcertadas());


        System.out.println("\nLetras usadas: "+palabra.getLetrasElegidas());

        System.out.println("Intentos restantes: "+jugador.getIntentos());
    }

    public String pedirLetraOPalabra(){
        boolean valido = false;
        String msg, palabra;
        palabra = "";
        msg ="Ingrese una letra o una palabra cómo intento: ";

        while (!valido) {
            try {
                System.out.print(msg);
                palabra = sc.nextLine();
                valido = true;
            } catch (Exception e) {
                System.err.println(" Entrada inválida. Intente de nuevo.");
                sc.nextLine();
            }
        }
        return palabra;
    }

    public void cerrarScanner(){
        sc.close();
    }  
}
