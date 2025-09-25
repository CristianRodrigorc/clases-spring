import model.Ahorcado;
import model.Jugador;
import model.Palabra;
import utils.LectorDoc;
import utils.UtilitiesLines;
import visual.Consola;

public class App {
    public static void main(String[] args){
        int lineas = LectorDoc.contadoLineas();
        System.out.println("Lineas:"+lineas);
        System.out.println(UtilitiesLines.escogerPalabra());
        String hola = "hola";
        int num = hola.length();
        for (int i = 0; i < num; i++) {
            System.out.println(hola.charAt(i));
        }
        System.out.println(num);


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
        // Juego principal
        while (!juego.juegoTerminado()) {
            consola.mostrarEstado(juego);
            String letra = consola.pedirLetraOPalabra();
            juego.intentarLetra(letra);
        }
        
        consola.mostrarEstado(juego);

    }
}
