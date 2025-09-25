package model;

public class Jugador {
    private String nombre;
    private int intentos;

    public Jugador(String nombre){
        this.nombre = nombre;
        this.intentos = 6;
    }

    public void perderIntentos(){
        intentos--;
    }

    public int getIntentos(){
        return intentos;
    }

    public String getNombre() {
        return nombre;
    }
}
