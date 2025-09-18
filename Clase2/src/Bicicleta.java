public class Bicicleta extends Vehiculo {
    private int numMarchas;

    public Bicicleta(String marca, String modelo, int anio, int ruedas, int numMarchas){
        super(marca, modelo, anio, ruedas);
        this.numMarchas = numMarchas;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    @Override
    public String toString() {
        return "[marca=" + getMarca() + ", modelo=" + getModelo() + ", anio=" + getAnio() + " numRuedas=" + getNumRuedas + " numMarchas=" + numMarchas + "]";
    }
}
