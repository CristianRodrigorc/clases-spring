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

    public void intentarLetraOPalabra(String letra){
        if (letra.length() == 1) {
            char let = letra.charAt(0);
            if(!palabra.comprobarLetra(let)){
                jugador.perderIntentos();
            }
            
        }else{
            if(!palabra.comprobarPalabra(letra, letra)){
                jugador.perderIntentos();
            }
        }
    }

    public boolean juegoTerminado(){
        int intentosJugador = jugador.getIntentos();
        if(intentosJugador == 0){
            System.out.println("\n\n*** Se terminaron los intentos ***");
            return true;
        }else if(palabra.getLetrasAcertadasPalabra() == palabra.getPalabraMostrada()){
            System.out.println("*** Ganaste acertaste en la palabra ***");
            return true;
        }else{
            return false;
        }
    }
}