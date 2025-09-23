package ejercicio5;

import java.util.Scanner;

import utils.EntradaUtils;

public class Ejercicio_5_4 {
    //Crea un programa que pida al usuario dos números
    //enteros y diga si los dos son positivos (el primero Y el segundo).
    public void ejercicio_5_4_1(){
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero(sc, Double.class, "Ingrese un número: ");
        num2 = EntradaUtils.leerNumero(sc, Double.class, "Ingrese un número: ");
        if(num1>0 && num2 > 0){
            System.out.println("Los dos números son positivos");
        }else{
            System.out.println("Los  dos números no son positivos...");
        }
    }

    //Crea un programa que pida al usuario dos números
    //enteros y diga si al menos uno de los dos es positivo (el primero O el
    //segundo).
    public void ejercicio_5_4_2(){
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero(sc, Double.class, "Ingrese un número: ");
        num2 = EntradaUtils.leerNumero(sc, Double.class, "Ingrese un número: ");
        if(num1 > 0 && num2 > 0){
            System.out.println("Los dos números son positivos");
        }else if(num1 < 0 && num2 < 0){
            System.out.println("Los  dos números no son positivos...");
        }else{
            System.out.println("Al menos uno de los números es positivo");
        }
    }
    //Crea un programa que pida al usuario dos números
    //enteros y cuántos de ellos son pares.
    public void ejercicio_5_4_3(){
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero(sc, Double.class, "Ingrese un número: ");
        num2 = EntradaUtils.leerNumero(sc, Double.class, "Ingrese un número: ");
        if(num1 > 0 && num2 > 0){
            System.out.println("Los dos números son positivos");
        }else if(num1 < 0 && num2 < 0){
            System.out.println("Los  dos números no son positivos...");
        }else{
            System.out.println("Al menos uno de los números es positivo");
        }
    }
    //Crea un programa que pida tres números enteros
    //largos al usuario y diga cuál es el mayor de los tres.
    public void ejercicio_5_4_4(){
        long num1,num2,num3, num_mayor;
        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero(sc, Long.class, "Ingrese un número largo: ");
        num2 = EntradaUtils.leerNumero(sc, Long.class, "Ingrese un número largo: ");
        num3 = EntradaUtils.leerNumero(sc, Long.class, "Ingrese un número largo: ");
        if(num1 > num2 && num1 > num3){
            num_mayor = num1;
        }else if(num2 > num1 && num2 > num3){
            num_mayor = num2;
        }else{
            num_mayor = num3;
        }
        System.out.println("El número mayor es: "+num_mayor);
    }
}
