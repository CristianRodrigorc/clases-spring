package com.ejemplo;
public class App 
{
    public static void main( String[] args ){

        Alumno alumno1 = new Alumno("cristian", 27, "masculino", "programacion");

        System.out.println("Nombre del Alumno: "+alumno1.getNombre()+"\nEdad del Alumno: "+alumno1.getEdad()+"\nGénero: "+ alumno1.getGender()+"\nCurso: "+alumno1.getCurso());
    }
}