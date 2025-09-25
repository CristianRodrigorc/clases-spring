package ejercicio6;

import utils.EntradaUtils;

public class Ejercicio_6_1 {

        //Crea un programa que muestre los números del 1 al 10, usando "while"
        public void ejercicio_1(){
            int num = 1;
            while (num <= 10) {
                System.out.println(num);
                num++;
            }
        }
        //Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "while"
        public void ejercicio_2(){
            int num = 20;
            while (num>=0 && num % 2 == 0 && num != 0) {
                System.out.println(num);
                num -= 2;
            }
        }
        //Crea un programa que muestre la "tabla de multiplicar del 5", usando "while"
        public void ejercicio_3(){
            int num1, num2, producto;
            num1 = 0;
            num2 = 5;
            while (num1>=0 && num1 <= 12) {
                producto = num2*num1;
                System.out.println(num2+" * "+num1+" = "+producto);
                num1++;
            }
        }
        //Crea un programa que pida al usuario un número entero y muestre su cuadrado. Se repetirá mientras 
        //el usuario introduzca un número distinto de cero.
        public void ejercicio_4(){
            int num1,resultado;
            boolean condition = true;
            do {
                num1 = EntradaUtils.leerNumero(Integer.class, "Ingrese un número entero, si preciona 0 se terminará el programa: ");
                if(num1 == 0){
                    condition =false;
                }else{
                    resultado = (int) Math.pow(num1,2);
                    System.out.println("El número ingresado es \""+num1+"\" y su cuadrado es \""+resultado+"\"");
                }
            } while (condition);
        }
        //Crea un programa que pida al usuario su login (un número entero) y su contraseña (otro número entero).
        //Se repetirá mientras el usuario introduzca un login distinto de "1809" o una contraseña distinta de "1234".
        public void ejercicio_5(){
            int user,pass;
            boolean condition = true;
            do {
                System.out.println("Bienvenido al Login\nDebe ingresar cómo usuario: 1809 y password: 1234 para terminar el login ");
                user = EntradaUtils.leerNumero( Integer.class, "Ingrese un número entero cómo usuario: ");
                pass = EntradaUtils.leerNumero( Integer.class, "Ingrese un número entero cómo password: ");
                if(user == 1809 && pass == 1234){
                    System.out.println("Logín completado...");
                    condition = false;
                }else{
                    System.out.println("Error... Inténtalo otra vez...\n\n\n");
                }
            } while (condition);

        }
        //Crea un programa que pida al usuario su login (un número entero) y su contraseña (otro número entero). Se repetirá mientras
        //el usuario introduzca un login distinto de "1809" o una contraseña distinta de "1234", hasta un máximo de tres veces. 
        //Tras tres fallos, se mostrará un mensaje avisando al usuario de que se le deniega el acceso.
        public void ejercicio_6(){
            int user,pass,contador;
            contador = 3;
            boolean condition = true;
            do {
                System.out.println("Bienvenido al Login\nDebe ingresar cómo usuario: 1809 y password: 1234 para terminar el login ");
                user = EntradaUtils.leerNumero(Integer.class, "Ingrese un número entero cómo usuario: ");
                pass = EntradaUtils.leerNumero(Integer.class, "Ingrese un número entero cómo password: ");
                if(user == 1809 && pass == 1234){
                    System.out.println("Logín completado...");
                    condition = false;
                }else{
                    if(contador > 0){
                        System.out.println("Error... Inténtalo otra vez...\nQuedan "+contador+" intentos\n\n\n");
                        contador--;
                    }else{
                        System.out.println("Intentos superados...\nCerrando el programa");
                        condition = false;
                    }
                }
            } while (condition);
        }
        //Crea un programa que escriba en pantalla tantos asteriscos como el usuario indique, todos ellos en la misma línea.
        public void ejercicio_7(){
            int num1, contador;
            boolean condition = true;
            num1 = EntradaUtils.leerNumero(Integer.class, "Ingrese un número entero: ");
            contador = 0;
            do {
                if(num1 == contador){
                    condition = false;
                }else{
                    System.out.print("*");
                    contador++;
                }
            } while (condition);
        }
}
