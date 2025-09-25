package ejercicio6;

import utils.EntradaUtils;

public class Ejercicio_6_3 {
    //Crea un programa que muestre los números del 1 al 15, usando "for"
    public void ejercicio_1(){
        for (int i = 1; i <= 15; i++) {
            System.out.println(i);
        }
    }

    //Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "for"
    public void ejercicio_2(){
        for (int i = 20; i > 0; i-=2) {
            System.out.println(i);
        }
    }

    //Crea un programa que muestre la "tabla de multiplicar del 5", usando "for"
    public void ejercicio_3(){
        int num, resultado;
        num = 5;
        for (int i = 0; i <= 12; i++) {
            resultado = num * i;
            System.out.println(num+" * "+i+" = "+resultado);
        }
    }

    //Crea un programa que muestre los números enteros del 0 al 100 que son múltiplos de 6 
    //(el resto al dividir por 6 sea 0).
    public void ejercicio_4(){
        for (int i = 1; i <= 100; i++) {
            if(i % 6 == 0){
                System.out.println("El número "+i+" es múltiplo de 6");
            }
        }
    }

    //Crea un programa que muestre los números enteros entre 0 y el que introduzca el usuario
    //que sean múltiplos de 3 (el resto al dividir por 3 es 0) y a la vez múltiplos de 7 (ídem).
    public void ejercicio_5(){
        int num;
        num = EntradaUtils.leerNumero(Integer.class, "Ingrese un número entero:");
        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0 && i % 7 == 0){
                System.out.println("El número "+i+" es múltiplo de 3 y 7");
            }
        }
    }

    //Crea un programa que pida dos números de tipo byte al usuario y escriba en pantalla un rectángulo 
    //formado por asteriscos, que tendrá como alto el primer número y como ancho el segundo número.
    public void ejercicio_6(){
        byte num1,num2;
        num1 = EntradaUtils.leerNumero(Byte.class, "Ingrese un número en formato byte (-128 al 127) para la altura:");
        num2 = EntradaUtils.leerNumero(Byte.class, "Ingrese un número en formato byte (-128 al 127) para el ancho:");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Crea un programa que pida un número de tipo byte al usuario y escriba en pantalla un cuadrado hueco
    //de ese ancho, que tendrá un borde formado por asteriscos y su interior serán espacios en blanco. Por
    //ejemplo, para un tamaño de 4 sería:
    //****
    //*  *
    //*  *
    //****
    public void ejercicio_7(){
        byte num1;
        num1 = EntradaUtils.leerNumero(Byte.class, "Ingrese un número en formato byte (-128 al 127) para la altura:");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num1; j++) {
                if(i == 0 || j == 0 || i == num1-1 || j == (num1-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    
    }
    
    //Crea un programa que pida al usuario un número entero largo y muestre cuáles son sus divisores
    //(aquellos entre los que se puede dividir, obteniendo como resto 0).
    public void ejercicio_6_3_8(){
        long num1;
        num1 = EntradaUtils.leerNumero(Long.class, "Ingrese un número para hallar sus divisores:");
        for (int i = 1; i < num1; i++) {
            if(num1 % i == 0){
                System.out.println(i+ " es un divisor de "+num1);
            }
        }
    }

    //Crea un programa que pida al usuario un número entero largo y diga si es primo (si sólo es divisible entre 1 y él mismo).
    public void ejercicio_6_3_9(){
        int num1, num2;
        num1 = EntradaUtils.leerNumero(Integer.class, "Ingrese un número para hallar sus divisores:");
        num2=num1;
        for (int i = 2; i < num1; i++) {
            if(num1 % i == 0){
                num2 = i;
                System.out.println(num2);
            }
        }
        System.out.println(num2);
        if(num2 == num1){
            System.out.println("El número "+num1+" es primo...");
        }else{
            System.out.println("El número "+num1+" no es primo...");
        }
    }

    //Crea un programa que pida al usuario dos números enteros largos y diga cuántos números 
    //primos hay entre ellos (ambos incluidos).
    public void ejercicio_6_3_10(){
        int num1, num2,valor1,valor2,condicional;
        num1 = EntradaUtils.leerNumero(Integer.class, "Ingrese el primer número para hallar sus divisores:");
        num2 = EntradaUtils.leerNumero(Integer.class, "Ingrese el segundo número para hallar sus divisores:");
        condicional = 1;
        if(num1>num2){
            valor1 = num1;
            valor2 = num2;
        }else{
            valor1 = num2;
            valor2 = num1;
        }
        for (int i = valor2; i < valor1; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    condicional = j;
                }
            }
            if(condicional == 1){
                System.out.println(i+" es primo...");
            }
            condicional =1;
        }
    
    }
}
