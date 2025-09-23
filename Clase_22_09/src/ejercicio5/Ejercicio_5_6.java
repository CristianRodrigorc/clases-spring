package ejercicio5;

import java.util.Scanner;

import utils.EntradaUtils;

public class Ejercicio_5_6 {
    //Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si ese número es par
    //o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".
    public void ejercicio_5_6_1_if(){
        int num1,par_impar;
        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero(sc, Integer.class, "Ingrese un número: ");
        if(num1 % 2==0){
            par_impar = 1;
        }else{
            par_impar = 0;
        }

        System.out.println("El numero es: "+ par_impar);
    }
    public void ejercicio_5_6_1_condicional(){
        int num1,par_impar;
        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero(sc, Integer.class, "Ingrese un número: ");
        par_impar = num1 % 2 == 0 ? 1 : 0;
        System.out.println("");
    }

    //Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga el 
    //valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".
    public void ejercicio_5_6_2_if(){
        byte num1,num2,menor;
        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero(sc, Byte.class, "Ingrese un  primer número (byte): ");
        num2 = EntradaUtils.leerNumero(sc, Byte.class, "Ingrese un segundo número (byte): ");
        if(num1>num2){
            menor = num1;
        }else{
            menor = num2;
        }
        System.out.println("El número menor es: "+menor);
    }

        public void ejercicio_5_6_2_condicional(){
        byte num1,num2,menor;
        Scanner sc = new Scanner(System.in);
        num1 = EntradaUtils.leerNumero(sc, Byte.class, "Ingrese un  primer número (byte): ");
        num2 = EntradaUtils.leerNumero(sc, Byte.class, "Ingrese un segundo número (byte): ");
        
        menor = num2 > num1 ? num1 : num2; 
        System.out.println("El número menor es: "+menor);
    }
}
