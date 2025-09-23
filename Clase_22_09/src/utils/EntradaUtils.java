package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaUtils {
        public static <T extends Number> T leerNumero (Scanner sc, Class<T> tipo, String msg){
            boolean valido =false;
            while (!valido) {
                try {
                    System.out.print(msg);
                    if (tipo == Byte.class) {
                        valido = true;
                        return tipo.cast(sc.nextByte());
                    } else if (tipo == Short.class) {
                        valido = true;
                        return tipo.cast(sc.nextShort());
                    } else if (tipo == Integer.class) {
                        valido = true;
                        return tipo.cast(sc.nextInt());
                    } else if (tipo == Long.class) {
                        valido = true;
                        return tipo.cast(sc.nextLong());
                    } else if (tipo == Float.class) {
                        valido = true;
                        return tipo.cast(sc.nextFloat());
                    } else if (tipo == Double.class) {
                        valido = true;
                        return tipo.cast(sc.nextDouble());
                    } else {
                        throw new IllegalArgumentException("Tipo no soportado.");
                    }
                } catch (InputMismatchException e) {
                    System.err.println(" Entrada inválida. Intente de nuevo.");
                    sc.next();
                }
            }
            return null;
        }

}
