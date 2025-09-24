package ejercicio5;

import utils.EntradaUtils;

public class Ejercicio_5_3 {

    //Crea un programa que pida al usuario que introduzca el número 12. 
    //Después debe decirle si lo ha hecho correctamente o no.
    public void ejercicio_5_3_1(){
        double num1 = EntradaUtils.leerNumero(Double.class, "Ingrese el número 12: ");
        if(num1==12){
            System.out.println("Felicidades, lo hiciste bien");
        }else{
            System.out.println("Error ingresaste otro número");
        }
    }

    //Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero), 
    //si es negativo (menor que cero) o si, por el contrario, es exactamente 0 (necesitarás enlazar 
    //2 "if" uno tras otro).

    public void ejercicio_5_3_2(){
        double num1 = EntradaUtils.leerNumero(Double.class, "Ingrese un número: ");
        if (num1> 0) {
            System.out.println("El número es positivo");
        }else if(num1<0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es "+num1);
        }
    }
    //Ejercicio propuesto 5.3.3: Crea un programa que pida dos números reales
    //(con decimales) al usuario y diga cuál es el mayor de ellos.
    public void ejercicio_5_3_3(){
        double num1,num2;
        num1 = EntradaUtils.leerNumero(Double.class, "Ingrese un número: ");
        num2 = EntradaUtils.leerNumero(Double.class, "Ingrese un número: ");
        if(num1>num2){
            System.out.println("El número mayor es "+num1);
        }else if(num2> num1){
            System.out.println("El número mayor es "+num2);
        }else{
            System.out.println("Los números son iguales...");
        }
    }

    //Crea un programa que pida al usuario y diga si ese número es múltiplo de 3 
    //(pista: puedes utilizar la operación "módulo", el "resto de la división": %)
    public void ejercicio_5_3_4(){
        double num1 = EntradaUtils.leerNumero(Double.class, "Ingrese un número: ");
        if (num1 % 3 == 0) {
            System.out.println("El número es múltiplo de 3");
        }else if(num1 % 3 != 0){
            System.out.println("El número no es múltiplo de 3");
        }else{
            System.out.println("El número es "+num1);
        }
    }
    
    //Crea un programa que diga si el número introducido por el usuario es impar o no lo es.
    public void ejercicio_5_3_5(){
        double num1 = EntradaUtils.leerNumero(Double.class, "Ingrese un número: ");
        if (num1 % 2 == 0) {
            System.out.println("El número es par");
        }else if(num1 % 2 != 0){
            System.out.println("El número es impar");
        }else{
            System.out.println("El número es "+num1);
        }
    }
}
