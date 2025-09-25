package visual;

import model.Ahorcado;
import model.Palabra;
import model.Jugador;

public class Consola {
    
    public void bienvenido(){
        System.out.println("**********BIENVENIDO**********");
    }

    public void mostrarEstado(Ahorcado ahorcado){
        Palabra palabra = ahorcado.getPalabra();
        Jugador jugador = ahorcado.getJugador();
        System.out.println("Letras acertadas: ");
        palabra.getLetrasAcertadas();

        System.out.println("\nLos intentos restantes son: ");
        jugador.getIntentos();

        System.out.println("\nLetras usadas: ");
        palabra.getLetrasElegidas();
    }

    public String pedirLetraOPalabra(){
        System.out.println("Ingrese una letra o una palabra cómo intento: ");
        
        return ' ';
    }
}
