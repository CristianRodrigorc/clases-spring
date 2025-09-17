package com.ejemplo;

public class Persona {
    private String nombre;
    private int edad;
    private String gender;

    public Persona(String nombre, int edad, String gender){
        this.nombre = nombre;
        this.edad = edad;
        this.gender = gender;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
