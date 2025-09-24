package ejercicio4;

import java.time.LocalDate;
import utils.EntradaUtils;

public class Ejercicio_4_5 {

    //Crea un programa que calcule y muestre la suma
    //de dos números de dos cifras (de tipo byte) que introduzca el usuario.
    public void ejercicio_1() {
        byte num1, num2, resultado;

        num1 = EntradaUtils.leerNumero(Byte.class ,"Ingrese el primer número de tipo Byte (-128 al 127)");
        num2 = EntradaUtils.leerNumero(Byte.class,"Ingrese el segundo número de tipo Byte (-128 al 127)");

        resultado = (byte) (num1 + num2);
        System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es = " + resultado);
    }

    //Crea un programa que pida al usuario su año de nacimiento y el año actual (usando datos de tipo short)
    //y halle la diferencia de ambos para obtener su edad.
    public void ejercicio_2(){
        short anio_user,anio_actual,diferencia;
        anio_user =(short) (short) EntradaUtils.leerNumero(Short.class, "Ingrese su año de nacimiento: ");
        anio_actual = (short) LocalDate.now().getYear();
        diferencia = (short) (anio_actual - anio_user);
        System.out.println("La diferencia en edad del usuario es: "+diferencia);
    }

    //Crea un programa que calcule y muestre la división
    //de dos números reales de doble precisión introducidos por el usuario.
    public void ejercicio_3(){
        double num1,num2, resultado;
        num1 = EntradaUtils.leerNumero(Double.class, "Ingrese el primer número:");
        num2 = EntradaUtils.leerNumero(Double.class, "Ingrese el segundo número:");
        resultado = num1 / num2;
        System.out.println("El resultado de la división es: "+ resultado);
    }

    //Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) 
    //y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).
    public void ejercicio_4(){
         double num1,valor_conversion, resultado;
        num1 = EntradaUtils.leerNumero(Double.class, "Ingrese el número de millas a convertir:");
        valor_conversion = 1.609;
        resultado = num1 * valor_conversion;
        System.out.println("El valor de "+num1+"mi convertido a Kilómetros es "+resultado+"km");
    }


}
