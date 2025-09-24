package ejercicio5;

import utils.EntradaUtils;

public class Ejercicio_5_5 {

    //Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes.
    //Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".
    public void ejercicio_5_5_1(){
        
        int num1;
        num1 = EntradaUtils.leerNumero(Integer.class, "Ingrese un número del 1 al 12: ");
        switch (num1) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("El número que seleccionaste identifica a un mes");
                break;
        }
    }
    //Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca
    //el usuario. Por ejemplo, si el usuario introduce 3, deberá escribir "tres".
    public void ejercicio_5_5_2(){
        int num1;
        num1 = EntradaUtils.leerNumero(Integer.class, "Ingrese un número del 1 al 10: ");
        switch (num1) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("El número que seleccionaste identifica a un mes");
                break;
        }
    }
}
