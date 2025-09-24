package ejercicio5;

import utils.EntradaUtils;

public class Ejercicio_5_2 {

    //Crea un programa que pida un número entero al
    //usuario y diga si es positivo (mayor que cero) o si, por el contrario, no lo es
    //(usando "else").
    public void ejercicio_5_2_1(){
        double num1 = EntradaUtils.leerNumero(Double.class, "Ingrese un número: ");
        if (num1> 0) {
            System.out.println("El número es positivo");
        }else if(num1<0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es "+num1);
        }
    }
}
