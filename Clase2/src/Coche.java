public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int anio, int ruedas, int numPuertas){
        super(marca, modelo, anio, ruedas);
        this.numPuertas = numPuertas;
    }

    public Coche(){
        super();
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "[marca=" + getMarca() + ", modelo=" + getModelo() + ", anio=" + getAnio() + " numRuedas=" + getNumRuedas + " numPuertas=" + numPuertas + "]";
    }

}
