package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorDoc {
    private static String ruta = "src\\resources\\ahorcado.txt";
    

    public static int contadoLineas(){
        int contador = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = br.readLine())!= null){
                contador++;
            }
            return contador;
        } catch (IOException e) {
                e.printStackTrace();
                return 0;
        }
    }

    public static String selecionLinea(int numLinea){
        int contador = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = br.readLine())!= null){
                contador++;
                if(contador == numLinea){
                    break;
                }
            }
            return linea;
        } catch (IOException e) {
                e.printStackTrace();
                return "";
        }
    }

}
