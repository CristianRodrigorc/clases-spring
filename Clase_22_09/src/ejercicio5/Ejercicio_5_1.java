package ejercicio5;

import java.util.Scanner;

import utils.EntradaUtils;

public class Ejercicio_5_1 {
    
    
    //Crea un programa que pida un número al usuario y
    //diga si es positivo (mayor que cero)
    public void ejercicio_5_1_1(){
        Scanner sc = new Scanner(System.in);
        double num1 = EntradaUtils.leerNumero(sc, Double.class, "Ingrese un número: ");
        if (num1> 0) {
            System.out.println("El número es positivo");
        }else if(num1<0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es "+num1);
        }
    }
}
