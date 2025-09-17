package com.ejemplo;

public class Alumno extends Persona{
    private String curso;

    public Alumno(String nombre, int edad, String gender, String curso){
        super(nombre, edad, gender);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
