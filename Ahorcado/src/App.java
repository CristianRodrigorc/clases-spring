import model.Ahorcado;
import model.Jugador;
import model.Palabra;
import utils.UtilitiesLines;
import visual.Consola;

public class App {
    public static void main(String[] args){        
        // Crear un jugador
        Jugador jugador = new Jugador("Jugador 1");

        // Obtener una palabra aleatoria
        String palabraRandom = UtilitiesLines.escogerPalabra();
        Palabra palabra = new Palabra(palabraRandom);

        // Crear el juego
        Ahorcado juego = new Ahorcado(jugador, palabra);

        // Crear la consola
        Consola consola = new Consola();

        consola.bienvenido();

        Palabra comprobar = (juego.getPalabra());

        // Juego principal
        while (!juego.juegoTerminado()) {
            System.out.println(comprobar.getPalabraMostrada());
            consola.mostrarEstado(juego);
            String letra = consola.pedirLetraOPalabra();
            juego.intentarLetraOPalabra(letra);
        }
        consola.mostrarEstado(juego);
    }
}
