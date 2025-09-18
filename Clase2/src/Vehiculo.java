public class Vehiculo {
        private String marca;
        private String modelo;
        private int anio;
        private int numRuedas;

        public Vehiculo(String marca, String modelo, int anio, int numRuedas){
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
            this.numRuedas = numRuedas;
        }

        public Vehiculo(){
        }

        public String getMarca() {
            return marca;
        }
        public String getModelo() {
            return modelo;
        }
        public int getAnio() {
            return anio;
        }

        public int getNumRuedas() {
            return numRuedas;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setNumRuedas(int numRuedas) {
            this.numRuedas = numRuedas;
        }

        @Override
        public String toString() {
        return "[marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + " numRuedas=" + numRuedas + "]";
        }

}
