package model;

import java.util.ArrayList;
import java.util.List;

public class Palabra {
    private String palabraElegida;
    private List <Character> letrasElegidas;
    private List <Character> letrasAcertadas;


    public Palabra(String palabra){
        this.palabraElegida = palabra;
        this.letrasElegidas = new ArrayList<>();
        this.letrasAcertadas = llenarGuiones();
    }

    public boolean comprobarLetra(char letra){
        boolean retorno = false;
        for (int i = 0; i < palabraElegida.length(); i++) {
            if (palabraElegida.charAt(i) == letra) {
                retorno = true;
                letrasAcertadas.set(i, letra);
            }
        }
        letrasElegidas.add(letra);
        return retorno;
    }

    public static boolean comprobarPalabra(String palabraUser, String palabraEscogida){
        if (palabraUser == palabraEscogida) {
            return true;
        }else{
            return false;
        }
    }

    public String getPalabraMostrada() {
        return this.palabraElegida;

    }

    public List<Character> llenarGuiones(){
        List <Character> list = new ArrayList<>();
        for (Character character : palabraElegida.toCharArray()) {
            list.add('_');
        }
        return list;
    } 

    public String getLetrasElegidas(){
        String subrayado = "\033[4m"; // Subrayado
        String reset = "\033[0m"; // Resetea los estilos de texto

        StringBuilder sb = new StringBuilder("[ ");
        for (Character character : letrasElegidas) {
            sb.append(" "+subrayado + character+reset);
        }
        sb.append(" ]");
        return sb.toString();
    }

    public String getLetrasAcertadas(){
        StringBuilder sb = new StringBuilder("[ ");
        for (Character character : letrasAcertadas) {
            sb.append(" " + character);
        }
        sb.append(" ]");
        return sb.toString();

    }
}
