package utils;

import java.util.Random;
import java.util.Scanner;

public class UtilitiesLines {
    private static Scanner sc = new Scanner(System.in);

    public static String escogerPalabra(){
        int rango = LectorDoc.contadoLineas();
        Random rand = new Random();
        int numLinea = rand.nextInt(rango)+1;
        System.out.println(numLinea);
        String lineaElegida = LectorDoc.selecionLinea(numLinea);
        return lineaElegida;
    }

    public static String leerValor(Class<T> tipo, String msg) {
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(msg);

                if (tipo == Character.class) {
                    valido = true;
                    return tipo.cast(sc.next().charAt(0));
                }else if (tipo == String.class) {
                    valido = true;
                    return tipo.cast(sc.next());
                } else {
                    throw new IllegalArgumentException("Tipo no soportado.");
                }

            } catch (Exception e) {
                System.err.println(" Entrada inválida. Intente de nuevo.");
                sc.next();
            }
        }
        return null;
    }

    public void cerrarScanner(){
            sc.close();
        }    

}
