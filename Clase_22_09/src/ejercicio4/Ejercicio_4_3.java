package ejercicio4;

import java.util.Scanner;

import utils.EntradaUtils;

public class Ejercicio_4_3 {

    //Crea un programa que calcule y muestre el
    //producto de dos números enteros que introduzca el usuario.
    public void ejercicio_4_3_1(){
        Scanner sc = new Scanner(System.in);
        double num1 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el primer número:");
        double num2 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el segundo número:");
        double producto = num1+num2;
        System.out.println("El producto de "+num1+" * "+num2+" es "+producto);
        sc.close();
    }

    //Crea un programa que calcule y muestre la división
    //de dos números enteros que introduzca el usuario.
    public void ejercicio_4_3_2(){
        Scanner sc = new Scanner(System.in);
        double num1 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el primer número:");
        double num2 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el segundo número:");
        double producto = num1+num2;
        System.out.println("La división de "+num1+" / "+num2+" es "+producto);
        sc.close();
    }

    //Crea un programa que calcule y muestre el resto
    //de la división de dos números enteros que introduzca el usuario.
    public void ejercicio_4_3_3(){
        Scanner sc = new Scanner(System.in);
        double num1 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el primer número:");
        double num2 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el segundo número:");
        double producto = num1%num2;
        System.out.println("El resto de "+num1+" % "+num2+" es "+producto);
        sc.close();
    }

    //Crea un programa que pida al usuario una longitud
    //en millas (por ejemplo, 3) y calcule su equivalencia en metros (1 milla = 1609m).
    public void ejercicio_4_3_4(){
        Scanner sc = new Scanner(System.in);
        double num1 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el valor de la longitud:");
        double conversion = num1*1609.34;
        System.out.println("El valor de "+ num1 + "mi en metros es: "+conversion+"m");
        sc.close();
    }

    //Crea un programa que pida al usuario una
    //temperatura en grados centígrados y calcule (y muestre) a cuántos grados
    //Fahrenheit equivalen (F = 9*C/5 + 32).
    public void ejercicio_4_3_5(){
        Scanner sc = new Scanner(System.in);
        double num1 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el valor de la temperatura en Grados Centígrados:");
        double conversion = (num1*(9/5))+ 32;
        System.out.println("El valor de "+ num1 + "° en Fahrenheit es: "+conversion+"°F");
    }

    //Crea un programa que pregunte al usuario la base
    //y la altura de un triángulo y muestre su superficie (S = B*A/2).
    public void ejercicio_4_3_6(){
        Scanner sc = new Scanner(System.in);
        double num1 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el valor de la base:");
        double num2 = EntradaUtils.leerNumero(sc, Double.class,"Ingrese el valor de la altura:");
        double area = (num1*num2)/2;
        System.out.println("El valor del área del triángulo es: "+area+"m2");
    }
}
