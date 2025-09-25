package model;

public class Ahorcado {
    private Jugador jugador;
    private Palabra palabra;

    public Ahorcado(Jugador jugador, Palabra palabra){
        this.jugador = jugador;
        this.palabra = palabra;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public void intentarLetraOPalabra(char letra){
        if (!palabra.comprobarLetra(letra)) {
            jugador.perderIntentos();
        }
    }

    public boolean juegoTerminado(){
        int intentosJugador = jugador.getIntentos();
        if(intentosJugador == 0){
            return true;
        }else{
            return false;
        }
    }
    
}
