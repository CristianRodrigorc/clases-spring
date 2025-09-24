package ejercicio6;

import java.util.Scanner;

import utils.EntradaUtils;

public class Ejercicio_6_2 {
    //Crea un programa que muestre los números del 1 al 10, usando "do-while"
    public void ejercicio_6_2_1(){
        boolean condition = true;
        int contador = 1;
        do {
            System.out.println(contador);
            contador++;
        } while (condition && contador <= 10);
    }

    //Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "do-while"
    public void ejercicio_6_2_2(){
        boolean condition = true;
        int contador = 20;
        do {
            System.out.println(contador);
            contador-=2;
        } while (condition&&contador>0);

    }

    //Crea un programa que muestre la "tabla de multiplicar del 5", usando "do-while"
    public void ejercicio_6_2_3(){
        boolean condition = true;
        int contador,valor,resultado;
        contador = 0;
        valor = 5;
        do {
            resultado = contador * valor;
            System.out.println(valor+" * "+contador+" = "+ resultado);
            contador++;
        } while (condition && contador<=12);
    }

    //Crea un programa que pida al usuario dos números enteros y muestre su suma. Se repetirá 
    //hasta que los dos sean 0. Emplea do-while.
    public void ejercicio_6_2_4(){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean condition = true;
        do {
            System.out.println("********BIENVENIDO********\n\nPara detener el programa los 2 números deben ser \"0\"");
            num1 = EntradaUtils.leerNumero( sc, Integer.class, "Ingrese un número entero:");
            num2 = EntradaUtils.leerNumero( sc, Integer.class, "Ingrese un número entero:");
            if(num1 == 0 && num2 == 0){
                condition = false;
                sc.close();
                System.out.println("********SALIENDO DEL PROGRAMA********");
            }
        } while (condition);

    }

    //Crea un programa que pida al usuario su login (un número entero) y su contraseña (otro número 
    //entero). Se repetirá hasta que el usuario introduzca como login "1809" y como contraseña "1234". En esta
    //ocasión, hazlo con do-while.
    public void ejercicio_6_2_5(){
        int user,pass;
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        do {
            System.out.println("Bienvenido al Login\nDebe ingresar cómo usuario: 1809 y password: 1234 para terminar el login ");
            user = EntradaUtils.leerNumero(sc, Integer.class, "Ingrese un número entero cómo usuario: ");
            pass = EntradaUtils.leerNumero(sc, Integer.class, "Ingrese un número entero cómo password: ");
            if(user == 1809 && pass == 1234){
                System.out.println("Logín completado...");
                condition = false;
            }else{
                System.out.println("Error... Inténtalo otra vez...\n\n\n");
                sc.close();
            }
        } while (condition);
    }
    //Crea un programa que pida un número de tipo byte al usuario y escriba en pantalla un cuadrado 
    //formado por asteriscos, que tendrá como alto y ancho la cantidad introducida por el usuario.
    public void ejercicio_6_2_6(){
        int num1, contador, contador2;
        contador = 1;
        contador2 = 1;
        boolean condition, condition2;
        condition = true;
        condition2 = true;

        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero( sc, Integer.class, "Ingrese un número entero para dibujar un cuadrado:");
        do {
            do {
                System.out.print("*");
                contador2++;
                if(contador2 == num1){
                    condition2 = false;
                }
                contador2++;
            } while (condition2);
            System.out.println("\n");
            if (contador == num1) {
                condition = false;
            }else{
                condition2 = true;
                contador++;
            }
        } while (condition);
    }
}
